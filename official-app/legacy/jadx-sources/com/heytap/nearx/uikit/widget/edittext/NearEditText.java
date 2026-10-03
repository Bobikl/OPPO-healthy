package com.heytap.nearx.uikit.widget.edittext;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatEditText;

/* JADX INFO: loaded from: classes18.dex */
public class NearEditText extends AppCompatEditText {

    public interface OnErrorStateChangedListener {
        void onErrorStateChangeAnimationEnd(boolean z);

        void onErrorStateChanged(boolean z);
    }

    public interface OnPasswordDeletedListener {
        boolean onPasswordDeleted();
    }

    public interface OnTextDeletedListener {
        boolean onTextDeleted();
    }

    public NearEditText(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
    }

    public void addOnErrorStateChangedListener(OnErrorStateChangedListener onErrorStateChangedListener) {
    }

    public Drawable getDeleteNormalDrawable() {
        return null;
    }

    public Drawable getDeletePressedDrawable() {
        return null;
    }

    public int getRefreshStyle() {
        return 0;
    }

    public NearEditTextUIAndHintUtil getUiAndHintUtil() {
        return null;
    }

    public void setErrorState(boolean z) {
    }

    public void setNearEditTextNoEllipsisText(String str) {
    }

    public void setTopHint(CharSequence charSequence) {
    }

    public boolean superDispatchHoverEvent(MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent);
    }

    public void superDrawableStateChanged() {
        super.drawableStateChanged();
    }

    public boolean superOnKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public boolean superOnTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public NearEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NearEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        post(new Runnable() { // from class: com.oplus.aiunit.vision.zhc
            @Override // java.lang.Runnable
            public final void run() {
                this.i.lambda$new$0();
            }
        });
    }
}
