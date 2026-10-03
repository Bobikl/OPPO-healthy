package com.heytap.webview.extension.activity;

import android.content.res.Configuration;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.heytap.webview.extension.R;
import com.heytap.webview.extension.fragment.WebExtFragment;
import com.heytap.webview.extension.utils.StatusBarUtil;
import com.oplus.aiunit.vision.k18;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\rH\u0014J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\rH\u0016J\b\u0010\u001b\u001a\u00020\rH\u0016J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/heytap/webview/extension/activity/AbstractWebExtActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/heytap/webview/extension/activity/IFragmentHostInterface;", "()V", "styleFragmentManager", "Lcom/heytap/webview/extension/activity/StyleFragmentManager;", "webViewToSaveInstanceState", "", "getWebViewToSaveInstanceState", "()Z", "setWebViewToSaveInstanceState", "(Z)V", "changeStatubarColor", "", "initWindowAndDecor", "onBackPressed", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "pop", "fragment", "Lcom/heytap/webview/extension/fragment/WebExtFragment;", "popAll", "popBack", "push", "top", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AbstractWebExtActivity extends AppCompatActivity implements IFragmentHostInterface {
    private StyleFragmentManager styleFragmentManager;
    private boolean webViewToSaveInstanceState = true;

    private final void changeStatubarColor() {
        StatusBarUtil statusBarUtil = StatusBarUtil.INSTANCE;
        statusBarUtil.setDarkMode(this, !statusBarUtil.isNightMode(this));
    }

    private final void initWindowAndDecor() {
        getWindow().setStatusBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(k18.GL_INVALID_ENUM);
    }

    public boolean getWebViewToSaveInstanceState() {
        return this.webViewToSaveInstanceState;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        StyleFragmentManager styleFragmentManager = this.styleFragmentManager;
        if (styleFragmentManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("styleFragmentManager");
            styleFragmentManager = null;
        }
        if (styleFragmentManager.onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        changeStatubarColor();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        initWindowAndDecor();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webext_layout);
        AndroidBug5497Workaround.assistActivity(this);
        StyleFragmentManager styleFragmentManager = new StyleFragmentManager(this);
        this.styleFragmentManager = styleFragmentManager;
        styleFragmentManager.onInitInstanceState(savedInstanceState, getWebViewToSaveInstanceState());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        changeStatubarColor();
    }

    @Override // com.heytap.webview.extension.activity.IFragmentHostInterface
    public void pop(@NotNull WebExtFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        StyleFragmentManager styleFragmentManager = this.styleFragmentManager;
        if (styleFragmentManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("styleFragmentManager");
            styleFragmentManager = null;
        }
        styleFragmentManager.pop(fragment);
    }

    @Override // com.heytap.webview.extension.activity.IFragmentHostInterface
    public void popAll() {
        finish();
    }

    @Override // com.heytap.webview.extension.activity.IFragmentHostInterface
    public void popBack() {
        Unit unit;
        WebExtFragment pVar = top();
        if (pVar != null) {
            pop(pVar);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            popAll();
        }
    }

    @Override // com.heytap.webview.extension.activity.IFragmentHostInterface
    public void push(@NotNull WebExtFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        StyleFragmentManager styleFragmentManager = this.styleFragmentManager;
        if (styleFragmentManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("styleFragmentManager");
            styleFragmentManager = null;
        }
        styleFragmentManager.push(fragment);
    }

    public void setWebViewToSaveInstanceState(boolean z) {
        this.webViewToSaveInstanceState = z;
    }

    @Override // com.heytap.webview.extension.activity.IFragmentHostInterface
    @Nullable
    public WebExtFragment top() {
        StyleFragmentManager styleFragmentManager = this.styleFragmentManager;
        if (styleFragmentManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("styleFragmentManager");
            styleFragmentManager = null;
        }
        return styleFragmentManager.top();
    }
}
