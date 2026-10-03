package com.badlogic.gdx.backends.android;

import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.AutoCompleteTextView;
import android.widget.RelativeLayout;
import com.oplus.aiunit.vision.r35;
import com.oplus.aiunit.vision.x38;
import com.oplus.weatherservicesdk.data.Weather;

/* JADX INFO: loaded from: classes13.dex */
class DefaultAndroidInput$6 extends AutoCompleteTextView {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ RelativeLayout f1201j;
    public final /* synthetic */ r35 k;

    public class a extends InputConnectionWrapper {
        public a(InputConnection inputConnection, boolean z) {
            super(inputConnection, z);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean sendKeyEvent(KeyEvent keyEvent) {
            if (DefaultAndroidInput$6.this.k.j0 && keyEvent.getAction() == 0) {
                if (keyEvent.getKeyCode() == 67) {
                    super.deleteSurroundingText(1, 0);
                    return true;
                }
                if (keyEvent.getKeyCode() == 66) {
                    commitText(Weather.SEPARATOR, 0);
                    return true;
                }
            }
            return super.sendKeyEvent(keyEvent);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new a(super.onCreateInputConnection(editorInfo), true);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.Filter.FilterListener
    public void onFilterComplete(int i) {
        this.i = i;
        super.onFilterComplete(i);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            x38.input.b(false);
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        int height = this.i * 165;
        if (height > (this.f1201j.getHeight() + this.f1201j.getY()) - getHeight()) {
            height = (int) ((this.f1201j.getHeight() + this.f1201j.getY()) - getHeight());
        }
        if (height > 0) {
            setDropDownHeight(height);
        }
        setDropDownVerticalOffset((-getDropDownHeight()) - getHeight());
        setDropDownWidth((int) (getWidth() * this.f1201j.getScaleX()));
        super.showDropDown();
    }
}
