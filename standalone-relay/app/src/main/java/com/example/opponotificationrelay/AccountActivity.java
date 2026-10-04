package com.example.opponotificationrelay;
import android.os.Bundle;
import android.widget.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.*;
import org.json.JSONObject;

public final class AccountActivity extends OfficialUiActivity {
    private final ExecutorService worker=Executors.newSingleThreadExecutor();
    private TextView state,details;private Button importButton,verifyButton,clearButton,loginButton;private boolean busy;private long operation;
    @Override protected void onUiCreate(Bundle saved){super.onUiCreate(saved);
        LinearLayout content=new LinearLayout(this);content.setOrientation(1);content.setPadding(dp(22),dp(18),dp(22),dp(24));
        state=label("正在读取账号…",22);details=label("",14);content.addView(state);content.addView(details);
        loginButton=button(content,"独立登录");loginButton.setOnClickListener(v->independent());
        importButton=button(content,"使用已有账号登录");verifyButton=button(content,"重新验证登录");clearButton=button(content,"退出本应用账号");
        TextView help=label("导入时读取官方健康保存的账号凭据。导入后，由本应用独立连接账号服务器，凭据加密保存在本机。",14);
        help.setTextColor(DeviceStyle.MUTED);help.setPadding(0,dp(22),0,0);content.addView(help);
        ScrollView scroll=new ScrollView(this);scroll.addView(content);DeviceStyle.shell(this,"账号与登录",scroll);DeviceStyle.styleTree(content);
        importButton.setOnClickListener(v->run(true));verifyButton.setOnClickListener(v->run(false));clearButton.setOnClickListener(v->clear());
        refresh(null);
    }
    private int dp(int value){return DeviceStyle.dp(this,value);}
    private TextView label(String text,int size){TextView view=new TextView(this);view.setText(text);view.setTextSize(size);view.setTextColor(DeviceStyle.TEXT);view.setPadding(0,dp(8),0,dp(8));return view;}
    private Button button(LinearLayout parent,String text){Button button=new Button(this);button.setText(text);parent.addView(button,new LinearLayout.LayoutParams(-1,dp(54)));return button;}
    private void refresh(String notice){
        try{JSONObject session=HealthAccountStore.load(this);
            state.setText(session==null?"尚未登录":"账号已保存");
            if(session==null)details.setText(notice==null?"登录后可验证本应用与官方账号服务的连接。":notice);
            else {String account=session.getString("account");String masked=account.length()>6?account.substring(0,3)+"****"+account.substring(account.length()-3):"已绑定账号";
                long time=session.optLong("verifiedAt");details.setText(masked+"\n"+(time>0?"最近验证："+new SimpleDateFormat("MM-dd HH:mm:ss",Locale.CHINA).format(new Date(time)):"尚未完成服务器验证")+(notice==null?"":"\n"+notice));}
            verifyButton.setEnabled(!busy&&session!=null);clearButton.setEnabled(!busy&&session!=null);
        }catch(Exception e){state.setText("无法读取已保存账号");details.setText(HealthAccountClient.message(e));verifyButton.setEnabled(false);clearButton.setEnabled(!busy);}
        importButton.setEnabled(!busy);loginButton.setEnabled(!busy);
    }
    private void run(boolean migrate){
        if(busy)return;busy=true;operation=HealthAccountStore.begin();final long expected=operation;refresh(null);state.setText(migrate?"正在导入并验证…":"正在验证登录…");
        worker.execute(()->{
            String notice;
            try{
                JSONObject session=migrate?HealthAccountImporter.read(this):HealthAccountStore.load(this);
                if(session==null)throw new java.io.IOException("ACCOUNT_MISSING");
                if(!migrate&&"independent-sdk".equals(session.optString("source")))session=AccountSdk.fresh(this,session);
                HealthAccountStore.save(this,HealthAccountClient.login(session),expected);notice="服务器验证通过，账号一致。";
            }catch(Exception e){notice=HealthAccountClient.message(e);}
            final String result=notice;runOnUiThread(()->{if(isFinishing()||isDestroyed())return;busy=false;refresh(result);});
        });
    }
    private void independent(){
        if(busy)return;
        try{
            JSONObject configuration=HealthAccountStore.configuration(this);
            if(configuration==null){refresh("请先导入一次应用配置，再使用独立登录。");return;}
            busy=true;operation=HealthAccountStore.begin();final long expected=operation;refresh(null);state.setText("正在打开登录页面…");
            AccountSdk.login(this,configuration,(session,failure)->{
                Throwable error=failure;
                if(error==null)try{HealthAccountStore.save(this,session,expected);}catch(Throwable e){error=e;}
                final Throwable result=error;
                runOnUiThread(()->{if(isFinishing()||isDestroyed())return;busy=false;refresh(result==null?"独立登录成功，服务器验证通过。":HealthAccountClient.message(result));});
            });
        }catch(Exception e){busy=false;refresh(HealthAccountClient.message(e));}
    }
    private void clear(){
        if(busy)return;busy=true;operation=HealthAccountStore.begin();refresh(null);state.setText("正在退出账号…");
        worker.execute(()->{
            Throwable failure=null;
            try{AccountSdk.clearLocal(this);HealthAccountStore.clear(this);}catch(Throwable e){failure=e;}
            final Throwable error=failure;
            runOnUiThread(()->{
                if(isFinishing()||isDestroyed())return;
                if(error!=null){busy=false;refresh(HealthAccountClient.message(error));return;}
                android.webkit.CookieManager.getInstance().removeAllCookies(removed->{
                    android.webkit.CookieManager.getInstance().flush();android.webkit.WebStorage.getInstance().deleteAllData();
                    if(isFinishing()||isDestroyed())return;busy=false;refresh("已退出本应用账号。");
                });
            });
        });
    }
    @Override protected void onUiDestroy(){if(busy)HealthAccountStore.cancel(operation);worker.shutdownNow();super.onUiDestroy();}
}
