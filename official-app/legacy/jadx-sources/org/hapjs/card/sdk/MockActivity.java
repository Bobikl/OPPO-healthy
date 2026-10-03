package org.hapjs.card.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.InputQueue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes11.dex */
public class MockActivity extends Activity {
    private static final String TAG = "MockActivity";
    private final Context mContext;
    private final Window mWindow;

    public static class MockWindow extends Window {
        public MockWindow(Context context) {
            super(context);
        }

        @Override // android.view.Window
        public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public void closeAllPanels() {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public void closePanel(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public View getCurrentFocus() {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public View getDecorView() {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public LayoutInflater getLayoutInflater() {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public int getNavigationBarColor() {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public int getStatusBarColor() {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public int getVolumeControlStream() {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public void invalidatePanelMenu(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public boolean isFloating() {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public boolean isShortcutKey(int i, KeyEvent keyEvent) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public void onActive() {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public void onConfigurationChanged(Configuration configuration) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public void openPanel(int i, KeyEvent keyEvent) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public View peekDecorView() {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public boolean performContextMenuIdentifierAction(int i, int i2) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public boolean performPanelIdentifierAction(int i, int i2, int i3) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public boolean performPanelShortcut(int i, int i2, KeyEvent keyEvent, int i3) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public void restoreHierarchyState(Bundle bundle) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public Bundle saveHierarchyState() {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public void setBackgroundDrawable(Drawable drawable) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public void setChildDrawable(int i, Drawable drawable) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public void setChildInt(int i, int i2) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public void setContentView(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public void setDecorCaptionShade(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public void setFeatureDrawable(int i, Drawable drawable) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public void setFeatureDrawableAlpha(int i, int i2) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public void setFeatureDrawableResource(int i, int i2) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public void setFeatureDrawableUri(int i, Uri uri) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public void setFeatureInt(int i, int i2) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public void setNavigationBarColor(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public void setResizingCaptionDrawable(Drawable drawable) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public void setStatusBarColor(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public void setTitle(CharSequence charSequence) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public void setTitleColor(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public void setVolumeControlStream(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public boolean superDispatchGenericMotionEvent(MotionEvent motionEvent) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public boolean superDispatchKeyShortcutEvent(KeyEvent keyEvent) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public boolean superDispatchTouchEvent(MotionEvent motionEvent) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public boolean superDispatchTrackballEvent(MotionEvent motionEvent) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public void takeInputQueue(InputQueue.Callback callback) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public void takeKeyEvents(boolean z) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public void takeSurface(SurfaceHolder.Callback2 callback2) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public void togglePanel(int i, KeyEvent keyEvent) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public void setContentView(View view) {
            throw new UnsupportedOperationException();
        }

        @Override // android.view.Window
        public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
            throw new UnsupportedOperationException();
        }
    }

    public MockActivity(Context context) {
        this(context, null);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        return this.mContext.getSystemService(str);
    }

    @Override // android.app.Activity
    public Window getWindow() {
        return this.mWindow;
    }

    @Override // android.app.Activity
    public WindowManager getWindowManager() {
        return (WindowManager) this.mContext.getSystemService("window");
    }

    @Override // android.app.Activity
    public boolean isDestroyed() {
        return false;
    }

    @Override // android.app.Activity
    public boolean isFinishing() {
        return false;
    }

    @Override // android.app.Activity
    @SensorsDataInstrumented
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        PushAutoTrackHelper.onNewIntent(this, intent);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        throw new UnsupportedOperationException();
    }

    public MockActivity(Context context, Window window) {
        this.mContext = context;
        this.mWindow = window == null ? new MockWindow(context) : window;
        attachBaseContext(context);
    }
}
