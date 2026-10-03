package com.oplus.aiunit.vision;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* JADX INFO: loaded from: classes10.dex */
public class ocm extends InputConnectionWrapper {
    public static String a = null;
    public static boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f14891c = false;

    public ocm(InputConnection inputConnection, boolean z) {
        super(inputConnection, z);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i) {
        f14891c = true;
        a = charSequence.toString();
        q8g.j("openSDK_LOG.CaptureInputConnection", "-->commitText: " + charSequence.toString());
        return super.commitText(charSequence, i);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            q8g.i("openSDK_LOG.CaptureInputConnection", "sendKeyEvent");
            a = String.valueOf((char) keyEvent.getUnicodeChar());
            f14891c = true;
            q8g.d("openSDK_LOG.CaptureInputConnection", "s: " + a);
        }
        q8g.d("openSDK_LOG.CaptureInputConnection", "-->sendKeyEvent: " + a);
        return super.sendKeyEvent(keyEvent);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i) {
        f14891c = true;
        a = charSequence.toString();
        q8g.j("openSDK_LOG.CaptureInputConnection", "-->setComposingText: " + charSequence.toString());
        return super.setComposingText(charSequence, i);
    }
}
