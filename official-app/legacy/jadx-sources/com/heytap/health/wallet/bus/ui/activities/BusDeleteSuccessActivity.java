package com.heytap.health.wallet.bus.ui.activities;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.heytap.health.base.R$id;
import com.heytap.health.base.ui.widget.HealthButton;
import com.heytap.health.wallet.bus.R$layout;
import com.heytap.health.wallet.bus.event.FinishSwipeEvent;
import com.heytap.health.wallet.network.ErrorResponse;
import com.heytap.health.wallet.network.bus.params.GetDeletSucResultReq;
import com.heytap.health.wallet.network.bus.rsp.GetDeleteSucResultRsp;
import com.heytap.wallet.business.bus.vmodel.DeleteCardViewModel;
import com.oplus.aiunit.vision.aec;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.mfg;
import com.oplus.aiunit.vision.qz0;
import com.oplus.aiunit.vision.sr6;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.xsc;
import com.oplus.aiunit.vision.z0k;
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
@Route(path = "/bus/delete/Success")
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b1\u00102J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b(\u0010)R$\u00100\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010)\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00063"}, d2 = {"Lcom/heytap/health/wallet/bus/ui/activities/BusDeleteSuccessActivity;", "Lcom/heytap/health/wallet/bus/ui/activities/BusBaseActivity;", "", "getLayoutId", "", "A7", "onBackPressed", "N7", "initView", "L7", "M7", "K7", "O7", "P7", "R7", "Q7", "S7", "Lcom/heytap/health/base/ui/widget/HealthButton;", "w", "Lcom/heytap/health/base/ui/widget/HealthButton;", "complete_button", "Landroid/widget/TextView;", "x", "Landroid/widget/TextView;", "tv_content", "y", "tv_title", "Landroid/widget/ImageView;", "z", "Landroid/widget/ImageView;", "img_icon", "Landroid/view/View;", "A", "Landroid/view/View;", "scrollview_content", "Lcom/heytap/wallet/business/bus/vmodel/DeleteCardViewModel;", c8l.KEY_B, "Lcom/heytap/wallet/business/bus/vmodel/DeleteCardViewModel;", "busDelSucVM", "", "C", "Ljava/lang/String;", "mAppCode", "D", "getRefundRecordUrl", "()Ljava/lang/String;", "T7", "(Ljava/lang/String;)V", "refundRecordUrl", "<init>", "()V", "bus_release"}, k = 1, mv = {1, 8, 0})
public final class BusDeleteSuccessActivity extends BusBaseActivity {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public View scrollview_content;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public DeleteCardViewModel busDelSucVM;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Autowired(name = "appCode")
    @JvmField
    @Nullable
    public String mAppCode;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    public String refundRecordUrl;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public HealthButton complete_button;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public TextView tv_content;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public TextView tv_title;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public ImageView img_icon;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/health/wallet/bus/ui/activities/BusDeleteSuccessActivity$a", "Lcom/oplus/aiunit/vision/xsc;", "Landroid/view/View;", "v", "", "a", "bus_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends xsc {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.xsc
        public void a(@NotNull View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            BusDeleteSuccessActivity.this.K7();
        }
    }

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

    @Override // com.heytap.health.wallet.bus.ui.activities.BusBaseActivity, com.heytap.wallet.business.ui.activities.NfcBaseActivity
    public void A7() {
        N7();
        L7();
        initView();
        M7();
        O7();
        Q7();
        S7();
        R7();
        P7();
    }

    public final void K7() {
        mfg.a(this);
        sr6.c().l(new FinishSwipeEvent());
        mfg.a(this);
    }

    public final void L7() {
        this.mAppCode = getIntent().getStringExtra("appCode");
    }

    public final void M7() {
        HealthButton healthButton = this.complete_button;
        Intrinsics.checkNotNull(healthButton);
        healthButton.setOnClickListener(new a());
    }

    public final void N7() {
        COUIToolbar cOUIToolbar = (COUIToolbar) findViewById(R$id.lib_base_toolbar);
        this.f6122n = cOUIToolbar;
        cOUIToolbar.setTitle("");
        f7(this.f6122n, true);
    }

    public final void O7() {
        this.busDelSucVM = (DeleteCardViewModel) new ViewModelProvider(this).get(DeleteCardViewModel.class);
    }

    public final void P7() {
        GetDeletSucResultReq getDeletSucResultReq = new GetDeletSucResultReq();
        getDeletSucResultReq.setCplc(aec.o());
        getDeletSucResultReq.setAppCode(this.mAppCode);
        DeleteCardViewModel deleteCardViewModel = this.busDelSucVM;
        if (deleteCardViewModel != null) {
            deleteCardViewModel.X(getDeletSucResultReq);
        }
    }

    public final void Q7() {
        LiveData<ErrorResponse> liveDataZ;
        DeleteCardViewModel deleteCardViewModel = this.busDelSucVM;
        if (deleteCardViewModel == null || (liveDataZ = deleteCardViewModel.Z()) == null) {
            return;
        }
        liveDataZ.observe(this, new b(new Function1<ErrorResponse, Unit>() { // from class: com.heytap.health.wallet.bus.ui.activities.BusDeleteSuccessActivity$observeErrorMsg$1
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
                    DeleteCardViewModel deleteCardViewModel2 = this.this$0.busDelSucVM;
                    if (deleteCardViewModel2 != null) {
                        deleteCardViewModel2.O();
                    }
                }
            }
        }));
    }

    public final void R7() {
        LiveData<Boolean> liveDataB0;
        DeleteCardViewModel deleteCardViewModel = this.busDelSucVM;
        if (deleteCardViewModel == null || (liveDataB0 = deleteCardViewModel.b0()) == null) {
            return;
        }
        liveDataB0.observe(this, new b(new Function1<Boolean, Unit>() { // from class: com.heytap.health.wallet.bus.ui.activities.BusDeleteSuccessActivity$observeLoading$1
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
    }

    public final void S7() {
        LiveData<GetDeleteSucResultRsp> liveDataY;
        DeleteCardViewModel deleteCardViewModel = this.busDelSucVM;
        if (deleteCardViewModel == null || (liveDataY = deleteCardViewModel.Y()) == null) {
            return;
        }
        liveDataY.observe(this, new b(new Function1<GetDeleteSucResultRsp, Unit>() { // from class: com.heytap.health.wallet.bus.ui.activities.BusDeleteSuccessActivity$observeResultData$1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GetDeleteSucResultRsp getDeleteSucResultRsp) {
                invoke2(getDeleteSucResultRsp);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(GetDeleteSucResultRsp getDeleteSucResultRsp) {
                String str = this.this$0.s;
                StringBuilder sb = new StringBuilder();
                sb.append(getDeleteSucResultRsp);
                t6b.i(str, sb.toString());
                String delSucDescText = getDeleteSucResultRsp != null ? getDeleteSucResultRsp.getDelSucDescText() : null;
                TextView textView = this.this$0.tv_content;
                if (textView != null) {
                    textView.setText(delSucDescText);
                }
                if (TextUtils.isEmpty(getDeleteSucResultRsp != null ? getDeleteSucResultRsp.getRefundRecordUrl() : null)) {
                    return;
                }
                this.this$0.T7(getDeleteSucResultRsp != null ? getDeleteSucResultRsp.getRefundRecordUrl() : null);
            }
        }));
    }

    public final void T7(@Nullable String str) {
        this.refundRecordUrl = str;
    }

    @Override // com.heytap.health.wallet.bus.ui.activities.BusBaseActivity, com.heytap.wallet.business.ui.activities.NfcBaseActivity
    public int getLayoutId() {
        return R$layout.activity_delete_success;
    }

    @Override // com.heytap.health.wallet.bus.ui.activities.BusBaseActivity, com.heytap.wallet.business.ui.activities.NfcBaseActivity, com.heytap.health.wallet.ui.WalletBaseActivity, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    public final void initView() {
        this.complete_button = (HealthButton) findViewById(com.heytap.health.wallet.bus.R$id.complete_button);
        this.tv_content = (TextView) findViewById(com.heytap.health.wallet.bus.R$id.tv_content);
        this.tv_title = (TextView) findViewById(com.heytap.health.wallet.bus.R$id.tv_title);
        this.img_icon = (ImageView) findViewById(com.heytap.health.wallet.bus.R$id.img_icon);
        this.scrollview_content = findViewById(com.heytap.health.wallet.bus.R$id.scrollview_content);
    }

    @Override // com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        K7();
    }
}
