package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.oplus.accountsdk.base.common.net.data.AcSdkNetResponse;
import com.oplus.accountsdk.open.core.constants.AcOpenResponseEnum;
import com.oplus.accountsdk.open.core.third.AcOpenOpAuthParams;

/* JADX INFO: loaded from: classes6.dex */
public class wf {

    public class a extends oh<Activity> {
        public final /* synthetic */ rl9 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Looper looper, Activity activity, rl9 rl9Var) {
            super(looper, activity);
            this.b = rl9Var;
        }

        @Override // com.oplus.aiunit.vision.oh
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Message message, Activity activity) {
            String string;
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                this.b.a(AcSdkNetResponse.createError(AcOpenResponseEnum.THIRD_AUTH_OP_RESPONSE_ERROR.getCode(), "Activity已销毁", ""));
                return;
            }
            Bundle data = message.getData();
            if (data != null && (string = data.getString("KEY_REQUEST_INTENT_EXTRA_AUTH_RESULT", "")) != null && !TextUtils.isEmpty(string)) {
                this.b.a(AcSdkNetResponse.createSuccess(string));
                return;
            }
            rl9 rl9Var = this.b;
            AcOpenResponseEnum acOpenResponseEnum = AcOpenResponseEnum.THIRD_AUTH_OP_RESPONSE_ERROR;
            rl9Var.a(AcSdkNetResponse.createError(acOpenResponseEnum.getCode(), acOpenResponseEnum.getRemark(), ""));
        }
    }

    @NonNull
    public final oh<Activity> a(Activity activity, @NonNull rl9<String> rl9Var) {
        return new a(Looper.getMainLooper(), activity, rl9Var);
    }

    public boolean b(Context context) {
        Bundle bundleCall = context.getContentResolver().call(Uri.parse("content://com.usercenter.authorities.provider.open"), "getOverseaOpLogin", "", new Bundle());
        return bundleCall != null && bundleCall.getBoolean("isLogin", false);
    }

    public boolean c(Context context) {
        return new Intent("com.usercenter.action.activity.FROM_OP_AUTH").resolveActivity(context.getPackageManager()) != null;
    }

    public void d(Activity activity, @NonNull rl9<String> rl9Var) {
        Intent intent = new Intent("com.usercenter.action.activity.FROM_OP_AUTH");
        intent.addFlags(67108864);
        AcOpenOpAuthParams acOpenOpAuthParams = new AcOpenOpAuthParams();
        acOpenOpAuthParams.packageName = activity.getPackageName();
        acOpenOpAuthParams.appName = activity.getString(activity.getApplicationInfo().labelRes);
        intent.putExtra("extra_action_appinfo_key", xa.d(acOpenOpAuthParams));
        intent.putExtra("KEY_MESSENGER", new Messenger(a(activity, rl9Var)));
        activity.startActivity(intent);
    }
}
