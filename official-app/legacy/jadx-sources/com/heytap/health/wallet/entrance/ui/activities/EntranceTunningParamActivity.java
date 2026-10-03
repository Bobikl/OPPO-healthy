package com.heytap.health.wallet.entrance.ui.activities;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.base.ui.dialog.HealthAlertDialogBuilder;
import com.heytap.health.base.ui.widget.HealthButton;
import com.heytap.health.wallet.entrance.R$id;
import com.heytap.health.wallet.entrance.R$layout;
import com.heytap.health.wallet.entrance.R$string;
import com.heytap.health.wallet.entrance.ui.activities.EntranceTunningParamActivity;
import com.heytap.health.wallet.entrance.vmodel.EntranceTunningParamVm;
import com.heytap.health.wallet.network.ErrorResponse;
import com.oplus.aiunit.vision.a94;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.hg7;
import com.oplus.aiunit.vision.qz0;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.u2j;
import com.oplus.aiunit.vision.x81;
import com.oplus.aiunit.vision.z0k;
import com.oplus.smartenginehelper.ParserTag;
import java.util.Arrays;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionAdapter;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes18.dex */
@Route(path = "/entrance/tunningParam")
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\bS\u0010TJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0002J\b\u0010\t\u001a\u00020\u0003H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\u0003H\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0014J\u0012\u0010\u0013\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0014J\b\u0010\u0015\u001a\u00020\u0003H\u0014J\b\u0010\u0016\u001a\u00020\u0003H\u0014J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0007J\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u000e\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001cR\u001c\u0010%\u001a\n \"*\u0004\u0018\u00010!0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010'R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00102\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010'R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001b\u0010K\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0016\u0010M\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010DR\u0018\u0010O\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bN\u0010$R\u0018\u0010P\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bD\u0010$R\u0018\u0010R\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bQ\u0010$¨\u0006U"}, d2 = {"Lcom/heytap/health/wallet/entrance/ui/activities/EntranceTunningParamActivity;", "Lcom/heytap/health/wallet/entrance/ui/activities/EntranceBaseActivity;", "Lcom/heytap/health/wallet/entrance/ui/activities/EntranceTunningParamDialog$a;", "", "U7", "X7", "V7", "a8", "S7", "T7", "O7", "P7", "d8", "R7", "Q7", "c8", "y7", "Landroid/view/View;", "v", ParserTag.TAG_ONCLICK, "z7", "C7", "A7", "Lcom/oplus/aiunit/vision/hg7;", "event", "onFinishEntranceTunning", "", "currentIndex", "", "isWorkSuc", "j2", "isNeedReset", "b8", "", "kotlin.jvm.PlatformType", "u", "Ljava/lang/String;", "tag", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "mTvTunningCardName", "w", "mTvTunningTitleHint", "x", "mTvSubTitleHint", "Lcom/heytap/health/base/ui/widget/HealthButton;", "y", "Lcom/heytap/health/base/ui/widget/HealthButton;", "mBtnStartTunning", "z", "mBtnRestoreTunning", "Landroidx/constraintlayout/widget/ConstraintLayout;", "A", "Landroidx/constraintlayout/widget/ConstraintLayout;", "rnRoot", "Landroidx/core/widget/NestedScrollView;", c8l.KEY_B, "Landroidx/core/widget/NestedScrollView;", "scrollView", "Lcom/coui/appcompat/toolbar/COUIToolbar;", "C", "Lcom/coui/appcompat/toolbar/COUIToolbar;", "toolbar", "Lcom/heytap/health/wallet/entrance/ui/activities/EntranceTunningParamDialog;", "D", "Lcom/heytap/health/wallet/entrance/ui/activities/EntranceTunningParamDialog;", "mTunningParamDialog", ExifInterface.LONGITUDE_EAST, "I", "mCurrentIndex", "Lcom/heytap/health/wallet/entrance/vmodel/EntranceTunningParamVm;", UserInfo.SEX_FEMALE, "Lkotlin/Lazy;", "N7", "()Lcom/heytap/health/wallet/entrance/vmodel/EntranceTunningParamVm;", "viewModel", "G", "mSumIndex", "H", "mCardName", "mAppCode", "J", "mAid", "<init>", "()V", "entrance_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEntranceTunningParamActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntranceTunningParamActivity.kt\ncom/heytap/health/wallet/entrance/ui/activities/EntranceTunningParamActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,293:1\n256#2,2:294\n256#2,2:296\n256#2,2:298\n256#2,2:300\n256#2,2:302\n256#2,2:304\n256#2,2:306\n256#2,2:308\n256#2,2:310\n256#2,2:312\n*S KotlinDebug\n*F\n+ 1 EntranceTunningParamActivity.kt\ncom/heytap/health/wallet/entrance/ui/activities/EntranceTunningParamActivity\n*L\n128#1:294,2\n129#1:296,2\n254#1:298,2\n255#1:300,2\n258#1:302,2\n259#1:304,2\n285#1:306,2\n286#1:308,2\n290#1:310,2\n291#1:312,2\n*E\n"})
public final class EntranceTunningParamActivity extends EntranceBaseActivity implements EntranceTunningParamDialog.a {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public ConstraintLayout rnRoot;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public NestedScrollView scrollView;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public COUIToolbar toolbar;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    public EntranceTunningParamDialog mTunningParamDialog;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public int mCurrentIndex;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewModel;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public int mSumIndex;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @Autowired(name = "cardName")
    @JvmField
    @Nullable
    public String mCardName;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @Autowired(name = "appCode")
    @JvmField
    @Nullable
    public String mAppCode;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @Autowired(name = "aid")
    @JvmField
    @Nullable
    public String mAid;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final String tag;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public TextView mTvTunningCardName;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public TextView mTvTunningTitleHint;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public TextView mTvSubTitleHint;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public HealthButton mBtnStartTunning;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public TextView mBtnRestoreTunning;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Observer, FunctionAdapter {
        public final /* synthetic */ Function1 i;

        public a(Function1 function) {
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

    public EntranceTunningParamActivity() {
        super(R$layout.activity_entrance_tunning_param);
        this.tag = EntranceTunningParamActivity.class.getSimpleName();
        this.mCurrentIndex = 5;
        this.viewModel = LazyKt__LazyJVMKt.lazy(new Function0<EntranceTunningParamVm>() { // from class: com.heytap.health.wallet.entrance.ui.activities.EntranceTunningParamActivity$viewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final EntranceTunningParamVm invoke() {
                return (EntranceTunningParamVm) new ViewModelProvider(this.this$0).get(EntranceTunningParamVm.class);
            }
        });
        this.mSumIndex = 3;
    }

    public static final void W7(EntranceTunningParamActivity this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a8();
    }

    public static final void Y7(EntranceTunningParamActivity this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a8();
    }

    public static final void Z7(EntranceTunningParamActivity this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        t6b.b(this$0.s, "jump to combitation");
        x81.c(this$0, "/main/combinationCard/main");
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity
    public void A7() {
        B7(this.mBtnStartTunning);
        B7(this.mBtnRestoreTunning);
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity
    public void C7() {
        TextView textView = this.mTvTunningCardName;
        if (textView == null) {
            return;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = getString(R$string.entrance_swip_card_name);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.entrance_swip_card_name)");
        String str = String.format(string, Arrays.copyOf(new Object[]{this.mCardName}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        textView.setText(str);
    }

    public final EntranceTunningParamVm N7() {
        return (EntranceTunningParamVm) this.viewModel.getValue();
    }

    public final void O7() {
        P7();
    }

    public final void P7() {
        N7().P().observe(this, new a(new Function1<Boolean, Unit>() { // from class: com.heytap.health.wallet.entrance.ui.activities.EntranceTunningParamActivity$observeIndexData$1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke2(bool);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean isSuccess) {
                t6b.b(this.this$0.tag, "observeIndexData setIndexSuccess = " + isSuccess);
                Intrinsics.checkNotNullExpressionValue(isSuccess, "isSuccess");
                if (isSuccess.booleanValue()) {
                    this.this$0.R7();
                } else {
                    this.this$0.Q7();
                }
            }
        }));
        N7().R().observe(this, new a(new Function1<Boolean, Unit>() { // from class: com.heytap.health.wallet.entrance.ui.activities.EntranceTunningParamActivity$observeIndexData$2
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke2(bool);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean isSuccess) {
                t6b.b(this.this$0.tag, "observeIndexData setIndexSuccess = " + isSuccess);
                Intrinsics.checkNotNullExpressionValue(isSuccess, "isSuccess");
                if (isSuccess.booleanValue()) {
                    this.this$0.d8();
                } else {
                    this.this$0.c8();
                }
            }
        }));
        N7().O().observe(this, new a(new Function1<Boolean, Unit>() { // from class: com.heytap.health.wallet.entrance.ui.activities.EntranceTunningParamActivity$observeIndexData$3
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
                t6b.b(this.this$0.tag, "observeIndexData isLoading = " + isLoading);
                Intrinsics.checkNotNullExpressionValue(isLoading, "isLoading");
                if (isLoading.booleanValue()) {
                    this.this$0.A();
                } else {
                    this.this$0.m7();
                }
            }
        }));
        N7().J().observe(this, new a(new Function1<ErrorResponse, Unit>() { // from class: com.heytap.health.wallet.entrance.ui.activities.EntranceTunningParamActivity$observeIndexData$4
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ErrorResponse errorResponse) {
                invoke2(errorResponse);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable ErrorResponse errorResponse) {
                if (errorResponse != null) {
                    String message = errorResponse.getMessage();
                    if (message == null || message.length() == 0) {
                        return;
                    }
                    String message2 = errorResponse.getMessage();
                    String message3 = errorResponse.getMessage();
                    if (Intrinsics.areEqual(message3, this.this$0.N7().getSendToWatchError())) {
                        message2 = this.this$0.getString(com.oppo.lib.common.R$string.wallet_common_send_fail);
                    } else if (Intrinsics.areEqual(message3, this.this$0.N7().getGetFromWatchError())) {
                        message2 = this.this$0.getString(com.oppo.lib.common.R$string.wallet_common_get_fail);
                    }
                    Context context = qz0.mContext;
                    z0k.f(context).t(context, message2);
                    this.this$0.N7().F();
                    this.this$0.finish();
                }
            }
        }));
        N7().S().observe(this, new a(new Function1<Integer, Unit>() { // from class: com.heytap.health.wallet.entrance.ui.activities.EntranceTunningParamActivity$observeIndexData$5
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke2(num);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Integer sumIndex) {
                t6b.b(this.this$0.tag, "observeIndexData sumIndex = " + sumIndex);
                EntranceTunningParamActivity entranceTunningParamActivity = this.this$0;
                Intrinsics.checkNotNullExpressionValue(sumIndex, "sumIndex");
                entranceTunningParamActivity.mSumIndex = sumIndex.intValue();
            }
        }));
    }

    public final void Q7() {
        HealthButton healthButton = this.mBtnStartTunning;
        if (healthButton != null) {
            healthButton.setVisibility(0);
        }
        TextView textView = this.mBtnRestoreTunning;
        if (textView == null) {
            return;
        }
        textView.setVisibility(0);
    }

    public final void R7() {
        Bundle bundle = new Bundle();
        bundle.putInt("TYPE", 1);
        bundle.putString("from", "restoreTunning");
        x81.d(this, "/entrance/tunningParamResult", bundle);
    }

    public final void S7() {
        t6b.b(this.tag, "Enter restoreTunningCard");
        N7().V(this.mAid, this.mAppCode, 0);
    }

    public final void T7() {
        COUIToolbar cOUIToolbar = this.toolbar;
        if (cOUIToolbar != null) {
            cOUIToolbar.setTitle("");
        }
        R1(this, this.toolbar, true);
    }

    public final void U7() {
        if (N7().U()) {
            X7();
        } else {
            V7();
        }
    }

    public final void V7() {
        new HealthAlertDialogBuilder(this).setTitle(getResources().getString(com.oppo.lib.common.R$string.wallet_dialog_no_title)).setMessage(getResources().getString(R$string.entrance_tunning_swipecard_off_des)).setCancelable(false).setPositiveButton(getString(com.oppo.lib.common.R$string.sure), new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.io6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                EntranceTunningParamActivity.W7(this.i, dialogInterface, i);
            }
        }).show();
    }

    public final void X7() {
        new HealthAlertDialogBuilder(this).setTitle(R$string.entrance_tunning_swipecard_title).setMessage(R$string.entrance_tunning_swipecard_des).setCancelable(false).setNegativeButton(com.oppo.lib.common.R$string.wallet_common_skip, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.jo6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                EntranceTunningParamActivity.Y7(this.i, dialogInterface, i);
            }
        }).setPositiveButton(com.oppo.lib.common.R$string.goto_setting, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.ko6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                EntranceTunningParamActivity.Z7(this.i, dialogInterface, i);
            }
        }).show();
    }

    public final void a8() {
        EntranceTunningParamDialog entranceTunningParamDialog;
        EntranceTunningParamDialog entranceTunningParamDialog2 = this.mTunningParamDialog;
        if (entranceTunningParamDialog2 == null) {
            this.mTunningParamDialog = new EntranceTunningParamDialog(this, this.mAppCode, this.mAid, this, this.mSumIndex, N7());
        } else if (entranceTunningParamDialog2 != null) {
            entranceTunningParamDialog2.p(0);
        }
        if (a94.a(this) && (entranceTunningParamDialog = this.mTunningParamDialog) != null) {
            entranceTunningParamDialog.show();
        }
        HealthButton healthButton = this.mBtnStartTunning;
        if (healthButton != null) {
            healthButton.setVisibility(8);
        }
        TextView textView = this.mBtnRestoreTunning;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }

    public final void b8(boolean isNeedReset) {
        if (isNeedReset) {
            HealthButton healthButton = this.mBtnStartTunning;
            if (healthButton != null) {
                healthButton.setVisibility(0);
            }
            TextView textView = this.mBtnRestoreTunning;
            if (textView == null) {
                return;
            }
            textView.setVisibility(0);
            return;
        }
        HealthButton healthButton2 = this.mBtnStartTunning;
        if (healthButton2 != null) {
            healthButton2.setVisibility(8);
        }
        TextView textView2 = this.mBtnRestoreTunning;
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(8);
    }

    public final void c8() {
        HealthButton healthButton = this.mBtnStartTunning;
        if (healthButton != null) {
            healthButton.setVisibility(0);
        }
        TextView textView = this.mBtnRestoreTunning;
        if (textView == null) {
            return;
        }
        textView.setVisibility(0);
    }

    public final void d8() {
        Bundle bundle = new Bundle();
        bundle.putInt("TYPE", 1);
        bundle.putString("from", "startTunning");
        bundle.putString("appCode", this.mAppCode);
        x81.d(this, "/entrance/tunningParamResult", bundle);
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity, com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceTunningParamDialog.a
    public void j2(int currentIndex, boolean isWorkSuc) {
        t6b.b(this.tag, "onBackTunningParam currentIndex = " + currentIndex + ",isWorkSuc = " + isWorkSuc);
        this.mCurrentIndex = currentIndex;
        if (isWorkSuc) {
            N7().Y(this.mAid, this.mAppCode, this.mCurrentIndex);
            return;
        }
        if (currentIndex >= this.mSumIndex || !a94.a(this)) {
            Bundle bundle = new Bundle();
            bundle.putInt("TYPE", 2);
            bundle.putString("appCode", "whitedoor");
            bundle.putString("from", null);
            x81.d(this, "/entrance/tunningParamResult", bundle);
            b8(true);
            N7().X(this.mAid, this.mAppCode, 0);
            return;
        }
        b8(false);
        EntranceTunningParamDialog entranceTunningParamDialog = this.mTunningParamDialog;
        if (entranceTunningParamDialog != null) {
            entranceTunningParamDialog.show();
        }
        EntranceTunningParamDialog entranceTunningParamDialog2 = this.mTunningParamDialog;
        if (entranceTunningParamDialog2 != null) {
            entranceTunningParamDialog2.p(this.mCurrentIndex);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v) {
        if (Intrinsics.areEqual(v, this.mBtnStartTunning)) {
            U7();
        } else if (Intrinsics.areEqual(v, this.mBtnRestoreTunning)) {
            S7();
        }
    }

    @u2j(threadMode = ThreadMode.MAIN)
    public final void onFinishEntranceTunning(@NotNull hg7 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        finish();
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity
    public void y7() {
        this.mTvTunningCardName = (TextView) findViewById(R$id.tv_entrance_card_name);
        this.mBtnStartTunning = (HealthButton) findViewById(R$id.btn_start_tunning);
        this.mBtnRestoreTunning = (TextView) findViewById(R$id.btn_restore_tunning);
        this.mTvTunningTitleHint = (TextView) findViewById(R$id.tv_title_hint);
        this.mTvSubTitleHint = (TextView) findViewById(R$id.tv_subtitle_describe_hint);
        this.rnRoot = (ConstraintLayout) findViewById(R$id.rnRoot);
        this.scrollView = (NestedScrollView) findViewById(R$id.scrollView);
        this.toolbar = (COUIToolbar) findViewById(com.heytap.health.base.R$id.lib_base_toolbar);
        T7();
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity
    public void z7() {
        this.mAid = getIntent().getStringExtra("aid");
        this.mCardName = getIntent().getStringExtra("cardName");
        String stringExtra = getIntent().getStringExtra("appCode");
        this.mAppCode = stringExtra;
        t6b.b(this.tag, "mCardName = " + this.mCardName + ", mAppCode = " + stringExtra + ", mAid = " + this.mAid);
        O7();
        N7().H(this.mAid, this.mAppCode);
    }
}
