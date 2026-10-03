package com.heytap.usercenter.accountsdk;

import android.content.Context;
import android.text.TextUtils;
import com.heytap.usercenter.accountsdk.http.IAsyncTaskExecutor;
import com.heytap.usercenter.accountsdk.model.AccountEntity;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.log.UCLogUtil;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Deprecated
public abstract class AccountAsyncTask {
    private final Context mContext;

    public class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ IAsyncTaskExecutor b;

        /* JADX INFO: renamed from: com.heytap.usercenter.accountsdk.AccountAsyncTask$a$a, reason: collision with other inner class name */
        public class RunnableC0810a implements Runnable {
            final /* synthetic */ AccountEntity a;

            public RunnableC0810a(AccountEntity accountEntity) {
                this.a = accountEntity;
            }

            @Override // java.lang.Runnable
            public void run() {
                AccountAsyncTask.this.onPostExecute(this.a);
            }
        }

        public a(String str, IAsyncTaskExecutor iAsyncTaskExecutor) {
            this.a = str;
            this.b = iAsyncTaskExecutor;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            AccountEntity accountEntityDoInBackground = AccountAsyncTask.this.doInBackground(this.a);
            StringBuilder sb = new StringBuilder();
            sb.append("AccountAsyncTask ");
            if (accountEntityDoInBackground == null) {
                str = "entity is null";
            } else {
                str = "token is null ? = " + TextUtils.isEmpty(accountEntityDoInBackground.authToken);
            }
            sb.append(str);
            UCLogUtil.e(sb.toString());
            this.b.runOnMainThread(new RunnableC0810a(accountEntityDoInBackground));
        }
    }

    public AccountAsyncTask(Context context, String str) {
        this.mContext = context.getApplicationContext();
        onPreExecute();
        IAsyncTaskExecutor asyncTaskExecutor = UCDispatcherManager.getInstance().getAsyncTaskExecutor();
        asyncTaskExecutor.runOnAsyncExecutor(new a(str, asyncTaskExecutor));
    }

    public AccountEntity doInBackground(String str) {
        return AccountAgent.getAccountEntity(this.mContext, str);
    }

    public abstract void onPostExecute(AccountEntity accountEntity);

    public void onPreExecute() {
    }
}
