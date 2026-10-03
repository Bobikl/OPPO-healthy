package com.heytap.health.wallet.nfc;

import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.wallet.BaseActivityEx;
import com.heytap.health.wallet.bean.Command;
import com.heytap.health.wallet.bean.Content;
import com.heytap.health.wallet.bean.TaskResult;
import com.heytap.health.wallet.sdk.nfc.service.ISmartcardFormatCallback;
import com.heytap.health.wallet.sdk.nfc.service.ISmartcardFormatService;
import com.heytap.store.base.core.http.HttpUtils;
import com.heytap.wallet.business.common.util.CmdExecUtils;
import com.heytap.wallet.business.common.util.ExecutorParam;
import com.oplus.aiunit.vision.aec;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.erc;
import com.oplus.aiunit.vision.hrc;
import com.oplus.aiunit.vision.ms5;
import com.oplus.aiunit.vision.qe0;
import com.oplus.aiunit.vision.sr0;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.tpc;
import com.oplus.aiunit.vision.v60;
import com.oplus.aiunit.vision.y0k;
import com.oplus.aiunit.vision.ydc;
import com.oplus.aiunit.vision.z0k;
import com.oplus.aiunit.vision.zik;
import com.oppo.lib.common.R$string;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes18.dex */
@Route(path = "/nfc/SEITest")
public class SEITestActivity extends BaseActivityEx implements View.OnClickListener {
    public static final String MSG = "msg";
    public ExecutorParam A;
    public ISmartcardFormatService u;
    public hrc z;
    public final String t = SEITestActivity.class.getSimpleName();
    public final String[] v = {"创建AMSD", "删除AMSD", "查看ARA-M注册应用", "解锁安全域", "解锁VFC安全域", "put测试秘钥", "清除SE芯片", "升级Cap", "安装Cap"};
    public ServiceConnection w = new a();
    public ISmartcardFormatCallback.Stub x = new ISmartcardFormatCallback.Stub() { // from class: com.heytap.health.wallet.nfc.SEITestActivity.2

        /* JADX INFO: renamed from: com.heytap.health.wallet.nfc.SEITestActivity$2$a */
        public class a implements Runnable {
            public final /* synthetic */ String i;

            public a(String str) {
                this.i = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                z0k.f(b78.a()).q(this.i);
            }
        }

        @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardFormatCallback
        public void onFinished(String str) throws RemoteException {
            t6b.i(SEITestActivity.this.t, "onFinished_finished:" + str);
            sr0.e(new a(str));
        }

        @Override // com.heytap.health.wallet.sdk.nfc.service.ISmartcardFormatCallback
        public void onProgress(String str) throws RemoteException {
            t6b.i(SEITestActivity.this.t, "onProgress_finished:" + str);
        }
    };
    public StringBuilder y = new StringBuilder(100);
    public final Observer B = new Observer() { // from class: com.oplus.aiunit.vision.k5g
        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            this.i.H7(observable, obj);
        }
    };

    public class a implements ServiceConnection {

        /* JADX INFO: renamed from: com.heytap.health.wallet.nfc.SEITestActivity$a$a, reason: collision with other inner class name */
        public class RunnableC0677a implements Runnable {
            public RunnableC0677a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    SEITestActivity.this.u.formatCards(null, SEITestActivity.this.x);
                } catch (RemoteException e2) {
                    t6b.d(SEITestActivity.this.t, "RemoteException:" + e2.getMessage());
                }
            }
        }

        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onBindingDied(ComponentName componentName) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            SEITestActivity.this.u = ISmartcardFormatService.Stub.asInterface(iBinder);
            sr0.i(new RunnableC0677a());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            SEITestActivity.this.u = null;
            z0k.f(b78.a()).q("服务连接失败，请重试");
        }
    }

    public class b implements zik.d {

        public class a implements DialogInterface.OnClickListener {
            public a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: renamed from: com.heytap.health.wallet.nfc.SEITestActivity$b$b, reason: collision with other inner class name */
        public class DialogInterfaceOnClickListenerC0678b implements DialogInterface.OnClickListener {
            public DialogInterfaceOnClickListenerC0678b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }

        public class c implements DialogInterface.OnClickListener {
            public c() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }

        public class d implements DialogInterface.OnClickListener {
            public d() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }

        public b() {
        }

        @Override // com.oplus.aiunit.vision.zik.d
        public void a(String str, String str2) {
            SEITestActivity.this.m7();
            ms5.e(SEITestActivity.this, "", "onFailed,code=" + str + ",msg" + HttpUtils.EQUAL_SIGN + str2, "", SEITestActivity.this.getResources().getString(R$string.sure), new c(), new d(), false);
        }

        @Override // com.oplus.aiunit.vision.zik.d
        public void onSuccess(String str) {
            SEITestActivity.this.m7();
            SEITestActivity sEITestActivity = SEITestActivity.this;
            ms5.e(sEITestActivity, "", "执行成功", "", sEITestActivity.getResources().getString(R$string.sure), new a(), new DialogInterfaceOnClickListenerC0678b(), false);
        }
    }

    public class c implements zik.d {

        public class a implements DialogInterface.OnClickListener {
            public a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }

        public class b implements DialogInterface.OnClickListener {
            public b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: renamed from: com.heytap.health.wallet.nfc.SEITestActivity$c$c, reason: collision with other inner class name */
        public class DialogInterfaceOnClickListenerC0679c implements DialogInterface.OnClickListener {
            public DialogInterfaceOnClickListenerC0679c() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }

        public class d implements DialogInterface.OnClickListener {
            public d() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }

        public c() {
        }

        @Override // com.oplus.aiunit.vision.zik.d
        public void a(String str, String str2) {
            SEITestActivity.this.m7();
            ms5.e(SEITestActivity.this, "", "onFailed,code=" + str + ",msg" + HttpUtils.EQUAL_SIGN + str2, "", SEITestActivity.this.getResources().getString(R$string.sure), new DialogInterfaceOnClickListenerC0679c(), new d(), false);
        }

        @Override // com.oplus.aiunit.vision.zik.d
        public void onSuccess(String str) {
            SEITestActivity.this.m7();
            SEITestActivity sEITestActivity = SEITestActivity.this;
            ms5.e(sEITestActivity, "", "执行成功", "", sEITestActivity.getResources().getString(R$string.sure), new a(), new b(), false);
        }
    }

    public class d implements erc.c {
        public d() {
        }

        @Override // com.oplus.aiunit.vision.erc.c
        public void a(String str, String str2) {
            z0k.f(SEITestActivity.this).t(SEITestActivity.this, "AMSD create failed.");
        }

        @Override // com.oplus.aiunit.vision.erc.c
        public void onSuccess(String str) {
            z0k.f(SEITestActivity.this).t(SEITestActivity.this, "AMSD create success.");
        }
    }

    public class e implements erc.c {
        public e() {
        }

        @Override // com.oplus.aiunit.vision.erc.c
        public void a(String str, String str2) {
            z0k.f(SEITestActivity.this).t(SEITestActivity.this, "AMSD delete failed.");
        }

        @Override // com.oplus.aiunit.vision.erc.c
        public void onSuccess(String str) {
            z0k.f(SEITestActivity.this).t(SEITestActivity.this, "AMSD delete success.");
        }
    }

    public class f implements v60<TaskResult> {
        public f() {
        }

        @Override // com.oplus.aiunit.vision.v60
        public void a(Object obj) {
        }

        @Override // com.oplus.aiunit.vision.v60
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(TaskResult taskResult) {
            if (taskResult.getResultCode() == 9000) {
                t6b.b(SEITestActivity.this.t, "query success.");
            }
        }
    }

    public class g implements hrc.d {
        public final /* synthetic */ String a;

        public g(String str) {
            this.a = str;
        }

        @Override // com.oplus.aiunit.vision.hrc.d
        public void a(String str, String str2) {
            CmdExecUtils.c(CmdExecUtils.a(this.a), "");
            y0k.h("" + this.a + " failed:" + str + "," + str2);
        }

        @Override // com.oplus.aiunit.vision.hrc.d
        public void onSuccess(String str) {
            CmdExecUtils.e(CmdExecUtils.a(this.a), "");
            y0k.h("" + this.a + " success:" + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H7(Observable observable, Object obj) {
        String str = this.t;
        StringBuilder sb = new StringBuilder();
        sb.append("received type: ");
        sb.append(obj == null ? "null" : obj.getClass());
        t6b.b(str, sb.toString());
        if (!(obj instanceof String)) {
            t6b.b(this.t, "received disMatched type!");
            return;
        }
        String string = obj.toString();
        t6b.f(this.t, "received " + string + " command!");
        F7(string);
    }

    public final Content B7() {
        Content content = new Content();
        String[] strArr = {"00A4040009A00000015141434C00", "80CAFF4000", "80F24000024F00"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            Command command = new Command();
            command.setIndex(String.valueOf(i));
            command.setCommand(strArr[i]);
            arrayList.add(command);
        }
        content.setCommands(arrayList);
        return content;
    }

    public final void C7() {
        if (qe0.E()) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.heytap.health.wallet.sdk.nfc.action.FORMAT_SERVIC");
        intent.setPackage(getPackageName());
        bindService(intent, this.w, 1);
    }

    public final void D7() {
        erc ercVar = new erc(aec.i());
        ExecutorParam executorParam = new ExecutorParam();
        executorParam.appCode = "createamsd";
        executorParam.orderNo = null;
        executorParam.commandType = "createamsd";
        executorParam.singData = null;
        executorParam.strExtraInfo = null;
        executorParam.mobNum = null;
        executorParam.type = 6;
        executorParam.aid = null;
        executorParam.isSendEvent = true;
        executorParam.cardNo = null;
        executorParam.balance = null;
        ercVar.h(executorParam, new d(), null);
    }

    public final void E7() {
        erc ercVar = new erc(aec.i());
        ExecutorParam executorParam = new ExecutorParam();
        executorParam.appCode = "deleteamsd";
        executorParam.orderNo = null;
        executorParam.commandType = "deleteamsd";
        executorParam.singData = null;
        executorParam.strExtraInfo = null;
        executorParam.mobNum = null;
        executorParam.type = 6;
        executorParam.aid = null;
        executorParam.isSendEvent = true;
        executorParam.cardNo = null;
        executorParam.balance = null;
        ercVar.h(executorParam, new e(), null);
    }

    public final void F7(String str) {
        if (this.z == null) {
            this.z = new hrc(aec.i());
        }
        ExecutorParam executorParam = new ExecutorParam();
        this.A = executorParam;
        executorParam.commandType = str;
        this.z.f(executorParam, new g(str), null);
    }

    public final LinearLayout.LayoutParams G7() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 30, 0, 0);
        return layoutParams;
    }

    public final void I7() {
        tpc.b().c(B7(), new f());
    }

    public final void J7(String str, String str2) throws Exception {
        zik zikVar = new zik(this, str2);
        zikVar.f19436e = str;
        A();
        zikVar.h(null, null, null, null, null, new c(), null);
    }

    public final void K7(String str, String str2) throws Exception {
        zik zikVar = new zik(this, str2);
        zikVar.f19436e = str;
        A();
        zikVar.h(null, null, null, null, null, new b(), null);
    }

    @Override // com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    public final void initUI() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        int length = this.v.length;
        t6b.a("button count : " + length);
        for (int i = 0; i < length; i++) {
            Button button = new Button(this);
            button.setText(this.v[i]);
            button.setTag(Integer.valueOf(i));
            button.setOnClickListener(this);
            linearLayout.addView(button, G7());
        }
        setContentView(linearLayout);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws Exception {
        switch (((Integer) view.getTag()).intValue()) {
            case 0:
                D7();
                break;
            case 1:
                E7();
                break;
            case 2:
                I7();
                break;
            case 3:
                J7(null, aec.i());
                break;
            case 4:
                J7("A0000001515350414F50504F", aec.i());
                break;
            case 5:
                K7(null, aec.i());
                break;
            case 6:
                C7();
                break;
        }
    }

    @Override // com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ydc.n().b(this.B);
        initUI();
    }

    @Override // com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        ydc.n().k(this.B);
        super.onDestroy();
    }
}
