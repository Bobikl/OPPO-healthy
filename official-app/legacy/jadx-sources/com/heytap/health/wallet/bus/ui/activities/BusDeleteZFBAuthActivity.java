package com.heytap.health.wallet.bus.ui.activities;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alipay.sdk.app.AuthTask;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.heytap.health.base.R$id;
import com.heytap.health.base.ui.dialog.HealthAlertDialogBuilder;
import com.heytap.health.base.ui.widget.HealthButton;
import com.heytap.health.wallet.bus.R$layout;
import com.heytap.health.wallet.bus.ui.activities.BusDeleteZFBAuthActivity;
import com.heytap.health.wallet.network.ErrorResponse;
import com.heytap.health.wallet.network.bus.rsp.AuthResult;
import com.heytap.wallet.business.bus.vmodel.DeleteCardViewModel;
import com.oplus.aiunit.vision.k7l;
import com.oplus.aiunit.vision.qz0;
import com.oplus.aiunit.vision.sr0;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.xsc;
import com.oplus.aiunit.vision.z0k;
import com.oppo.lib.common.R$string;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Route(path = "/bus/delete/authZFB")
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014¨\u0006\""}, d2 = {"Lcom/heytap/health/wallet/bus/ui/activities/BusDeleteZFBAuthActivity;", "Lcom/heytap/health/wallet/bus/ui/activities/BusBaseActivity;", "", "getLayoutId", "", "A7", "S7", "initView", "Q7", "R7", "T7", "", "authResult", "N7", "U7", "Lcom/heytap/wallet/business/bus/vmodel/DeleteCardViewModel;", "w", "Lcom/heytap/wallet/business/bus/vmodel/DeleteCardViewModel;", "viewModel", "x", "Ljava/lang/String;", "mAppCode", "", "y", "Z", "mCanSkip", "Lcom/heytap/health/base/ui/widget/HealthButton;", "z", "Lcom/heytap/health/base/ui/widget/HealthButton;", "authority_button", "A", "mAuthCode", "<init>", "()V", "bus_release"}, k = 1, mv = {1, 8, 0})
public final class BusDeleteZFBAuthActivity extends BusBaseActivity {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public String mAuthCode;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public DeleteCardViewModel viewModel;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Autowired(name = "appCode")
    @JvmField
    @Nullable
    public String mAppCode;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Autowired(name = "booleanKey")
    @JvmField
    public boolean mCanSkip;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public HealthButton authority_button;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/health/wallet/bus/ui/activities/BusDeleteZFBAuthActivity$a", "Lcom/oplus/aiunit/vision/xsc;", "Landroid/view/View;", "v", "", "a", "bus_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends xsc {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.xsc
        public void a(@NotNull View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            BusDeleteZFBAuthActivity.this.U7();
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/health/wallet/bus/ui/activities/BusDeleteZFBAuthActivity$b", "Lcom/oplus/aiunit/vision/xsc;", "Landroid/view/View;", "v", "", "a", "bus_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends xsc {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.xsc
        public void a(@Nullable View v) {
            Intent intent = new Intent();
            intent.putExtra("code", BusDeleteZFBAuthActivity.this.mAuthCode);
            BusDeleteZFBAuthActivity.this.setResult(-1, intent);
            BusDeleteZFBAuthActivity.this.finish();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 i;

        public c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.i = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p010kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.i;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.i.invoke(obj);
        }
    }

    public static final void O7(final BusDeleteZFBAuthActivity this$0, String authResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(authResult, "$authResult");
        final AuthResult authResult2 = new AuthResult(new AuthTask(this$0).authV2(authResult, true), true);
        final String resultStatus = authResult2.getResultStatus();
        this$0.runOnUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.ba2
            @Override // java.lang.Runnable
            public final void run() {
                BusDeleteZFBAuthActivity.P7(resultStatus, authResult2, this$0);
            }
        });
    }

    public static final void P7(String str, AuthResult authResult, BusDeleteZFBAuthActivity this$0) {
        Intrinsics.checkNotNullParameter(authResult, "$authResult");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!TextUtils.equals(str, "9000") || !TextUtils.equals(authResult.getResultCode(), "200")) {
            t6b.i(this$0.s, "fail Alipay");
            return;
        }
        this$0.mAuthCode = authResult.getAuthCode();
        t6b.i(this$0.s, "success Alipay");
        Intent intent = new Intent();
        intent.putExtra("code", this$0.mAuthCode);
        this$0.setResult(-1, intent);
        this$0.finish();
    }

    @Override // com.heytap.health.wallet.bus.ui.activities.BusBaseActivity, com.heytap.wallet.business.ui.activities.NfcBaseActivity
    public void A7() {
        S7();
        Q7();
        initView();
        R7();
        T7();
    }

    public final void N7(final String authResult) {
        sr0.i(new Runnable() { // from class: com.oplus.aiunit.vision.aa2
            @Override // java.lang.Runnable
            public final void run() {
                BusDeleteZFBAuthActivity.O7(this.i, authResult);
            }
        });
    }

    public final void Q7() {
        String stringExtra;
        ViewModelProvider.AndroidViewModelFactory.Companion companion = ViewModelProvider.AndroidViewModelFactory.INSTANCE;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "this.application");
        this.viewModel = (DeleteCardViewModel) companion.getInstance(application).create(DeleteCardViewModel.class);
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("appCode")) == null) {
            stringExtra = "";
        }
        this.mAppCode = stringExtra;
        Intent intent2 = getIntent();
        this.mCanSkip = intent2 != null ? intent2.getBooleanExtra("booleanKey", false) : false;
    }

    public final void R7() {
        HealthButton healthButton = this.authority_button;
        Intrinsics.checkNotNull(healthButton);
        healthButton.setOnClickListener(new a());
    }

    public final void S7() {
        COUIToolbar cOUIToolbar = (COUIToolbar) findViewById(R$id.lib_base_toolbar);
        this.f6122n = cOUIToolbar;
        cOUIToolbar.setTitle("");
        f7(this.f6122n, true);
    }

    public final void T7() {
        DeleteCardViewModel deleteCardViewModel = this.viewModel;
        DeleteCardViewModel deleteCardViewModel2 = null;
        if (deleteCardViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            deleteCardViewModel = null;
        }
        deleteCardViewModel.Q().observe(this, new c(new Function1<String, Unit>() { // from class: com.heytap.health.wallet.bus.ui.activities.BusDeleteZFBAuthActivity$observeData$1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String authResult) {
                t6b.b(this.this$0.s, "observeData authResult = " + authResult);
                BusDeleteZFBAuthActivity busDeleteZFBAuthActivity = this.this$0;
                Intrinsics.checkNotNullExpressionValue(authResult, "authResult");
                busDeleteZFBAuthActivity.N7(authResult);
            }
        }));
        DeleteCardViewModel deleteCardViewModel3 = this.viewModel;
        if (deleteCardViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            deleteCardViewModel3 = null;
        }
        deleteCardViewModel3.b0().observe(this, new c(new Function1<Boolean, Unit>() { // from class: com.heytap.health.wallet.bus.ui.activities.BusDeleteZFBAuthActivity$observeData$2
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke2(bool);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean isLoading) {
                Intrinsics.checkNotNullExpressionValue(isLoading, "isLoading");
                if (isLoading.booleanValue()) {
                    this.this$0.r7();
                } else {
                    this.this$0.l7();
                }
            }
        }));
        DeleteCardViewModel deleteCardViewModel4 = this.viewModel;
        if (deleteCardViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            deleteCardViewModel2 = deleteCardViewModel4;
        }
        deleteCardViewModel2.Z().observe(this, new c(new Function1<ErrorResponse, Unit>() { // from class: com.heytap.health.wallet.bus.ui.activities.BusDeleteZFBAuthActivity$observeData$3
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ErrorResponse errorResponse) {
                invoke2(errorResponse);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ErrorResponse errorResponse) {
                if (errorResponse != null) {
                    String message = errorResponse.getMessage();
                    if (message == null || message.length() == 0) {
                        return;
                    }
                    Context context = qz0.mContext;
                    z0k.f(context).t(context, errorResponse.getMessage());
                    DeleteCardViewModel deleteCardViewModel5 = this.this$0.viewModel;
                    if (deleteCardViewModel5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        deleteCardViewModel5 = null;
                    }
                    deleteCardViewModel5.O();
                }
            }
        }));
    }

    public final void U7() {
        DeleteCardViewModel deleteCardViewModel = null;
        if (!k7l.e(this)) {
            new HealthAlertDialogBuilder(this).setTitle(R$string.alipa_uninstalled).setMessage(R$string.alipay_uninstalled_tip).setPositiveButton(R$string.sure, null).show();
            return;
        }
        DeleteCardViewModel deleteCardViewModel2 = this.viewModel;
        if (deleteCardViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            deleteCardViewModel = deleteCardViewModel2;
        }
        deleteCardViewModel.h0(this.mAppCode);
    }

    @Override // com.heytap.health.wallet.bus.ui.activities.BusBaseActivity, com.heytap.wallet.business.ui.activities.NfcBaseActivity
    public int getLayoutId() {
        return R$layout.activity_bus_auth_zfb;
    }

    @Override // com.heytap.health.wallet.bus.ui.activities.BusBaseActivity, com.heytap.wallet.business.ui.activities.NfcBaseActivity, com.heytap.health.wallet.ui.WalletBaseActivity, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    public final void initView() {
        View viewFindViewById;
        this.authority_button = (HealthButton) findViewById(com.heytap.health.wallet.bus.R$id.authority_button);
        if (!this.mCanSkip || (viewFindViewById = findViewById(com.heytap.health.wallet.bus.R$id.tv_continue)) == null) {
            return;
        }
        viewFindViewById.setVisibility(0);
        viewFindViewById.setOnClickListener(new b());
    }
}
