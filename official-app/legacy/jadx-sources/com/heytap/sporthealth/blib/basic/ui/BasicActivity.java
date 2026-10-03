package com.heytap.sporthealth.blib.basic.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.ui.R$id;
import com.heytap.health.ui.R$layout;
import com.heytap.health.ui.R$string;
import com.heytap.health.ui.R$style;
import com.heytap.sporthealth.blib.basic.BasicViewModel;
import com.heytap.sporthealth.blib.basic.ParamVewModelFactory;
import com.heytap.sporthealth.blib.data.NetResult;
import com.heytap.sporthealth.blib.weiget.jlayout.MultiStateLayout;
import com.oplus.aiunit.vision.bjd;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.f30;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.o14;
import com.oplus.aiunit.vision.ph2;
import com.oplus.aiunit.vision.rpc;
import com.oplus.aiunit.vision.su8;
import com.oplus.aiunit.vision.xd2;
import com.oplus.aiunit.vision.xs3;
import com.oplus.aiunit.vision.yha;
import io.reactivex.rxjava3.disposables.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BasicActivity<VM extends BasicViewModel<DA>, DA> extends BaseActivity implements bjd, MessageQueue.IdleHandler {
    public VM m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public MultiStateLayout f7703n;
    public Toolbar o;
    public xs3 p = new xs3();
    public TextView q;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ View D7(int i, Integer num) throws Throwable {
        return LayoutInflater.from(this).inflate(i, (ViewGroup) this.f7703n, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E7(View view) throws Throwable {
        this.f7703n.addView(view, -1, -1);
        G7();
        if (u7()) {
            ViewGroup.LayoutParams layoutParams = this.f7703n.getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) layoutParams).topToTop = 0;
            }
        }
    }

    private void F7(Class<VM> cls) {
        if (U7()) {
            this.m = (VM) new ViewModelProvider(this, new ParamVewModelFactory(H7())).get(cls);
        } else {
            this.m = (VM) new ViewModelProvider(this).get(cls);
        }
    }

    public void A() {
        MultiStateLayout multiStateLayout = this.f7703n;
        if (multiStateLayout != null) {
            multiStateLayout.r();
        }
    }

    public void A7() {
        this.m.w().observe(this, new Observer() { // from class: com.oplus.aiunit.vision.bb1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.n7((NetResult) obj);
            }
        });
    }

    public void B7() {
    }

    public boolean C7() {
        MultiStateLayout multiStateLayout = this.f7703n;
        if (multiStateLayout != null) {
            return multiStateLayout.j();
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.bjd
    public void D4() {
    }

    public final void G7() {
        T7();
        initView();
        Looper.myQueue().addIdleHandler(this);
    }

    public void H4() {
        MultiStateLayout multiStateLayout = this.f7703n;
        if (multiStateLayout != null) {
            multiStateLayout.n();
        }
    }

    public Object H7() {
        return "";
    }

    public abstract Class<VM> I7();

    public void J7() {
        VM vm = this.m;
        if (vm != null) {
            vm.B(H7());
        } else {
            Q7(null);
        }
    }

    public abstract int K7();

    public int L7() {
        return t7() ? R$layout.fit_basic_title_state_layout : R$layout.fit_state_basic_layout;
    }

    public void M7(NetResult<DA> netResult) {
        if (this.f7703n != null) {
            if (TextUtils.isEmpty(netResult.message)) {
                this.f7703n.setEmptyTips(getString(R$string.fit_no_message));
            } else {
                this.f7703n.setEmptyTips(netResult.message);
            }
            H4();
        }
    }

    public void N7() {
        MultiStateLayout multiStateLayout = this.f7703n;
        if (multiStateLayout != null) {
            multiStateLayout.o();
        }
    }

    public final void O7(int i) {
        TextView textView = this.q;
        if (textView != null) {
            textView.setText(i);
            N7();
            return;
        }
        N7();
        TextView textView2 = (TextView) this.f7703n.findViewById(R$id.fit_tv_error_desc);
        this.q = textView2;
        if (textView2 != null) {
            textView2.setText(i);
        }
    }

    public void P7(NetResult<DA> netResult) {
        if (this.f7703n != null) {
            yha.c(netResult.message);
            if (rpc.c()) {
                this.f7703n.setErrorTips(getString(com.heytap.health.base.R$string.lib_base_server_error));
                O7(com.heytap.health.base.R$string.lib_base_server_error_tips);
            } else {
                this.f7703n.setErrorTips(getString(com.heytap.health.base.R$string.lib_base_network_error));
                O7(com.heytap.health.base.R$string.lib_base_network_error_tips);
            }
        }
    }

    @CallSuper
    public void Q7(DA da) {
        setTitle(R7());
        MultiStateLayout multiStateLayout = this.f7703n;
        if (multiStateLayout != null) {
            multiStateLayout.s();
        }
    }

    public CharSequence R7() {
        return "";
    }

    public boolean S7() {
        return true;
    }

    public final void T7() {
        if (this.o == null) {
            Toolbar toolbar = (Toolbar) findViewById(s7());
            this.o = toolbar;
            if (toolbar != null) {
                setTitle(R7());
                x7(this.o);
                setSupportActionBar(this.o);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }
        }
    }

    public boolean U7() {
        return false;
    }

    @Override // com.oplus.aiunit.vision.az0
    public final boolean e4(BaseActivity baseActivity) {
        return v7();
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (!S7()) {
            return super.getResources();
        }
        Resources resources = super.getResources();
        Configuration configuration = resources.getConfiguration();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (configuration.fontScale == 1.0f) {
            return resources;
        }
        configuration.fontScale = 1.0f;
        Resources resources2 = createConfigurationContext(configuration).getResources();
        displayMetrics.scaledDensity = displayMetrics.density * configuration.fontScale;
        return resources2;
    }

    @Override // com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    public abstract void initView();

    @Override // com.oplus.aiunit.vision.az0
    public boolean m1() {
        return super.m1();
    }

    public void n7(NetResult<DA> netResult) {
        if (netResult.isSucceed()) {
            Q7(netResult.body);
            return;
        }
        if (netResult.isShowLoading()) {
            A();
        } else if (netResult.isEmpty()) {
            M7(netResult);
        } else {
            P7(netResult);
        }
    }

    public void o7(@Nullable Intent intent) {
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        int iW7 = w7();
        if (iW7 != 0) {
            setTheme(iW7);
        }
        o7(getIntent());
        super.onCreate(bundle);
        Class<VM> clsI7 = I7();
        if (clsI7 != null) {
            F7(clsI7);
        }
        B7();
        z7(null);
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        q7();
    }

    @Override // com.heytap.health.base.base.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public boolean p7() {
        return true;
    }

    public void q7() {
        this.p.f();
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        if (!p7()) {
            return false;
        }
        if (this.m == null) {
            Q7(null);
            return false;
        }
        A7();
        if (U7() || C7()) {
            return false;
        }
        J7();
        return false;
    }

    public void r7(a aVar) {
        this.p.a(aVar);
    }

    public int s7() {
        return R$id.fit_toolbar;
    }

    @Override // android.app.Activity
    public void setTitle(CharSequence charSequence) {
        Toolbar toolbar = this.o;
        if (toolbar == null) {
            super.setTitle(charSequence);
        } else {
            toolbar.setTitle(charSequence);
        }
    }

    public boolean t7() {
        return true;
    }

    public boolean u7() {
        return false;
    }

    @Override // com.oplus.aiunit.vision.bjd
    public void v1(int i) {
        J7();
    }

    public boolean v7() {
        return !ph2.a(this);
    }

    public int w7() {
        return R$style.FitPluginTheme;
    }

    public void x7(Toolbar toolbar) {
    }

    public boolean y7() {
        return true;
    }

    @SuppressLint({"AutoDispose", "CheckResult"})
    public final void z7(View view) {
        if (view == null) {
            setContentView(L7());
        } else {
            setContentView(view);
        }
        T7();
        MultiStateLayout multiStateLayout = (MultiStateLayout) findViewById(R$id.mstate);
        this.f7703n = multiStateLayout;
        if (multiStateLayout == null) {
            G7();
            return;
        }
        multiStateLayout.m(this);
        final int iK7 = K7();
        if (iK7 == 0) {
            G7();
            return;
        }
        lbd lbdVarJ0 = lbd.h0(0).j0(new d08() { // from class: com.oplus.aiunit.vision.cb1
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return this.i.D7(iK7, (Integer) obj);
            }
        });
        if (y7()) {
            lbdVarJ0 = lbdVarJ0.L0(su8.e()).n0(f30.c());
        }
        r7(lbdVarJ0.b(new o14() { // from class: com.oplus.aiunit.vision.db1
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                this.i.E7((View) obj);
            }
        }, new xd2()));
    }
}
