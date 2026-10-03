package com.heytap.accountsdk.authencation.inner;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.accountauthencation.c;
import com.heytap.accountsdk.authencation.R;
import com.heytap.accountsdk.authencation.UCAuthencationRequest;
import com.heytap.accountsdk.authencation.UCAuthencationResponse;
import com.heytap.accountsdk.authencation.bean.AuthBean;
import com.heytap.accountsdk.authencation.bean.AuthUserInfo;
import com.heytap.accountsdk.authencation.repository.AuthApi;
import com.heytap.nearx.uikit.widget.dialog.NearRotatingSpinnerDialog;
import com.heytap.usercenter.accountsdk.http.UCProviderRepository;
import com.oplus.aiunit.vision.bxf;
import com.oplus.aiunit.vision.ls2;
import com.oplus.aiunit.vision.ot2;
import com.platform.usercenter.basic.core.mvvm.CoreResponse;
import com.platform.usercenter.tools.ui.HomeKeyDispacherHelper;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class UCAuthContainerActivity extends AppCompatActivity implements HomeKeyDispacherHelper.HomeKeyDispatcherListener, IUCAuthencationCallback {
    public UCAuthencationRequest a;
    public HomeKeyDispacherHelper b;
    public String c;
    public AuthUserInfo.Response d;
    public NearRotatingSpinnerDialog e;

    public class a implements ot2<CoreResponse<AuthBean.Response>> {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        public void onFailure(@NotNull ls2<CoreResponse<AuthBean.Response>> ls2Var, @NotNull Throwable th) {
            if (TextUtils.equals(this.a, "PASSWORD")) {
                Toast.makeText((Context) UCAuthContainerActivity.this, R.string.uc_dialog_net_error_title, 0).show();
                UCAuthContainerActivity.b(UCAuthContainerActivity.this);
                return;
            }
            UCAuthencationResponse.sendErrorResult(UCAuthContainerActivity.this.a, UCAuthencationResponse.UCAuthencationError.AUTHENCATION_ERROR_AUTHTYPE_INVALIDATE, "only support password way : " + th.getMessage());
            UCAuthContainerActivity.this.finish();
        }

        public void onResponse(@NotNull ls2<CoreResponse<AuthBean.Response>> ls2Var, @NotNull bxf<CoreResponse<AuthBean.Response>> bxfVar) {
            if (bxfVar.a() == null) {
                UCAuthencationResponse.sendErrorResult(UCAuthContainerActivity.this.a, UCAuthencationResponse.UCAuthencationError.AUTHENCATION_ERROR_NETWORK, "auth response is null");
                return;
            }
            CoreResponse coreResponse = (CoreResponse) bxfVar.a();
            if (coreResponse.success) {
                UCAuthencationResponse.sendSuccessResult(UCAuthContainerActivity.this.a, ((AuthBean.Response) coreResponse.data).ticketNo);
                UCAuthContainerActivity.this.finish();
                return;
            }
            CoreResponse.ErrorResp errorResp = coreResponse.error;
            if (errorResp != null) {
                Toast.makeText((Context) UCAuthContainerActivity.this, (CharSequence) String.format("%s[%s]", errorResp.message, Integer.valueOf(errorResp.code)), 0).show();
                UCAuthContainerActivity.b(UCAuthContainerActivity.this);
            } else {
                Toast.makeText((Context) UCAuthContainerActivity.this, R.string.uc_dialog_net_error_title, 0).show();
                UCAuthContainerActivity.b(UCAuthContainerActivity.this);
            }
        }
    }

    public static void b(UCAuthContainerActivity uCAuthContainerActivity) {
        String str = uCAuthContainerActivity.a.formatTips;
        String str2 = uCAuthContainerActivity.d.accountName;
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_TIPS", str);
        bundle.putString("EXTRA_ACCOUNTNAME", str2);
        c cVar = new c();
        cVar.setArguments(bundle);
        cVar.show(uCAuthContainerActivity.getSupportFragmentManager(), "PASSWORD");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.heytap.accountsdk.authencation.inner.IUCAuthencationCallback
    public void onAuthFail(String str, String str2) {
        a();
        UCAuthencationResponse.sendErrorResult(this.a, str, str2);
        finish();
    }

    @Override // com.heytap.accountsdk.authencation.inner.IUCAuthencationCallback
    public void onAuthStart(String str, String str2) {
        NearRotatingSpinnerDialog nearRotatingSpinnerDialog = this.e;
        if (nearRotatingSpinnerDialog != null && !nearRotatingSpinnerDialog.isShowing()) {
            this.e.setTitle(R.string.uc_progress_title_validate);
            this.e.show();
        }
        ((AuthApi) UCProviderRepository.provideAccountService(AuthApi.class)).auth(new AuthBean.Request(this.c, str, str2)).h(new a(str2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.heytap.accountsdk.authencation.inner.IUCAuthencationCallback
    public void onAuthSuccess(String str) {
        a();
        UCAuthencationResponse.sendSuccessResult(this.a, str);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) {
        super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
        this.e = new NearRotatingSpinnerDialog(this);
        UCAuthencationRequest uCAuthencationRequest = (UCAuthencationRequest) getIntent().getParcelableExtra("EXTRA_REQUEST");
        this.a = uCAuthencationRequest;
        if (uCAuthencationRequest == null || !uCAuthencationRequest.availidate()) {
            UCAuthencationResponse.sendErrorResult(this.a, UCAuthencationResponse.UCAuthencationError.AUTHENCATION_ERROR_PARAM_INVALIDATE, "request param error");
            finish();
        } else {
            this.e.setTitle(R.string.NXtheme1_loading_dialog_text_view);
            UCAuthencationRequest uCAuthencationRequest2 = this.a;
            ((AuthApi) UCProviderRepository.provideAccountService(AuthApi.class)).authUserInfo(new AuthUserInfo.Request(uCAuthencationRequest2.userToken, uCAuthencationRequest2.ssoid)).h(new com.accountauthencation.a(this));
        }
        HomeKeyDispacherHelper homeKeyDispacherHelper = new HomeKeyDispacherHelper(this);
        this.b = homeKeyDispacherHelper;
        homeKeyDispacherHelper.registerHomeKeyPress(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        super.onDestroy();
        a();
        HomeKeyDispacherHelper homeKeyDispacherHelper = this.b;
        if (homeKeyDispacherHelper != null) {
            homeKeyDispacherHelper.unRegisterHomeKeyPress(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onHomeKeyPress() {
        UCAuthencationResponse.sendErrorResult(this.a, UCAuthencationResponse.UCAuthencationError.AUTHENCATION_ERROR_CANCLE, "home key press cancle");
        finish();
    }

    public static void a(Context context, UCAuthencationRequest uCAuthencationRequest) {
        Intent intent = new Intent(context, (Class<?>) UCAuthContainerActivity.class);
        intent.putExtra("EXTRA_REQUEST", uCAuthencationRequest);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    public final void a() {
        NearRotatingSpinnerDialog nearRotatingSpinnerDialog = this.e;
        if (nearRotatingSpinnerDialog == null || !nearRotatingSpinnerDialog.isShowing()) {
            return;
        }
        this.e.dismiss();
    }
}
