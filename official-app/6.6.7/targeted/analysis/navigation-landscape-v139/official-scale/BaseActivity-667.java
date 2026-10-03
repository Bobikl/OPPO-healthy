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
import com.oplus.aiunit.vision.el2;
import com.oplus.aiunit.vision.jp;
import com.oplus.aiunit.vision.jz0;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.mz0;
import com.oplus.aiunit.vision.oz0;
import com.oplus.aiunit.vision.pz0;
import com.oplus.aiunit.vision.qmg;
import com.oplus.aiunit.vision.qz0;
import com.oplus.aiunit.vision.rz0;
import com.oplus.aiunit.vision.y95;

/* JADX INFO: loaded from: classes15.dex */
public abstract class BaseActivity extends AppCompatActivity implements BaseViewSizeControl, oz0, pz0, jz0, qz0, mz0, rz0 {
    public static boolean isExpanded = false;

    @Deprecated
    public COUIToolbar i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AlertDialog f4195j;
    public volatile boolean k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4196l = -1;

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        try {
            return super.dispatchKeyEvent(keyEvent);
        } catch (IllegalStateException e2) {
            m8b.c("BaseActivity", "dispatchKeyEvent: " + e2.getMessage(), e2);
            return false;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m6();
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean f7() {
        return false;
    }

    public void g7() {
        AlertDialog alertDialog;
        if (isFinishing() || (alertDialog = this.f4195j) == null || !alertDialog.isShowing()) {
            return;
        }
        this.f4195j.dismiss();
        this.f4195j = null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = super.getResources();
        int i = resources.getDisplayMetrics().widthPixels;
        if (this.k || i != this.f4196l) {
            if (j7()) {
                k7(resources);
            } else {
                F0(resources, this);
            }
            this.k = false;
            this.f4196l = i;
        }
        return resources;
    }

    public float h7() {
        if (!isInMultiWindowMode() || qmg.c() == 0) {
            return 1.0f;
        }
        return Math.min((qmg.f(getBaseContext()) * 1.0f) / (qmg.c() * 0.6f), 1.0f);
    }

    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Deprecated
    public void i7(COUIToolbar cOUIToolbar, boolean z) {
        S1(this, cOUIToolbar, z);
    }

    public boolean j7() {
        return false;
    }

    public void k7(Resources resources) {
        if (resources != null) {
            Configuration configuration = resources.getConfiguration();
            if (y95.e(resources.getDisplayMetrics().widthPixels, configuration, this, (int) (y95.b() * h7()))) {
                resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            }
        }
    }

    public void l7() {
        m7(getString(R$string.lib_common_loading));
    }

    public void m7(String str) {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        AlertDialog alertDialog = this.f4195j;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.f4195j.dismiss();
        }
        AlertDialog alertDialogI = new el2(this, str).i();
        this.f4195j = alertDialogI;
        alertDialogI.setCancelable(false);
        this.f4195j.setCanceledOnTouchOutside(false);
    }

    public void n7(Class<? extends Activity> cls) {
        startActivity(new Intent(this, cls));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        w3();
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        this.k = true;
        super.onConfigurationChanged(configuration);
        a.m(this).v(configuration);
        if (f7()) {
            return;
        }
        t5(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        m8b.f(getClass().getSimpleName(), "onCreate()");
        A1(this);
        t5(this);
        g3(this);
        M2(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m8b.f(getClass().getSimpleName(), "onDestroy()");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.k = true;
        super.onMultiWindowModeChanged(z, configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m8b.f(getClass().getSimpleName(), "onNewIntent()");
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (a4()) {
            onBackPressed();
            return true;
        }
        finish();
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        m8b.f(getClass().getSimpleName(), "onPause()");
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(@NonNull Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        m8b.f(getClass().getSimpleName(), "onRestoreInstanceState()");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m8b.f(getClass().getSimpleName(), "onResume()");
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m8b.f(getClass().getSimpleName(), "onSaveInstanceState()");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        m8b.f(getClass().getSimpleName(), "onStart()");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        m8b.f(getClass().getSimpleName(), "onStop()");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        View viewInflate = LayoutInflater.from(this).inflate(i, (ViewGroup) null);
        handleContentView(viewInflate);
        X5(this, viewInflate);
        super.setContentView(viewInflate);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent, @Nullable Bundle bundle) {
        if (jp.b(intent)) {
            return;
        }
        super.startActivity(intent, bundle);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i, @Nullable Bundle bundle) {
        if (jp.b(intent)) {
            return;
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void startActivityFromFragment(@NonNull Fragment fragment, Intent intent, int i, @Nullable Bundle bundle) {
        if (jp.b(intent)) {
            return;
        }
        super.startActivityFromFragment(fragment, intent, i, bundle);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        handleContentView(view);
        X5(this, view);
        super.setContentView(view);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        handleContentView(view);
        X5(this, view);
        super.setContentView(view, layoutParams);
    }
}