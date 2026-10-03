package com.oplus.aiunit.vision;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.preference.PreferenceViewHolder;
import com.coui.appcompat.imageview.COUIRoundImageView;
import com.support.preference.R$dimen;
import com.support.preference.R$id;

/* JADX INFO: loaded from: classes13.dex */
public class bk2 {
    public static final int ICON_SIZE_DP_LARGE = 50;
    public static final int ICON_SIZE_DP_MEDIUM = 32;
    public static final int ICON_SIZE_DP_MEDIUM_LARGE = 36;
    public static final int ICON_SIZE_DP_SMALL = 24;

    public class a implements View.OnTouchListener {
        public final /* synthetic */ TextView i;

        public a(TextView textView) {
            this.i = textView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            int selectionStart = this.i.getSelectionStart();
            int selectionEnd = this.i.getSelectionEnd();
            int offsetForPosition = this.i.getOffsetForPosition(motionEvent.getX(), motionEvent.getY());
            boolean z = selectionStart == selectionEnd || offsetForPosition <= selectionStart || offsetForPosition >= selectionEnd;
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.i.setPressed(false);
                    this.i.postInvalidateDelayed(70L);
                }
            } else {
                if (z) {
                    return false;
                }
                this.i.setPressed(true);
                this.i.invalidate();
            }
            return false;
        }
    }

    public static void a(PreferenceViewHolder preferenceViewHolder, CharSequence charSequence, int i) {
        TextView textView = (TextView) preferenceViewHolder.findViewById(R$id.assignment);
        if (textView != null) {
            if (TextUtils.isEmpty(charSequence)) {
                textView.setVisibility(8);
                return;
            }
            textView.setText(charSequence);
            textView.setVisibility(0);
            if (i != 0) {
                textView.setTextColor(i);
            }
        }
    }

    public static void b(PreferenceViewHolder preferenceViewHolder, Drawable drawable, CharSequence charSequence, CharSequence charSequence2) {
        c(preferenceViewHolder, drawable, charSequence, charSequence2, 0);
    }

    public static void c(PreferenceViewHolder preferenceViewHolder, Drawable drawable, CharSequence charSequence, CharSequence charSequence2, int i) {
        ImageView imageView = (ImageView) preferenceViewHolder.findViewById(R$id.coui_preference_widget_jump);
        if (imageView != null) {
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        View viewFindViewById = preferenceViewHolder.findViewById(R.id.icon);
        View viewFindViewById2 = preferenceViewHolder.findViewById(R$id.img_layout);
        if (viewFindViewById2 != null) {
            if (viewFindViewById != null) {
                viewFindViewById2.setVisibility(viewFindViewById.getVisibility());
            } else {
                viewFindViewById2.setVisibility(8);
            }
        }
        TextView textView = (TextView) preferenceViewHolder.findViewById(R$id.coui_statusText1);
        if (textView != null) {
            if (TextUtils.isEmpty(charSequence)) {
                textView.setVisibility(8);
            } else {
                textView.setText(charSequence);
                textView.setVisibility(0);
            }
        }
        a(preferenceViewHolder, charSequence2, i);
    }

    public static void d(PreferenceViewHolder preferenceViewHolder, Context context, int i, boolean z, int i2, boolean z2) {
        View viewFindViewById = preferenceViewHolder.findViewById(R.id.icon);
        if (viewFindViewById == null || !(viewFindViewById instanceof COUIRoundImageView)) {
            return;
        }
        if (z2) {
            COUIRoundImageView cOUIRoundImageView = (COUIRoundImageView) viewFindViewById;
            cOUIRoundImageView.setHasBorder(z);
            cOUIRoundImageView.setBorderRectRadius(0);
            cOUIRoundImageView.setType(i2);
            return;
        }
        COUIRoundImageView cOUIRoundImageView2 = (COUIRoundImageView) viewFindViewById;
        Drawable drawable = cOUIRoundImageView2.getDrawable();
        if (drawable != null && i == 14) {
            i = drawable.getIntrinsicHeight() / 6;
            Resources resources = context.getResources();
            int i3 = R$dimen.coui_preference_icon_min_radius;
            if (i < resources.getDimensionPixelOffset(i3)) {
                i = context.getResources().getDimensionPixelOffset(i3);
            } else {
                Resources resources2 = context.getResources();
                int i4 = R$dimen.coui_preference_icon_max_radius;
                if (i > resources2.getDimensionPixelOffset(i4)) {
                    i = context.getResources().getDimensionPixelOffset(i4);
                }
            }
        }
        cOUIRoundImageView2.setHasBorder(z);
        cOUIRoundImageView2.setBorderRectRadius(i);
        cOUIRoundImageView2.setType(i2);
    }

    public static void e(Context context, PreferenceViewHolder preferenceViewHolder) {
        TextView textView = (TextView) preferenceViewHolder.findViewById(R.id.summary);
        if (textView != null) {
            textView.setHighlightColor(context.getResources().getColor(R.color.transparent));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setOnTouchListener(new a(textView));
        }
    }

    public static void f(PreferenceViewHolder preferenceViewHolder, ColorStateList colorStateList) {
        TextView textView = (TextView) preferenceViewHolder.findViewById(R.id.summary);
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public static void g(Context context, PreferenceViewHolder preferenceViewHolder, ColorStateList colorStateList) {
        View viewFindViewById = preferenceViewHolder.findViewById(R.id.title);
        if (viewFindViewById == null || colorStateList == null) {
            return;
        }
        ((TextView) viewFindViewById).setTextColor(colorStateList);
    }
}
