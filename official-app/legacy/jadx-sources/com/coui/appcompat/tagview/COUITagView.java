package com.coui.appcompat.tagview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.lh2;
import com.support.appcompat.R$color;
import com.support.reddot.R$dimen;
import com.support.reddot.R$id;
import com.support.reddot.R$layout;
import com.support.reddot.R$styleable;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010+\u001a\u00020\u001a¢\u0006\u0004\b,\u0010-B\u001b\b\u0016\u0012\u0006\u0010+\u001a\u00020\u001a\u0012\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b,\u00100B#\b\u0016\u0012\u0006\u0010+\u001a\u00020\u001a\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\u0006\u00101\u001a\u00020\u0004¢\u0006\u0004\b,\u00102J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0004J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0004R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u00018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)¨\u00063"}, d2 = {"Lcom/coui/appcompat/tagview/COUITagView;", "Lcom/coui/appcompat/tagview/COUITagBackgroundView;", "", MapSchema.FIELD_NAME_ENTRY, "", "resId", "setLeftImageResoure", "Landroid/graphics/drawable/Drawable;", ResourcesUtil.ResourceType.DRAWABLE, "setLeftImageDrawable", "Landroid/graphics/Bitmap;", "bitmap", "setLeftImageBitmap", "setImageResoure", "setImageDrawable", "setImageBitmap", "", "tagText", "setTagText", "tagTextColor", "setTagTextColor", "tagTextSize", "setTagTextSize", "x", "I", Const.Arguments.Open.STYLE, "Landroid/content/Context;", "y", "Landroid/content/Context;", "mContext", "z", "Lcom/coui/appcompat/tagview/COUITagBackgroundView;", "tagBackground", "Landroid/widget/ImageView;", "A", "Landroid/widget/ImageView;", "leftImageView", c8l.KEY_B, "imageView", "Landroid/widget/TextView;", "C", "Landroid/widget/TextView;", "tagView", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "coui-support-reddot_release"}, k = 1, mv = {1, 8, 0})
public final class COUITagView extends COUITagBackgroundView {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public ImageView leftImageView;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public ImageView imageView;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public TextView tagView;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public int style;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public Context mContext;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public COUITagBackgroundView tagBackground;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public COUITagView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void e() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.coui_tag_view_layout, (ViewGroup) this, true);
        View viewFindViewById = viewInflate.findViewById(R$id.tagBackground);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "inflate.findViewById(R.id.tagBackground)");
        this.tagBackground = (COUITagBackgroundView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R$id.tagLeftImageView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "inflate.findViewById(R.id.tagLeftImageView)");
        this.leftImageView = (ImageView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R$id.tagImageView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "inflate.findViewById(R.id.tagImageView)");
        this.imageView = (ImageView) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R$id.tagTextView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "inflate.findViewById(R.id.tagTextView)");
        this.tagView = (TextView) viewFindViewById4;
    }

    public final void setImageBitmap(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ImageView imageView = this.imageView;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
            imageView = null;
        }
        imageView.setImageBitmap(bitmap);
        ImageView imageView3 = this.imageView;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
        } else {
            imageView2 = imageView3;
        }
        imageView2.setVisibility(0);
    }

    public final void setImageDrawable(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        ImageView imageView = this.imageView;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
            imageView = null;
        }
        imageView.setImageDrawable(drawable);
        ImageView imageView3 = this.imageView;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
        } else {
            imageView2 = imageView3;
        }
        imageView2.setVisibility(0);
    }

    public final void setImageResoure(int resId) {
        ImageView imageView = this.imageView;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
            imageView = null;
        }
        imageView.setImageResource(resId);
        ImageView imageView3 = this.imageView;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageView");
        } else {
            imageView2 = imageView3;
        }
        imageView2.setVisibility(0);
    }

    public final void setLeftImageBitmap(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ImageView imageView = this.leftImageView;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("leftImageView");
            imageView = null;
        }
        imageView.setImageBitmap(bitmap);
        ImageView imageView3 = this.leftImageView;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("leftImageView");
        } else {
            imageView2 = imageView3;
        }
        imageView2.setVisibility(0);
    }

    public final void setLeftImageDrawable(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        ImageView imageView = this.leftImageView;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("leftImageView");
            imageView = null;
        }
        imageView.setImageDrawable(drawable);
        ImageView imageView3 = this.leftImageView;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("leftImageView");
        } else {
            imageView2 = imageView3;
        }
        imageView2.setVisibility(0);
    }

    public final void setLeftImageResoure(int resId) {
        ImageView imageView = this.leftImageView;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("leftImageView");
            imageView = null;
        }
        imageView.setImageResource(resId);
        ImageView imageView3 = this.leftImageView;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("leftImageView");
        } else {
            imageView2 = imageView3;
        }
        imageView2.setVisibility(0);
    }

    public final void setTagText(@NotNull String tagText) {
        Intrinsics.checkNotNullParameter(tagText, "tagText");
        TextView textView = this.tagView;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tagView");
            textView = null;
        }
        textView.setText(tagText);
        TextView textView3 = this.tagView;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tagView");
        } else {
            textView2 = textView3;
        }
        textView2.setVisibility(0);
    }

    public final void setTagTextColor(int tagTextColor) {
        TextView textView = this.tagView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tagView");
            textView = null;
        }
        textView.setTextColor(tagTextColor);
    }

    public final void setTagTextSize(int tagTextSize) {
        TextView textView = this.tagView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tagView");
            textView = null;
        }
        textView.setTextSize(0, tagTextSize);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public COUITagView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public COUITagView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mContext = context;
        this.style = (attributeSet == null || attributeSet.getStyleAttribute() == 0) ? i : attributeSet.getStyleAttribute();
        e();
        Context context2 = this.mContext;
        Intrinsics.checkNotNull(context2);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R$styleable.COUITagView, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "mContext!!.obtainStyledA…,\n            0\n        )");
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.COUITagView_couiTagViewLeftDrawable);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.COUITagView_couiTagViewLeftDrawableTint, 0);
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(R$styleable.COUITagView_couiDrawableTagViewImage);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.COUITagView_couiDrawableTagViewImageTint, 0);
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.COUITagView_couiTagViewText);
        int color3 = typedArrayObtainStyledAttributes.getColor(R$styleable.COUITagView_couiTagViewTextColor, lh2.h(this.mContext, R$color.coui_color_white));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUITagView_couiTagViewTextSize, context.getResources().getDimensionPixelSize(R$dimen.coui_default_tag_textsize));
        TextView textView = null;
        if (drawable != null) {
            if (color != 0) {
                drawable.setTint(color);
            }
            ImageView imageView = this.leftImageView;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("leftImageView");
                imageView = null;
            }
            imageView.setImageDrawable(drawable);
        } else {
            ImageView imageView2 = this.leftImageView;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("leftImageView");
                imageView2 = null;
            }
            imageView2.setVisibility(8);
        }
        if (drawable2 != null) {
            if (color2 != 0) {
                drawable2.setTint(color2);
            }
            ImageView imageView3 = this.imageView;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageView");
                imageView3 = null;
            }
            imageView3.setImageDrawable(drawable2);
        } else {
            ImageView imageView4 = this.imageView;
            if (imageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageView");
                imageView4 = null;
            }
            imageView4.setVisibility(8);
        }
        if (string != null) {
            TextView textView2 = this.tagView;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tagView");
                textView2 = null;
            }
            textView2.setText(string);
        } else {
            TextView textView3 = this.tagView;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tagView");
                textView3 = null;
            }
            textView3.setVisibility(8);
        }
        TextView textView4 = this.tagView;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tagView");
            textView4 = null;
        }
        textView4.setTextColor(color3);
        TextView textView5 = this.tagView;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tagView");
        } else {
            textView = textView5;
        }
        textView.setTextSize(0, dimensionPixelSize);
        typedArrayObtainStyledAttributes.recycle();
    }
}
