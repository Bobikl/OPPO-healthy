package com.heytap.nearx.uikit.widget.preference;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.preference.PreferenceViewHolder;
import com.heytap.nearx.uikit.R$id;

/* JADX INFO: loaded from: classes18.dex */
public class NearPreferenceUtils {
    static final int DELAY_TIME = 70;

    public static void bindView(PreferenceViewHolder preferenceViewHolder, Drawable drawable, CharSequence charSequence, CharSequence charSequence2) {
        ImageView imageView = (ImageView) preferenceViewHolder.findViewById(R$id.nx_preference_widget_jump);
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
        TextView textView = (TextView) preferenceViewHolder.findViewById(R$id.nx_statusText1);
        if (textView != null) {
            if (TextUtils.isEmpty(charSequence)) {
                textView.setVisibility(8);
            } else {
                textView.setText(charSequence);
                textView.setVisibility(0);
            }
        }
        TextView textView2 = (TextView) preferenceViewHolder.findViewById(R$id.assignment);
        if (textView2 != null) {
            if (TextUtils.isEmpty(charSequence2)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequence2);
                textView2.setVisibility(0);
            }
        }
    }

    public static void setSummaryView(Context context, PreferenceViewHolder preferenceViewHolder) {
        final TextView textView = (TextView) preferenceViewHolder.findViewById(R.id.summary);
        if (textView != null) {
            textView.setHighlightColor(context.getResources().getColor(R.color.transparent));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setOnTouchListener(new View.OnTouchListener() { // from class: com.heytap.nearx.uikit.widget.preference.NearPreferenceUtils.1
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    int actionMasked = motionEvent.getActionMasked();
                    int selectionStart = textView.getSelectionStart();
                    int selectionEnd = textView.getSelectionEnd();
                    int offsetForPosition = textView.getOffsetForPosition(motionEvent.getX(), motionEvent.getY());
                    boolean z = selectionStart == selectionEnd || offsetForPosition <= selectionStart || offsetForPosition >= selectionEnd;
                    if (actionMasked != 0) {
                        if (actionMasked == 1 || actionMasked == 3) {
                            textView.setPressed(false);
                            textView.postInvalidateDelayed(70L);
                        }
                    } else {
                        if (z) {
                            return false;
                        }
                        textView.setPressed(true);
                        textView.invalidate();
                    }
                    return false;
                }
            });
        }
    }

    public static void setSummaryViewColor(Context context, PreferenceViewHolder preferenceViewHolder, ColorStateList colorStateList) {
        TextView textView = (TextView) preferenceViewHolder.findViewById(R.id.summary);
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public static void setSummaryViewForckeDarkAllowed(Context context, PreferenceViewHolder preferenceViewHolder, boolean z) {
        TextView textView = (TextView) preferenceViewHolder.findViewById(R.id.summary);
        if (textView == null || !(textView instanceof TextView)) {
            return;
        }
        textView.setForceDarkAllowed(z);
    }

    public static void setTitleViewColor(Context context, PreferenceViewHolder preferenceViewHolder, ColorStateList colorStateList) {
        TextView textView = (TextView) preferenceViewHolder.findViewById(R.id.title);
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public static void setTitleViewForckeDarkAllowed(Context context, PreferenceViewHolder preferenceViewHolder, boolean z) {
        TextView textView = (TextView) preferenceViewHolder.findViewById(R.id.title);
        if (textView == null || !(textView instanceof TextView)) {
            return;
        }
        textView.setForceDarkAllowed(z);
    }

    public static void bindView(PreferenceViewHolder preferenceViewHolder, Drawable drawable, CharSequence charSequence, CharSequence charSequence2, int i) {
        ImageView imageView = (ImageView) preferenceViewHolder.findViewById(R$id.nx_preference_widget_jump);
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
        TextView textView = (TextView) preferenceViewHolder.findViewById(R$id.nx_statusText1);
        if (textView != null) {
            if (!TextUtils.isEmpty(charSequence)) {
                textView.setText(charSequence);
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
        }
        TextView textView2 = (TextView) preferenceViewHolder.findViewById(R$id.assignment);
        if (textView2 != null) {
            if (!TextUtils.isEmpty(charSequence2)) {
                textView2.setText(charSequence2);
                textView2.setTextColor(i);
                textView2.setVisibility(0);
                return;
            }
            textView2.setVisibility(8);
        }
    }
}
