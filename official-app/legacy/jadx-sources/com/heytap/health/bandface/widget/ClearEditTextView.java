package com.heytap.health.bandface.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.ContextCompat;
import com.heytap.health.bandface.R$drawable;

/* JADX INFO: loaded from: classes15.dex */
public class ClearEditTextView extends AppCompatEditText implements View.OnFocusChangeListener, TextWatcher {
    public Drawable i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f3153j;

    public interface a {
        void afterTextChanged(Editable editable);

        void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3);

        void onTextChanged(CharSequence charSequence, int i, int i2, int i3);
    }

    public ClearEditTextView(Context context) {
        this(context, null);
    }

    private void setClearIcon(boolean z) {
        setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], z ? this.i : null, getCompoundDrawables()[3]);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        a aVar = this.f3153j;
        if (aVar != null) {
            aVar.afterTextChanged(editable);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        a aVar = this.f3153j;
        if (aVar != null) {
            aVar.beforeTextChanged(charSequence, i, i2, i3);
        }
    }

    public final void d() {
        Drawable drawable = ContextCompat.getDrawable(getContext(), R$drawable.band_editext_clear);
        this.i = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.i.getIntrinsicHeight());
        setClearIcon(false);
        setOnFocusChangeListener(this);
        addTextChangedListener(this);
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        if (z) {
            setClearIcon(getText().length() > 0);
        } else {
            setClearIcon(false);
        }
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        setClearIcon(charSequence.length() > 0);
        a aVar = this.f3153j;
        if (aVar != null) {
            aVar.onTextChanged(charSequence, i, i2, i3);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getCompoundDrawables()[2] != null) {
            if (motionEvent.getAction() == 1) {
                boolean z = motionEvent.getX() > ((float) ((getWidth() - getPaddingRight()) - this.i.getIntrinsicWidth())) && motionEvent.getX() < ((float) (getWidth() - getPaddingRight()));
                boolean z2 = motionEvent.getY() > ((float) (getHeight() - this.i.getIntrinsicHeight())) / 2.0f && motionEvent.getY() < ((float) (getHeight() + this.i.getIntrinsicHeight())) / 2.0f;
                if (z && z2) {
                    setText("");
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setTextWatcher(a aVar) {
        this.f3153j = aVar;
    }

    public ClearEditTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public ClearEditTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d();
    }
}
