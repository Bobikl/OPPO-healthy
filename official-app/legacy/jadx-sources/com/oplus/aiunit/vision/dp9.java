package com.oplus.aiunit.vision;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.ColorInt;

/* JADX INFO: loaded from: classes13.dex */
public interface dp9 {
    void setCloseBtnListener(View.OnClickListener onClickListener);

    void setCloseDrawable(Drawable drawable);

    void setNegativeButton(CharSequence charSequence);

    void setNegativeButtonColor(@ColorInt int i);

    void setNegativeButtonListener(View.OnClickListener onClickListener);

    void setPositiveButton(CharSequence charSequence);

    void setPositiveButtonColor(@ColorInt int i);

    void setPositiveButtonListener(View.OnClickListener onClickListener);

    void setStartIcon(Drawable drawable);

    void setTipsText(CharSequence charSequence);

    void setTipsTextColor(@ColorInt int i);
}
