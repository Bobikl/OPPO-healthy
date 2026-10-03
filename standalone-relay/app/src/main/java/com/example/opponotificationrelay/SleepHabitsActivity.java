package com.example.opponotificationrelay;

import android.app.*;
import android.content.Intent;
import android.os.*;
import android.view.*;
import android.widget.*;
import org.json.*;
import java.util.*;

/** Sleep habits, time pickers and reminders in the official device-page hierarchy. */
public final class SleepHabitsActivity extends OfficialUiActivity {
    private SleepHabitsRepository repo;private SleepHabitsRepository.Snapshot snapshot;
    private ScrollView scroll;private LinearLayout content;private TextView refresh;private final Handler ui=new Handler(Looper.getMainLooper());
    private String rendered="";
    private final Runnable tick=new Runnable(){public void run(){render();ui.postDelayed(this,500);}};
    private int dp(int n){return DeviceStyle.dp(this,n);}
    private TextView text(String s,int size,int color){TextView v=new TextView(this);v.setText(s);v.setTextSize(size);v.setTextColor(color);v.setLineSpacing(dp(3),1);return v;}
    private LinearLayout vertical(){LinearLayout v=new LinearLayout(this);v.setOrientation(LinearLayout.VERTICAL);return v;}
    private void heading(String s){TextView v=text(s,14,DeviceStyle.MUTED);v.setPadding(dp(4),dp(20),0,dp(9));content.addView(v);}
    private LinearLayout card(){LinearLayout c=vertical();c.setBackground(DeviceStyle.shape(0xff303030,16,this));content.addView(c,new LinearLayout.LayoutParams(-1,-2));return c;}
    private void row(LinearLayout card,String title,String hint,String value,Boolean on,boolean enabled,Runnable action){
        if(card.getChildCount()>0){View line=new View(this);line.setBackgroundColor(0xff424242);LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(-1,dp(1));lp.setMargins(dp(18),0,dp(18),0);card.addView(line,lp);}
        LinearLayout row=new LinearLayout(this);row.setGravity(Gravity.CENTER_VERTICAL);row.setPadding(dp(18),dp(14),dp(18),dp(14));LinearLayout labels=vertical();labels.addView(text(title,18,DeviceStyle.TEXT));
        if(hint!=null && !hint.isEmpty()){TextView h=text(hint,13,DeviceStyle.MUTED);LinearLayout.LayoutParams hp=new LinearLayout.LayoutParams(-1,-2);hp.topMargin=dp(5);labels.addView(h,hp);}row.addView(labels,new LinearLayout.LayoutParams(0,-2,1));
        if(on!=null){OfficialStyleSwitch toggle=new OfficialStyleSwitch(this);toggle.setChecked(on);toggle.setContentDescription(title);toggle.setEnabled(enabled);row.addView(toggle,new LinearLayout.LayoutParams(-2,dp(48)));toggle.setOnCheckedChangeListener((b,checked)->action.run());}
        else {TextView right=text(value==null?"›":value+"  ›",15,enabled?DeviceStyle.ACCENT:DeviceStyle.MUTED);right.setPadding(dp(8),0,0,0);row.addView(right,new LinearLayout.LayoutParams(-2,-2));}
        row.setEnabled(enabled);row.setOnClickListener(v->action.run());card.addView(row,new LinearLayout.LayoutParams(-1,-2));
    }
    @Override protected void onUiCreate(Bundle saved){super.onUiCreate(saved);HealthSyncManager.get(this).interactive(true);repo=SleepHabitsRepository.get(this);
        scroll=new ScrollView(this);scroll.setFillViewport(true);scroll.setVerticalScrollBarEnabled(false);content=vertical();content.setFocusableInTouchMode(true);content.setDescendantFocusability(android.view.ViewGroup.FOCUS_BEFORE_DESCENDANTS);content.setPadding(dp(18),0,dp(18),dp(30));scroll.addView(content);
        LinearLayout shell=DeviceStyle.shell(this,"作息习惯与提醒",scroll);LinearLayout bar=(LinearLayout)shell.getChildAt(0);refresh=text("刷新",15,DeviceStyle.ACCENT);refresh.setGravity(Gravity.CENTER);bar.addView(refresh,new LinearLayout.LayoutParams(-2,dp(48)));refresh.setOnClickListener(v->repo.load());repo.load();render();}
    @Override protected void onUiResume(){super.onUiResume();HealthSyncManager.get(this).interactive(true);rendered="";ui.post(tick);}
    @Override protected void onUiPause(){ui.removeCallbacks(tick);HealthSyncManager.get(this).interactive(false);super.onUiPause();}
    private void render(){
        snapshot=repo.snapshot();String identity=snapshot.revision+":"+snapshot.busy+":"+snapshot.modeKnown+":"+snapshot.pending+":"+snapshot.message;
        if(identity.equals(rendered))return;rendered=identity;refresh.setEnabled(!snapshot.busy);refresh.setAlpha(snapshot.busy?.4f:1f);int savedY=scroll.getScrollY();content.removeAllViews();content.requestFocus();
        TextView status=text(snapshot.message,14,DeviceStyle.MUTED);status.setPadding(dp(4),dp(16),dp(4),dp(8));content.addView(status);
        JSONObject v=snapshot.values();boolean ready=snapshot.loaded&&!snapshot.busy&&!snapshot.pending;long revision=snapshot.revision;
        if(snapshot.pending){
            boolean canSync=v.optInt("accord",-1)>=0&&v.optInt("sync",-1)>=0;
            LinearLayout recovery=card();
            row(recovery,canSync?"恢复睡眠模式":"解除未确认状态",canSync?"核对并重新同步当前显示的模式开关":"先核对手表上的设置，再解除未确认标记",null,null,snapshot.loaded&&!snapshot.busy,()->new AlertDialog.Builder(this)
                .setTitle(canSync?"恢复睡眠模式？":"解除未确认状态？").setMessage(canSync?"将按当前显示的开关重新同步睡眠模式，并清除上次未确认标记。上次的提醒、目标或作息修改不会自动重发，请在手表上核对。":"缺少睡眠模式记录。此操作只清除未确认标记，不向手表发送设置。请先核对手表上的提醒、目标和作息；解除后可以逐项重新保存。")
                .setNegativeButton("取消",null).setPositiveButton(canSync?"恢复":"已核对，解除",(d,w)->{if(!repo.recoverPending(revision))Toast.makeText(this,"设置已更新，请刷新后重试",Toast.LENGTH_SHORT).show();rendered="";render();}).show());
        }
        heading("自动开启睡眠模式");LinearLayout modes=card();
        row(modes,"按照作息习惯",snapshot.modeKnown?"按所设时间自动进入或退出睡眠模式":(snapshot.accord>=0?"上次确认的状态；请刷新更新":"等待从手表读取当前状态"),null,snapshot.accord==1,ready&&snapshot.modeKnown,()->save("accord",snapshot.accord==1?0:1,revision));
        JSONArray rests=v.optJSONArray("rests");int count=rests==null?0:rests.length();
        row(modes,"作息习惯设定","就寝、起床时间与重复日期",count+" 项作息",null,ready,()->showRests(snapshot));
        heading("睡眠提醒");LinearLayout reminders=card();
        row(reminders,"睡眠目标","目标睡眠时长",duration(v.optInt("goal",-1)),null,ready,()->pickDuration("goal","睡眠目标",v.optInt("goal",-1),30,1320,15,revision));
        int bed=v.optInt("bedOn",-1);row(reminders,"睡眠提醒",bed<0?"未设置，请先选择提醒时间":"在就寝前提醒",null,bed==1,ready,()->save("bedOn",bed==1?0:1,revision));
        row(reminders,"提前提醒时间","按照作息中的就寝时间提醒",duration(v.optInt("bedTime",-1)),null,ready,()->pickDuration("bedTime","提前提醒时间",v.optInt("bedTime",-1),0,180,1,revision));
        int music=v.optInt("music",-1);row(reminders,"入睡暂停音乐播放",music<0?"尚无本机记录":"睡着后自动暂停手表音乐",null,music==1,ready,()->save("music",music==1?0:1,revision));
        heading("其他提醒");LinearLayout other=card();
        row(other,"午休时静默手机通知",NapQuietSettings.enabled(this)?NapQuietPolicy.time(NapQuietSettings.start(this))+"–"+NapQuietPolicy.time(NapQuietSettings.end(this)):"已关闭",null,null,true,()->startActivity(new Intent(this,NapSettingsActivity.class)));
        TextView note=text("作息和提醒以官方本机记录初始化，修改后由独立版保存并同步手表。重新使用官方健康后，请核对两边的设置。",13,DeviceStyle.MUTED);note.setPadding(dp(4),dp(18),dp(4),0);content.addView(note);scroll.post(()->scroll.scrollTo(0,savedY));
    }
    private static String clock(int n){if(n<0)return "未设置";try{return SleepSettingsProtocol.time(n);}catch(IllegalArgumentException e){return "未设置";}}
    private static String duration(int n){if(n<0)return "未设置";try{int m=SleepSettingsProtocol.minutes(n);if(m==0)return "准时提醒";return m>=60?(m/60+" 小时"+(m%60==0?"":" "+m%60+" 分钟")):m+" 分钟";}catch(IllegalArgumentException e){return "未设置";}}
    private void save(String key,Object value,long revision){if(!repo.save(key,value,revision))Toast.makeText(this,"设置已更新，请刷新后重试",Toast.LENGTH_SHORT).show();rendered="";render();}
    private interface TimeResult {void selected(int packed);}
    private void pickClock(String title,int value,TimeResult result){int minutes=value<0?0:SleepSettingsProtocol.minutes(value);OfficialTimePicker.show(this,title,minutes,picked->result.selected(SleepSettingsProtocol.pack(picked)));}
    private void pickDuration(String key,String title,int value,int min,int max,int step,long revision){
        int count=(max-min)/step+1;String[] labels=new String[count];for(int i=0;i<count;i++)labels[i]=duration(SleepSettingsProtocol.pack(min+i*step));
        int selected=value<0?("goal".equals(key)?480:15):SleepSettingsProtocol.minutes(value);
        OfficialTimePicker.showValues(this,title,labels,(selected-min)/step,chosen->save(key,SleepSettingsProtocol.pack(min+chosen*step),revision));
    }
    private static String days(int mask){if(mask==127)return "每天";String[] day={"一","二","三","四","五","六","日"};StringBuilder s=new StringBuilder("周");for(int i=0;i<7;i++)if((mask&(1<<i))!=0){if(s.length()>1)s.append("、");s.append(day[i]);}return s.toString();}
    private void showRests(SleepHabitsRepository.Snapshot current){
        try{JSONArray rests=current.values().getJSONArray("rests");String[] labels=new String[rests.length()];
            for(int i=0;i<rests.length();i++){JSONObject r=rests.getJSONObject(i);labels[i]=r.optString("name","作息 "+(i+1))+"  "+clock(r.getInt("bedTime"))+"–"+clock(r.getInt("wakeUpTime"))+"  "+days(r.getInt("userDefinedDate"));}
            new AlertDialog.Builder(this).setTitle("作息习惯设定").setItems(labels,(d,which)->editRest(current,rests,which)).setPositiveButton("添加作息",(d,w)->editRest(current,rests,-1)).setNegativeButton("返回",null).show();
        }catch(Exception e){Toast.makeText(this,"作息记录无法读取，请刷新",Toast.LENGTH_SHORT).show();}
    }
    private void editRest(SleepHabitsRepository.Snapshot current,JSONArray original,int index){
        try{
            JSONObject rest=index>=0?new JSONObject(original.getJSONObject(index).toString()):new JSONObject().put("createTime",System.currentTimeMillis()/1000).put("name","作息 "+(original.length()+1)).put("bedTime",SleepSettingsProtocol.pack(23*60)).put("wakeUpTime",SleepSettingsProtocol.pack(7*60)).put("userDefinedDate",31).put("restType",0).put("excludeHoliday",0);
            LinearLayout box=vertical();box.setPadding(dp(24),dp(8),dp(24),dp(8));EditText name=new EditText(this);name.setSingleLine(true);name.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(30)});name.setText(rest.optString("name"));name.setHint("作息名称");box.addView(name);
            for(String field:new String[]{"bedTime","wakeUpTime"}){String title=field.equals("bedTime")?"就寝时间":"起床时间";TextView row=text(title+"    "+clock(rest.getInt(field)),17,DeviceStyle.ACCENT);row.setPadding(0,dp(16),0,dp(16));box.addView(row);row.setOnClickListener(v->pickClock(title,rest.optInt(field),packed->{try{rest.put(field,packed);row.setText(title+"    "+clock(packed));}catch(JSONException ignored){}}));}
            TextView repeats=text("重复    "+days(rest.getInt("userDefinedDate")),17,DeviceStyle.ACCENT);repeats.setPadding(0,dp(16),0,dp(16));box.addView(repeats);
            repeats.setOnClickListener(v->{int mask=rest.optInt("userDefinedDate");boolean[] checked=new boolean[7];for(int i=0;i<7;i++)checked[i]=(mask&(1<<i))!=0;new AlertDialog.Builder(this).setTitle("重复日期").setMultiChoiceItems(new String[]{"星期一","星期二","星期三","星期四","星期五","星期六","星期日"},checked,(d,which,on)->checked[which]=on).setNegativeButton("取消",null).setPositiveButton("确定",(d,w)->{int selected=0;for(int i=0;i<7;i++)if(checked[i])selected|=1<<i;try{rest.put("userDefinedDate",selected);repeats.setText("重复    "+days(selected));}catch(JSONException ignored){}}).show();});
            box.addView(text("起床时间早于就寝时间时，按次日起床处理。",13,DeviceStyle.MUTED));
            AlertDialog.Builder builder=new AlertDialog.Builder(this).setTitle(index<0?"添加作息":"编辑作息").setView(box).setNegativeButton("取消",null).setPositiveButton("保存",null);
            if(index>=0)builder.setNeutralButton("删除",(d,w)->new AlertDialog.Builder(this).setTitle("删除此作息？").setNegativeButton("取消",null).setPositiveButton("删除",(dd,ww)->{try{JSONArray next=new JSONArray();for(int i=0;i<original.length();i++)if(i!=index)next.put(original.get(i));save("rests",next,current.revision);}catch(JSONException ignored){}}).show());
            AlertDialog dialog=builder.create();dialog.setOnShowListener(d->dialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(v->{try{
                String title=name.getText().toString().trim();if(title.isEmpty())throw new IllegalArgumentException();rest.put("name",title);
                JSONArray next=new JSONArray(original.toString());if(index>=0)next.put(index,rest);else next.put(rest);
                SleepSettingsProtocol.rest(SleepHabitsRepository.restList(next));save("rests",next,current.revision);dialog.dismiss();
            }catch(Exception invalid){Toast.makeText(this,"请检查起床时间、重复日期及同一天只设置 1 项作息",Toast.LENGTH_LONG).show();}}));dialog.show();
        }catch(Exception e){Toast.makeText(this,"作息记录无法编辑，请刷新",Toast.LENGTH_SHORT).show();}
    }
}
