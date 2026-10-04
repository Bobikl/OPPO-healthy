package com.example.opponotificationrelay;
import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import java.util.*;
import org.json.JSONObject;
public final class CloudSyncActivity extends OfficialUiActivity {
    private final Handler handler=new Handler(Looper.getMainLooper());
    private final Map<CloudCategory,OfficialStyleSwitch> switches=new EnumMap<>(CloudCategory.class);
    private final Map<CloudCategory,TextView> statuses=new EnumMap<>(CloudCategory.class);
    private OfficialStyleSwitch master;private LinearLayout options;private TextView overall,time;private Button now;
    private RadioGroup modes;private boolean rendering;private String account="";private long accountGeneration=-1;
    private final Runnable tick=new Runnable(){public void run(){render();handler.postDelayed(this,1000);}};
    private int dp(int n){return DeviceStyle.dp(this,n);}
    private LinearLayout column(){LinearLayout box=new LinearLayout(this);box.setOrientation(1);return box;}
    private TextView label(String text,int size,int color){TextView view=new TextView(this);view.setText(text);view.setTextSize(size);view.setTextColor(color);view.setLineSpacing(dp(3),1f);return view;}
    private LinearLayout card(LinearLayout parent){
        LinearLayout card=column();card.setPadding(dp(18),dp(12),dp(18),dp(12));card.setBackground(DeviceStyle.shape(DeviceStyle.CARD,18,this));
        LinearLayout.LayoutParams p=new LinearLayout.LayoutParams(-1,-2);p.bottomMargin=dp(14);parent.addView(card,p);return card;
    }
    private OfficialStyleSwitch toggle(LinearLayout parent,String title,String description){
        LinearLayout row=new LinearLayout(this);row.setGravity(Gravity.CENTER_VERTICAL);
        LinearLayout words=column();words.addView(label(title,17,DeviceStyle.TEXT));
        TextView hint=label(description,12,DeviceStyle.MUTED);hint.setPadding(0,dp(5),dp(12),0);words.addView(hint);
        row.addView(words,new LinearLayout.LayoutParams(0,-2,1));OfficialStyleSwitch toggle=new OfficialStyleSwitch(this);
        toggle.setContentDescription(title);row.addView(toggle,new LinearLayout.LayoutParams(-2,dp(52)));
        parent.addView(row);row.setOnClickListener(v->toggle.setChecked(!toggle.isChecked()));return toggle;
    }
    @Override protected void onUiCreate(Bundle saved){super.onUiCreate(saved);
        LinearLayout content=column();content.setPadding(dp(18),dp(18),dp(18),dp(24));ScrollView scroll=new ScrollView(this);scroll.addView(content);
        LinearLayout top=card(content);master=toggle(top,"健康云同步","将所选类别与当前账号的云端数据同步");
        overall=label("",13,DeviceStyle.MUTED);overall.setPadding(0,dp(10),0,0);top.addView(overall);
        TextView coverage=label("查看当前同步范围  ›",13,DeviceStyle.ACCENT);coverage.setPadding(0,dp(12),0,dp(4));top.addView(coverage);
        coverage.setOnClickListener(v->showCoverage());
        options=column();content.addView(options);
        LinearLayout actions=card(options);now=new Button(this);now.setText("立即同步");actions.addView(now,new LinearLayout.LayoutParams(-1,dp(52)));DeviceStyle.styleTree(now);
        now.setOnClickListener(v->{CloudSyncEngine.startManual(this);render();});
        TextView caption=label("同步模式",15,DeviceStyle.TEXT);caption.setPadding(0,dp(14),0,dp(6));actions.addView(caption);
        modes=new RadioGroup(this);String[] names={"每天定时同步","充电时同步","连接 Wi-Fi 时同步"};
        for(int i=0;i<names.length;i++){RadioButton radio=new RadioButton(this);radio.setId(4100+i);radio.setText(names[i]);radio.setTextColor(DeviceStyle.TEXT);radio.setTextSize(15);radio.setMinHeight(dp(48));modes.addView(radio);}
        actions.addView(modes);time=label("",15,DeviceStyle.ACCENT);time.setPadding(dp(8),dp(12),0,dp(12));actions.addView(time);
        time.setOnClickListener(v->new TimePickerDialog(this,(view,h,m)->{CloudSyncState.time(this,h,m);render();},CloudSyncState.hour(this),CloudSyncState.minute(this),true).show());
        TextView modeHint=label("自动同步需要网络。充电或 Wi-Fi 条件持续满足时，每小时检查一次；系统省电可能延后执行。",12,DeviceStyle.MUTED);modeHint.setPadding(0,dp(8),0,0);actions.addView(modeHint);
        for(CloudCategory category:CloudCategory.values()){
            LinearLayout box=card(options);OfficialStyleSwitch toggle=toggle(box,category.title,category.description);switches.put(category,toggle);
            TextView status=label("",12,DeviceStyle.MUTED);status.setPadding(0,dp(10),0,dp(2));box.addView(status);statuses.put(category,status);
            toggle.setOnCheckedChangeListener((button,on)->{if(!rendering){CloudSyncState.change(this,"category."+category.key,on);render();}});
        }
        master.setOnCheckedChangeListener((button,on)->{if(!rendering){CloudSyncState.change(this,"enabled",on);render();}});
        modes.setOnCheckedChangeListener((group,id)->{if(!rendering){CloudSyncState.mode(this,new String[]{"daily","charging","wifi"}[id-4100]);render();}});
        DeviceStyle.shell(this,"数据云同步",scroll);render();
    }
    private void showCoverage(){
        StringBuilder text=new StringBuilder("已开放云端下载的项目：\n");
        try{
            java.util.List<CloudStream> all=CloudStream.all(this);
            for(CloudCategory category:CloudCategory.values()){
                text.append("\n").append(category.title).append("：");
                boolean first=true;for(CloudStream stream:all)if(stream.category.equals(category.key)){
                    if(!first)text.append("、");text.append(stream.title);first=false;
                }
                text.append("\n");
            }
            text.append("\n作息、睡眠模式及睡眠目标等偏好的新修改支持上传并读回确认。")
                .append("\n健康记录上行仍在核对；运动轨迹、鼾声音频、档案附件及其他扩展项目尚未开放。")
                .append("\n每类显示的下载完成，仅代表上列已开放项目。空云账号的下载完成不代表该类型上行已验证。");
        }catch(Exception e){text.append("范围清单暂时无法读取");}
        TextView body=label(text.toString(),14,DeviceStyle.TEXT);body.setPadding(dp(20),dp(12),dp(20),dp(20));
        ScrollView scroll=new ScrollView(this);scroll.addView(body);
        new AlertDialog.Builder(this).setTitle("当前同步范围").setView(scroll).setPositiveButton("知道了",null).show();
    }
    private void render(){
        if(accountGeneration!=HealthAccountStore.generation()){try{JSONObject session=HealthAccountStore.load(this);account=session==null?"":CloudSyncEngine.accountKey(session.getString("account"));accountGeneration=HealthAccountStore.generation();}catch(Exception ignored){account="";}}
        rendering=true;try{
            boolean enabled=CloudSyncState.enabled(this);master.setChecked(enabled);options.setVisibility(enabled?View.VISIBLE:View.GONE);
            String message=!enabled?"已关闭":account.isEmpty()?"请先在「账号与登录」中登录":!CloudSyncState.any(this)?"请选择需要同步的数据类别":CloudSyncEngine.running()?CloudSyncEngine.progress():CloudSyncState.prefs(this).getString(account+".summary","等待同步");
            overall.setText(message);now.setEnabled(enabled&&!account.isEmpty()&&CloudSyncState.any(this)&&!CloudSyncEngine.running());
            String mode=CloudSyncState.mode(this);modes.check("charging".equals(mode)?4101:"wifi".equals(mode)?4102:4100);
            time.setVisibility("daily".equals(mode)?View.VISIBLE:View.GONE);time.setText(String.format(Locale.CHINA,"同步时间  %02d:%02d  ›",CloudSyncState.hour(this),CloudSyncState.minute(this)));
            for(CloudCategory category:CloudCategory.values()){switches.get(category).setChecked(CloudSyncState.selected(this,category));statuses.get(category).setText(account.isEmpty()?"登录后显示同步记录":CloudSyncState.result(this,account,category));}
        }finally{rendering=false;}
    }
    @Override protected void onUiResume(){super.onUiResume();handler.post(tick);}
    @Override protected void onUiPause(){handler.removeCallbacks(tick);super.onUiPause();}
    @Override protected void onUiDestroy(){handler.removeCallbacksAndMessages(null);super.onUiDestroy();}
}
