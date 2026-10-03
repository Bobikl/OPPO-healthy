package com.heytap.webpro.core;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import com.heytap.webpro.R$layout;
import com.oplus.aiunit.vision.jq9;
import com.oplus.aiunit.vision.k18;
import com.oplus.aiunit.vision.n2j;
import com.oplus.aiunit.vision.y10;
import com.oplus.aiunit.vision.yni;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0014J\b\u0010\r\u001a\u00020\u0003H\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/heytap/webpro/core/AbstractWebExtActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/oplus/aiunit/vision/jq9;", "", "changeStatubarColor", "initWindowAndDecor", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "onResume", "onBackPressed", "Lcom/heytap/webpro/core/WebProFragment;", "fragment", "pop", "push", "popAll", "top", "popBack", "Lcom/oplus/aiunit/vision/n2j;", "styleFragmentManager", "Lcom/oplus/aiunit/vision/n2j;", "", "webViewToSaveInstanceState", "Z", "getWebViewToSaveInstanceState", "()Z", "setWebViewToSaveInstanceState", "(Z)V", "<init>", "()V", "lib_webpro_release"}, k = 1, mv = {1, 4, 0})
public abstract class AbstractWebExtActivity extends AppCompatActivity implements jq9 {
    private HashMap _$_findViewCache;
    private n2j styleFragmentManager;
    private boolean webViewToSaveInstanceState = true;

    private final void changeStatubarColor() {
        yni yniVar = yni.INSTANCE;
        yniVar.b(this, !yniVar.a(this));
    }

    private final void initWindowAndDecor() {
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        window.setStatusBarColor(0);
        Window window2 = getWindow();
        Intrinsics.checkNotNullExpressionValue(window2, "window");
        View decorView = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        decorView.setSystemUiVisibility(k18.GL_INVALID_ENUM);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap map = this._$_findViewCache;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    public boolean getWebViewToSaveInstanceState() {
        return this.webViewToSaveInstanceState;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        n2j n2jVar = this.styleFragmentManager;
        if (n2jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("styleFragmentManager");
        }
        if (n2jVar.b()) {
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
        setContentView(R$layout.activity_webpro_layout);
        y10.c(this);
        n2j n2jVar = new n2j(this);
        this.styleFragmentManager = n2jVar;
        n2jVar.c(savedInstanceState, getWebViewToSaveInstanceState());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        changeStatubarColor();
    }

    @Override // com.oplus.aiunit.vision.jq9
    public void pop(@NotNull WebProFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        n2j n2jVar = this.styleFragmentManager;
        if (n2jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("styleFragmentManager");
        }
        n2jVar.d(fragment);
    }

    @Override // com.oplus.aiunit.vision.jq9
    public void popAll() {
        finish();
    }

    @Override // com.oplus.aiunit.vision.jq9
    public void popBack() {
        WebProFragment pVar = top();
        if (pVar != null) {
            pop(pVar);
        } else {
            popAll();
        }
    }

    @Override // com.oplus.aiunit.vision.jq9
    public void push(@NotNull WebProFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        n2j n2jVar = this.styleFragmentManager;
        if (n2jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("styleFragmentManager");
        }
        n2jVar.e(fragment);
    }

    public void setWebViewToSaveInstanceState(boolean z) {
        this.webViewToSaveInstanceState = z;
    }

    @Override // com.oplus.aiunit.vision.jq9
    @Nullable
    public WebProFragment top() {
        n2j n2jVar = this.styleFragmentManager;
        if (n2jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("styleFragmentManager");
        }
        return n2jVar.f();
    }
}
