package com.heytap.wallet.business.bus.vmodel;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.health.base.track.quality.QualityTrack;
import com.heytap.health.base.track.quality.Scenes;
import com.heytap.health.wallet.helper.StatisticsHelper;
import com.heytap.health.wallet.network.ErrorResponse;
import com.heytap.health.wallet.network.bus.params.CardDeleteReasonReq;
import com.heytap.health.wallet.network.bus.params.GetDeletSucResultReq;
import com.heytap.health.wallet.network.bus.rsp.CardDeleteAddRsp;
import com.heytap.health.wallet.network.bus.rsp.GetDeleteSucResultRsp;
import com.heytap.health.wallet.network.bus.rsp.PreDeleteCheckRspVo;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.store.base.core.state.Constants;
import com.heytap.wallet.business.bus.bean.ExcuteStatus;
import com.heytap.wallet.business.common.util.CmdExecUtils;
import com.heytap.wallet.business.usecases.ReportCardsUC;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.fkj;
import com.oplus.aiunit.vision.j7l;
import com.oplus.aiunit.vision.m85;
import com.oplus.aiunit.vision.o6l;
import com.oplus.aiunit.vision.sr6;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.us6;
import com.oplus.aiunit.vision.ydc;
import io.protostuff.MapSchema;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u0000 c2\u00020\u0001:\u0001dB\u0007¢\u0006\u0004\ba\u0010bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u001c\u0010\t\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\u001f\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0012\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019J\u0006\u0010\u001c\u001a\u00020\u0002J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u0019J\u0006\u0010\u001e\u001a\u00020\u0002R\u0017\u0010$\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001a0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\f0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,R\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\u00040*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010,R\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020\f0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010,R\u001c\u00106\u001a\b\u0012\u0004\u0012\u0002040*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010,R\u001c\u00108\u001a\b\u0012\u0004\u0012\u00020\u00040*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010,R\u001c\u0010;\u001a\b\u0012\u0004\u0012\u0002090*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010,R\u001c\u0010>\u001a\b\u0012\u0004\u0012\u00020<0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010,R\"\u0010B\u001a\u0010\u0012\f\u0012\n @*\u0004\u0018\u00010?0?0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010,R\"\u0010D\u001a\u0010\u0012\f\u0012\n @*\u0004\u0018\u00010?0?0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010,R\u001c\u0010G\u001a\b\u0012\u0004\u0012\u00020E0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010,R\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010N\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0017\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00040\u00198F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020\f0\u00198F¢\u0006\u0006\u001a\u0004\bR\u0010PR\u0017\u0010U\u001a\b\u0012\u0004\u0012\u0002040\u00198F¢\u0006\u0006\u001a\u0004\bT\u0010PR\u0017\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00040\u00198F¢\u0006\u0006\u001a\u0004\bV\u0010PR\u0017\u0010Y\u001a\b\u0012\u0004\u0012\u0002090\u00198F¢\u0006\u0006\u001a\u0004\bX\u0010PR\u0017\u0010[\u001a\b\u0012\u0004\u0012\u00020<0\u00198F¢\u0006\u0006\u001a\u0004\bZ\u0010PR\u0017\u0010]\u001a\b\u0012\u0004\u0012\u00020?0\u00198F¢\u0006\u0006\u001a\u0004\b\\\u0010PR\u0017\u0010_\u001a\b\u0012\u0004\u0012\u00020?0\u00198F¢\u0006\u0006\u001a\u0004\b^\u0010PR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020E0\u00198F¢\u0006\u0006\u001a\u0004\b`\u0010P\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006e"}, d2 = {"Lcom/heytap/wallet/business/bus/vmodel/DeleteCardViewModel;", "Landroidx/lifecycle/ViewModel;", "", "N", "", "aid", "e0", "errorCode", "errorMsg", "M", "g0", "f0", "", "S", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "appCode", "L", "c0", "h0", "Lcom/heytap/health/wallet/network/bus/params/CardDeleteReasonReq;", "cardDeleteReasonReq", "K", "Lcom/heytap/health/wallet/network/bus/params/GetDeletSucResultReq;", "deletSucResultReq", "X", "Landroidx/lifecycle/LiveData;", "Lcom/heytap/wallet/business/bus/bean/ExcuteStatus;", "a0", "i0", "U", "O", "Ljava/util/concurrent/atomic/AtomicBoolean;", "i", "Ljava/util/concurrent/atomic/AtomicBoolean;", "d0", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "isDeleting", "j", "Ljava/lang/String;", "mAid", MapSchema.FIELD_NAME_KEY, "mAppCode", "Landroidx/lifecycle/MutableLiveData;", LogFieldKey.LEVEL_KEY, "Landroidx/lifecycle/MutableLiveData;", "excuteStatus", LogFieldKey.MESSAGE_KEY, "countDown", "n", "innerCardNo", "o", "innerBalance", "Lcom/heytap/health/wallet/network/bus/rsp/PreDeleteCheckRspVo;", LogFieldKey.PROCESS_NAME_KEY, "innerDeleteCheckRspVO", "q", "innerSignData", "Lcom/heytap/health/wallet/network/bus/rsp/CardDeleteAddRsp;", "r", "innerAddReason", "Lcom/heytap/health/wallet/network/bus/rsp/GetDeleteSucResultRsp;", "s", "innerDeleteResult", "", "kotlin.jvm.PlatformType", "t", "innerDeleteLoading", "u", "innerLoading", "Lcom/heytap/health/wallet/network/ErrorResponse;", "v", "innerErrorResponse", "Landroid/os/CountDownTimer;", "w", "Landroid/os/CountDownTimer;", "mReadCDTimer", "x", "I", "contDownV", ExifInterface.GPS_DIRECTION_TRUE, "()Landroidx/lifecycle/LiveData;", "cardNo", "R", "balance", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "deleteCheckRspVO", "Q", "authResult", SecureGcmConstants.MESSAGE_KEY, "addReasonResult", "Y", "deleteSucResult", ExifInterface.LONGITUDE_WEST, "deleteLoading", "b0", Constants.LOADING, "Z", "<init>", "()V", "Companion", "a", "business_release"}, k = 1, mv = {1, 8, 0})
public final class DeleteCardViewModel extends ViewModel {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String mAid;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public String mAppCode;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<Boolean> innerDeleteLoading;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<Boolean> innerLoading;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public MutableLiveData<ErrorResponse> innerErrorResponse;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final CountDownTimer mReadCDTimer;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public int contDownV;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean isDeleting = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<ExcuteStatus> excuteStatus = new MutableLiveData<>();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<Integer> countDown = new MutableLiveData<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public MutableLiveData<String> innerCardNo = new MutableLiveData<>();

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public MutableLiveData<Integer> innerBalance = new MutableLiveData<>();

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public MutableLiveData<PreDeleteCheckRspVo> innerDeleteCheckRspVO = new MutableLiveData<>();

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public MutableLiveData<String> innerSignData = new MutableLiveData<>();

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public MutableLiveData<CardDeleteAddRsp> innerAddReason = new MutableLiveData<>();

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public MutableLiveData<GetDeleteSucResultRsp> innerDeleteResult = new MutableLiveData<>();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"com/heytap/wallet/business/bus/vmodel/DeleteCardViewModel$b", "Landroid/os/CountDownTimer;", "", "millisUntilFinished", "", "onTick", com.platform.account.webview.constant.Constants.JsbConstants.METHOD_FINISH, "business_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends CountDownTimer {
        public b() {
            super(10000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            DeleteCardViewModel.this.contDownV = 0;
            DeleteCardViewModel.this.countDown.postValue(Integer.valueOf(DeleteCardViewModel.this.contDownV));
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
            DeleteCardViewModel.this.contDownV = (int) ((millisUntilFinished / ((long) 1000)) + 1);
            DeleteCardViewModel.this.countDown.postValue(Integer.valueOf(DeleteCardViewModel.this.contDownV));
        }
    }

    public DeleteCardViewModel() {
        Boolean bool = Boolean.FALSE;
        this.innerDeleteLoading = new MutableLiveData<>(bool);
        this.innerLoading = new MutableLiveData<>(bool);
        this.innerErrorResponse = new MutableLiveData<>();
        this.mReadCDTimer = new b();
        this.contDownV = 10;
    }

    public final void K(@NotNull CardDeleteReasonReq cardDeleteReasonReq) {
        Intrinsics.checkNotNullParameter(cardDeleteReasonReq, "cardDeleteReasonReq");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DeleteCardViewModel$addDeleteCardReason$1(this, cardDeleteReasonReq, null), 3, null);
    }

    public final void L(@Nullable String aid, @Nullable String appCode) {
        t6b.f("DeleteCardViewModel", "enter deleteCard aid = " + aid);
        this.isDeleting.set(true);
        this.mAid = aid;
        this.mAppCode = appCode;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DeleteCardViewModel$deleteCard$1(this, aid, appCode, null), 3, null);
    }

    public final void M(String errorCode, String errorMsg) {
        new ReportCardsUC().f();
        StatisticsHelper.b(StatisticsHelper.a("deleteapp"), errorCode, errorMsg);
        CmdExecUtils.c(6, this.mAid);
        f0();
        this.isDeleting.compareAndSet(true, false);
        ExcuteStatus excuteStatus = new ExcuteStatus();
        excuteStatus.setSuccess(false);
        excuteStatus.setResultMsg(errorMsg);
        this.excuteStatus.postValue(excuteStatus);
    }

    public final void N() {
        new ReportCardsUC().f();
        QualityTrack qualityTrack = QualityTrack.INSTANCE;
        Scenes scenesA = StatisticsHelper.a("deleteapp");
        Intrinsics.checkNotNullExpressionValue(scenesA, "getWalletQualityType(NFC….COMMAND_TYPE_DELETE_APP)");
        qualityTrack.f(scenesA);
        g0();
        CmdExecUtils.e(6, this.mAid);
        ydc.n().j(this.mAid);
        o6l.h(this.mAid);
        String strU = j7l.u();
        if (TextUtils.isEmpty(strU) || TextUtils.equals(this.mAid, strU)) {
            j7l.K("no_activite_aid");
        }
        this.isDeleting.compareAndSet(true, false);
        e0(this.mAid);
        ExcuteStatus excuteStatus = new ExcuteStatus();
        excuteStatus.setSuccess(true);
        this.excuteStatus.postValue(excuteStatus);
    }

    public final void O() {
        this.innerErrorResponse.setValue(null);
    }

    @NotNull
    public final LiveData<CardDeleteAddRsp> P() {
        return this.innerAddReason;
    }

    @NotNull
    public final LiveData<String> Q() {
        return this.innerSignData;
    }

    @NotNull
    public final LiveData<Integer> R() {
        return this.innerBalance;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object S(String str, Continuation<? super Integer> continuation) {
        DeleteCardViewModel$getBalance$1 deleteCardViewModel$getBalance$1;
        if (continuation instanceof DeleteCardViewModel$getBalance$1) {
            deleteCardViewModel$getBalance$1 = (DeleteCardViewModel$getBalance$1) continuation;
            int i = deleteCardViewModel$getBalance$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteCardViewModel$getBalance$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteCardViewModel$getBalance$1 = new DeleteCardViewModel$getBalance$1(this, continuation);
            }
        } else {
            deleteCardViewModel$getBalance$1 = new DeleteCardViewModel$getBalance$1(this, continuation);
        }
        Object objD = deleteCardViewModel$getBalance$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = deleteCardViewModel$getBalance$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objD);
            deleteCardViewModel$getBalance$1.L$0 = str;
            deleteCardViewModel$getBalance$1.label = 1;
            objD = m85.d(str, deleteCardViewModel$getBalance$1);
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) deleteCardViewModel$getBalance$1.L$0;
            ResultKt.throwOnFailure(objD);
        }
        Integer num = (Integer) objD;
        t6b.b("DeleteCardViewModel", "getBalance: balance=" + num + ", aid=" + str);
        return num;
    }

    @NotNull
    public final LiveData<String> T() {
        return this.innerCardNo;
    }

    @NotNull
    public final LiveData<Integer> U() {
        return this.countDown;
    }

    @NotNull
    public final LiveData<PreDeleteCheckRspVo> V() {
        return this.innerDeleteCheckRspVO;
    }

    @NotNull
    public final LiveData<Boolean> W() {
        return this.innerDeleteLoading;
    }

    public final void X(@NotNull GetDeletSucResultReq deletSucResultReq) {
        Intrinsics.checkNotNullParameter(deletSucResultReq, "deletSucResultReq");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DeleteCardViewModel$getDeleteResult$1(this, deletSucResultReq, null), 3, null);
    }

    @NotNull
    public final LiveData<GetDeleteSucResultRsp> Y() {
        return this.innerDeleteResult;
    }

    @NotNull
    public final LiveData<ErrorResponse> Z() {
        return this.innerErrorResponse;
    }

    @NotNull
    public final LiveData<ExcuteStatus> a0() {
        return this.excuteStatus;
    }

    @NotNull
    public final LiveData<Boolean> b0() {
        return this.innerLoading;
    }

    public final void c0(@Nullable String aid, @Nullable String appCode) {
        t6b.b("DeleteCardViewModel", "enter initData");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DeleteCardViewModel$initData$1(aid, this, appCode, null), 3, null);
    }

    @NotNull
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final AtomicBoolean getIsDeleting() {
        return this.isDeleting;
    }

    public final void e0(String aid) {
        Bundle bundle = new Bundle();
        bundle.putString("from", "wear");
        fkj.d().g(b78.a(), "5", aid, "delete", bundle);
    }

    public final void f0() {
        us6 us6Var = new us6();
        us6Var.d(us6.NFC_DELETE_CARD);
        sr6.c().l(us6Var);
    }

    public final void g0() {
        us6 us6Var = new us6();
        us6Var.d(us6.NFC_DELETE_CARD);
        String strU = j7l.u();
        t6b.b("DeleteCardViewModel", "delete aid =" + this.mAid + "--->default aid =" + strU);
        if (StringsKt__StringsJVMKt.equals(this.mAid, strU, true)) {
            us6Var.c(true);
        }
        sr6.c().l(us6Var);
    }

    public final void h0(@Nullable String appCode) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DeleteCardViewModel$requestAuthToken$1(this, appCode, null), 3, null);
    }

    public final void i0() {
        t6b.b("DeleteCardViewModel", "startCountDown contDownV =" + this.contDownV);
        if (this.contDownV < 1 || this.isDeleting.get()) {
            return;
        }
        this.mReadCDTimer.start();
    }
}
