package com.heytap.health.wallet.entrance.ui.activities;

import android.app.Application;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.base.ui.widget.HealthButton;
import com.heytap.health.wallet.entrance.R$id;
import com.heytap.health.wallet.entrance.R$layout;
import com.heytap.health.wallet.entrance.R$string;
import com.heytap.health.wallet.entrance.vmodel.EntranceTunningParamVm;
import com.heytap.health.wallet.network.door.rsp.CardDisplayEntity;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.hg7;
import com.oplus.aiunit.vision.lfg;
import com.oplus.aiunit.vision.sr6;
import com.oplus.aiunit.vision.z0k;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes18.dex */
@Route(path = "/entrance/tunningParamResult")
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001=B\u0007¢\u0006\u0004\b:\u0010;J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0014J\b\u0010\b\u001a\u00020\u0002H\u0014J\b\u0010\t\u001a\u00020\u0002H\u0014J\b\u0010\n\u001a\u00020\u0002H\u0014J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u001aR\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010&R\u0018\u00101\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010&R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108¨\u0006>"}, d2 = {"Lcom/heytap/health/wallet/entrance/ui/activities/EntranceTunningResultActivity;", "Lcom/heytap/health/wallet/entrance/ui/activities/EntranceBaseActivity;", "", "y7", "Landroid/view/View;", "v", ParserTag.TAG_ONCLICK, "onDestroy", "z7", "C7", "A7", "onBackPressed", "H7", "G7", "F7", "", "u", "Ljava/lang/Integer;", "mTunningType", "", "Ljava/lang/String;", "mAppCode", "w", "mFrom", "Landroidx/constraintlayout/widget/ConstraintLayout;", "x", "Landroidx/constraintlayout/widget/ConstraintLayout;", "mCstSuccess", "y", "mCstfail", "Lcom/heytap/health/base/ui/widget/HealthButton;", "z", "Lcom/heytap/health/base/ui/widget/HealthButton;", "mBtnComplete", "A", "mBtnOpenEmptyCard", "Landroid/widget/TextView;", c8l.KEY_B, "Landroid/widget/TextView;", "mBtnTunningAgain", "C", "rnRoot", "Lcom/airbnb/lottie/LottieAnimationView;", "D", "Lcom/airbnb/lottie/LottieAnimationView;", "mAnimationView", ExifInterface.LONGITUDE_EAST, "mSucessSettingTv", UserInfo.SEX_FEMALE, "mSucessSettingDesTv", "Lcom/coui/appcompat/toolbar/COUIToolbar;", "G", "Lcom/coui/appcompat/toolbar/COUIToolbar;", "mToolBar", "Lcom/heytap/health/wallet/entrance/vmodel/EntranceTunningParamVm;", "H", "Lcom/heytap/health/wallet/entrance/vmodel/EntranceTunningParamVm;", "viewModel", "<init>", "()V", "Companion", "a", "entrance_release"}, k = 1, mv = {1, 8, 0})
public final class EntranceTunningResultActivity extends EntranceBaseActivity {
    public static final int TYPE_TUNNING_FAIL = 2;
    public static final int TYPE_TUNNING_SUCCESS = 1;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public HealthButton mBtnOpenEmptyCard;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public TextView mBtnTunningAgain;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public ConstraintLayout rnRoot;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    public LottieAnimationView mAnimationView;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public TextView mSucessSettingTv;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public TextView mSucessSettingDesTv;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    public COUIToolbar mToolBar;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public EntranceTunningParamVm viewModel;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Autowired(name = "TYPE")
    @JvmField
    @Nullable
    public Integer mTunningType;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Autowired(name = "appCode")
    @JvmField
    @Nullable
    public String mAppCode;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Autowired(name = "from")
    @JvmField
    @Nullable
    public String mFrom;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public ConstraintLayout mCstSuccess;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public ConstraintLayout mCstfail;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public HealthButton mBtnComplete;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 i;

        public b(Function1 function) {
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

    public EntranceTunningResultActivity() {
        super(R$layout.activity_entrance_tunning_param_result);
        this.mTunningType = 0;
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity
    public void A7() {
        B7(this.mBtnComplete);
        B7(this.mBtnOpenEmptyCard);
        B7(this.mBtnTunningAgain);
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity
    public void C7() {
        Integer num = this.mTunningType;
        if (num != null && num.intValue() == 1) {
            ConstraintLayout constraintLayout = this.mCstSuccess;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            }
            ConstraintLayout constraintLayout2 = this.mCstfail;
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(8);
            }
            COUIToolbar cOUIToolbar = this.mToolBar;
            if (cOUIToolbar != null) {
                cOUIToolbar.setVisibility(4);
            }
        } else if (num != null && num.intValue() == 2) {
            ConstraintLayout constraintLayout3 = this.mCstSuccess;
            if (constraintLayout3 != null) {
                constraintLayout3.setVisibility(8);
            }
            ConstraintLayout constraintLayout4 = this.mCstfail;
            if (constraintLayout4 != null) {
                constraintLayout4.setVisibility(0);
            }
            COUIToolbar cOUIToolbar2 = this.mToolBar;
            if (cOUIToolbar2 != null) {
                cOUIToolbar2.setVisibility(0);
            }
        }
        if (StringsKt__StringsJVMKt.equals$default(this.mFrom, "restoreTunning", false, 2, null)) {
            TextView textView = this.mSucessSettingTv;
            if (textView != null) {
                textView.setText(R$string.entrance_tunning_restore_success_hint);
            }
            TextView textView2 = this.mSucessSettingDesTv;
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(8);
            return;
        }
        TextView textView3 = this.mSucessSettingTv;
        if (textView3 != null) {
            textView3.setText(R$string.entrance_tunning_success_hint);
        }
        TextView textView4 = this.mSucessSettingDesTv;
        if (textView4 == null) {
            return;
        }
        textView4.setVisibility(0);
    }

    public final void F7() {
        EntranceTunningParamVm entranceTunningParamVm = this.viewModel;
        if (entranceTunningParamVm == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            entranceTunningParamVm = null;
        }
        entranceTunningParamVm.M();
    }

    public final void G7() {
        EntranceTunningParamVm entranceTunningParamVm = this.viewModel;
        EntranceTunningParamVm entranceTunningParamVm2 = null;
        if (entranceTunningParamVm == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            entranceTunningParamVm = null;
        }
        entranceTunningParamVm.O().observe(this, new b(new Function1<Boolean, Unit>() { // from class: com.heytap.health.wallet.entrance.ui.activities.EntranceTunningResultActivity$observeData$1
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
        EntranceTunningParamVm entranceTunningParamVm3 = this.viewModel;
        if (entranceTunningParamVm3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            entranceTunningParamVm2 = entranceTunningParamVm3;
        }
        entranceTunningParamVm2.I().observe(this, new b(new Function1<CardDisplayEntity, Unit>() { // from class: com.heytap.health.wallet.entrance.ui.activities.EntranceTunningResultActivity$observeData$2
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CardDisplayEntity cardDisplayEntity) {
                invoke2(cardDisplayEntity);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CardDisplayEntity cardDisplayEntity) {
                if (cardDisplayEntity != null) {
                    String linkUrl = cardDisplayEntity.getLinkUrl();
                    if (!(linkUrl == null || StringsKt__StringsJVMKt.isBlank(linkUrl))) {
                        String userRight = cardDisplayEntity.getUserRight();
                        if (!(userRight == null || userRight.length() == 0)) {
                            EntranceTunningResultActivity entranceTunningResultActivity = this.this$0;
                            lfg.p(entranceTunningResultActivity, entranceTunningResultActivity.mAppCode, cardDisplayEntity.getLinkUrl(), cardDisplayEntity.getUserRight());
                            return;
                        }
                    }
                }
                z0k.f(this.this$0).s(this.this$0, R$string.not_data);
            }
        }));
    }

    public final void H7() {
        COUIToolbar cOUIToolbar = this.mToolBar;
        if (cOUIToolbar != null) {
            cOUIToolbar.setTitle("");
        }
        R1(this, this.mToolBar, true);
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity, com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Integer num = this.mTunningType;
        if (num != null && num.intValue() == 1) {
            return;
        }
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v) {
        Integer numValueOf = v != null ? Integer.valueOf(v.getId()) : null;
        int i = R$id.btn_complete;
        if (numValueOf != null && numValueOf.intValue() == i) {
            finish();
            sr6.c().l(new hg7());
            finish();
            return;
        }
        int i2 = R$id.btn_go_open;
        if (numValueOf != null && numValueOf.intValue() == i2) {
            F7();
            return;
        }
        int i3 = R$id.tv_tunning_again;
        if (numValueOf != null && numValueOf.intValue() == i3) {
            finish();
        }
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity
    public void y7() {
        this.mCstSuccess = (ConstraintLayout) findViewById(R$id.cst_layout_tunning_success);
        this.mSucessSettingTv = (TextView) findViewById(R$id.tv_hint);
        this.mSucessSettingDesTv = (TextView) findViewById(R$id.tv_hint_des);
        this.mCstfail = (ConstraintLayout) findViewById(R$id.cst_layout_tunning_fail);
        this.mBtnComplete = (HealthButton) findViewById(R$id.btn_complete);
        this.mBtnOpenEmptyCard = (HealthButton) findViewById(R$id.btn_go_open);
        this.mBtnTunningAgain = (TextView) findViewById(R$id.tv_tunning_again);
        this.rnRoot = (ConstraintLayout) findViewById(R$id.rnRoot);
        this.mAnimationView = (LottieAnimationView) findViewById(R$id.lottie_logo);
        this.mToolBar = (COUIToolbar) findViewById(com.heytap.health.base.R$id.lib_base_toolbar);
        H7();
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity
    public void z7() {
        ViewModelProvider.AndroidViewModelFactory.Companion companion = ViewModelProvider.AndroidViewModelFactory.INSTANCE;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "this.application");
        this.viewModel = (EntranceTunningParamVm) companion.getInstance(application).create(EntranceTunningParamVm.class);
        G7();
        this.mTunningType = Integer.valueOf(getIntent().getIntExtra("TYPE", 1));
        this.mAppCode = getIntent().getStringExtra("appCode");
        this.mFrom = getIntent().getStringExtra("from");
    }
}
