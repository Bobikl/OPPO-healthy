package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.oplus.accountsdk.base.common.net.data.AcSdkNetResponse;
import com.oplus.accountsdk.open.core.constants.AcOpenResponseEnum;
import com.platform.account.third.api.ThirdOauthType;
import com.platform.account.third.api.data.AuthorizedBean;
import com.platform.account.third.api.data.ThirdOauthResponse;

/* JADX INFO: loaded from: classes6.dex */
public class qe {
    public static /* synthetic */ void c(rl9 rl9Var, ThirdOauthResponse thirdOauthResponse) {
        rl9Var.a(AcSdkNetResponse.createSuccess((AuthorizedBean) thirdOauthResponse.getData()));
    }

    public boolean b(Context context) {
        return ivj.a(context).d().contains(ThirdOauthType.GG);
    }

    public void d(FragmentActivity fragmentActivity, @NonNull final rl9<AuthorizedBean> rl9Var) {
        bz9 bz9VarB = ivj.a(fragmentActivity).b(ThirdOauthType.GG);
        if (bz9VarB != null) {
            bz9VarB.reqOauth(fragmentActivity, new ys2() { // from class: com.oplus.aiunit.vision.pe
                @Override // com.oplus.aiunit.vision.ys2
                public final void a(ThirdOauthResponse thirdOauthResponse) {
                    qe.c(rl9Var, thirdOauthResponse);
                }
            });
        } else {
            AcOpenResponseEnum acOpenResponseEnum = AcOpenResponseEnum.THIRD_AUTH_GG_PROVIDER_ERROR;
            rl9Var.a(AcSdkNetResponse.createError(acOpenResponseEnum.getCode(), acOpenResponseEnum.getRemark(), ""));
        }
    }

    public void e(FragmentActivity fragmentActivity, @NonNull rl9<AuthorizedBean> rl9Var) {
    }
}
