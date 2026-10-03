package com.heytap.health.base.base;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.heytap.health.base.R$string;
import com.heytap.health.base.resposiveui.config.a;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.az0;
import com.oplus.aiunit.vision.bp;
import com.oplus.aiunit.vision.bz0;
import com.oplus.aiunit.vision.cz0;
import com.oplus.aiunit.vision.d95;
import com.oplus.aiunit.vision.dz0;
import com.oplus.aiunit.vision.ejg;
import com.oplus.aiunit.vision.qk2;
import com.oplus.aiunit.vision.vy0;
import com.oplus.aiunit.vision.yy0;

/* JADX INFO: loaded from: classes15.dex */
public abstract class BaseActivity extends AppCompatActivity implements BaseViewSizeControl, az0, bz0, vy0, cz0, yy0, dz0 {
    public static boolean isExpanded = false;

    @Deprecated
    public COUIToolbar i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AlertDialog f3157j;
    public volatile boolean k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3158l = -1;

    public boolean c7() {
        return false;
    }

    public void d7() {
        AlertDialog alertDialog;
        if (isFinishing() || (alertDialog = this.f3157j) == null || !alertDialog.isShowing()) {
            return;
        }
        this.f3157j.dismiss();
        this.f3157j = null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        try {
            return super.dispatchKeyEvent(keyEvent);
        } catch (IllegalStateException e2) {
            a7b.c("BaseActivity", "dispatchKeyEvent: " + e2.getMessage(), e2);
            return false;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        j6();
        return super.dispatchTouchEvent(motionEvent);
    }

    public float e7() {
        if (!isInMultiWindowMode() || ejg.c() == 0) {
            return 1.0f;
        }
        return Math.min((ejg.f(getBaseContext()) * 1.0f) / (ejg.c() * 0.6f), 1.0f);
    }

    @Deprecated
    public void f7(COUIToolbar cOUIToolbar, boolean z) {
        R1(this, cOUIToolbar, z);
    }

    public boolean g7() {
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = super.getResources();
        int i = resources.getDisplayMetrics().widthPixels;
        if (this.k || i != this.f3158l) {
            if (g7()) {
                h7(resources);
            } else {
                F0(resources, this);
            }
            this.k = false;
            this.f3158l = i;
        }
        return resources;
    }

    public void h7(Resources resources) {
        if (resources != null) {
            Configuration configuration = resources.getConfiguration();
            if (d95.e(resources.getDisplayMetrics().widthPixels, configuration, this, (int) (d95.b() * e7()))) {
                resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            }
        }
    }

    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    public void i7() {
        j7(getString(R$string.lib_common_loading));
    }

    public void j7(String str) {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        AlertDialog alertDialog = this.f3157j;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.f3157j.dismiss();
        }
        AlertDialog alertDialogI = new qk2(this, str).i();
        this.f3157j = alertDialogI;
        alertDialogI.setCancelable(false);
        this.f3157j.setCanceledOnTouchOutside(false);
    }

    public void k7(Class<? extends Activity> cls) {
        startActivity(new Intent(this, cls));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        v3();
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        this.k = true;
        super.onConfigurationChanged(configuration);
        a.m(this).v(configuration);
        if (c7()) {
            return;
        }
        r5(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        a7b.f(getClass().getSimpleName(), "onCreate()");
        z1(this);
        r5(this);
        f3(this);
        L2(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        a7b.f(getClass().getSimpleName(), "onDestroy()");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.k = true;
        super.onMultiWindowModeChanged(z, configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        a7b.f(getClass().getSimpleName(), "onNewIntent()");
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (Z3()) {
            onBackPressed();
            return true;
        }
        finish();
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        a7b.f(getClass().getSimpleName(), "onPause()");
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(@NonNull Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        a7b.f(getClass().getSimpleName(), "onRestoreInstanceState()");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        a7b.f(getClass().getSimpleName(), "onResume()");
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        a7b.f(getClass().getSimpleName(), "onSaveInstanceState()");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        a7b.f(getClass().getSimpleName(), "onStart()");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        a7b.f(getClass().getSimpleName(), "onStop()");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        View viewInflate = LayoutInflater.from(this).inflate(i, (ViewGroup) null);
        handleContentView(viewInflate);
        U5(this, viewInflate);
        super.setContentView(viewInflate);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent, @Nullable Bundle bundle) {
        if (bp.b(intent)) {
            return;
        }
        super.startActivity(intent, bundle);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i, @Nullable Bundle bundle) {
        if (bp.b(intent)) {
            return;
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void startActivityFromFragment(@NonNull Fragment fragment, Intent intent, int i, @Nullable Bundle bundle) {
        if (bp.b(intent)) {
            return;
        }
        super.startActivityFromFragment(fragment, intent, i, bundle);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        handleContentView(view);
        U5(this, view);
        super.setContentView(view);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        handleContentView(view);
        U5(this, view);
        super.setContentView(view, layoutParams);
    }
}
