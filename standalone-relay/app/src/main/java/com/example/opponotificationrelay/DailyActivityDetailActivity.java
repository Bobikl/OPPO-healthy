package com.example.opponotificationrelay;
import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import java.time.*;
import java.util.concurrent.*;
public final class DailyActivityDetailActivity extends Activity implements HealthDataManager.Listener {
    private LocalDate date=LocalDate.now();private HealthMetricsData data;private DailyActivityData totals;private ScrollView scroll;private TextView status;private boolean closed;private int generation;private final ExecutorService worker=Executors.newSingleThreadExecutor();private final Handler main=new Handler(Looper.getMainLooper());
    @Override public void onCreate(Bundle state){super.onCreate(state);try{date=LocalDate.parse(state==null?getIntent().getStringExtra("date"):state.getString("date"));}catch(Exception ignored){}build(false);readTotals();}
    @Override protected void onStart(){super.onStart();HealthDataManager.get(this).add(this);HealthDataManager.get(this).request(date,false,false);HealthSyncManager.get(this).request(false);}
    @Override protected void onStop(){HealthDataManager.get(this).remove(this);super.onStop();}
    @Override protected void onDestroy(){closed=true;worker.shutdown();super.onDestroy();}
    @Override protected void onSaveInstanceState(Bundle b){b.putString("date",date.toString());super.onSaveInstanceState(b);}
    @Override public void changed(HealthMetricsData value,String message,boolean busy){if(value!=data){data=value;build(true);readTotals();}status.setText(message);status.setVisibility(message.isEmpty()?View.GONE:View.VISIBLE);}
    private void readTotals(){final int token=++generation;final String target=date.toString(),mac=RelayConfig.getTargetMac(this);worker.execute(()->{DailyActivityData value=null;try{value=HealthArchive.get(this).daily(mac,target);}catch(Exception ignored){}final DailyActivityData found=value;main.post(()->{if(closed||token!=generation||!mac.equalsIgnoreCase(RelayConfig.getTargetMac(this)))return;totals=found;build(true);});});}
    private void change(LocalDate d){if(d.isAfter(LocalDate.now())||d.isBefore(LocalDate.of(2019,1,1)))return;date=d;totals=null;build(false);readTotals();HealthDataManager.get(this).request(date,false,false);}
    private void build(boolean keep){int y=keep&&scroll!=null?scroll.getScrollY():0;LinearLayout root=HealthUi.vertical(this);root.setBackgroundColor(0xff3b3b3b);HealthUi.header(this,root,"每日活动",()->HealthUi.sheet(this,"每日活动",null,"","步数、活动消耗和锻炼时长按半小时时段显示，活动次数按小时显示。\n\n点按图表可查看时段记录，点按步数或活动消耗标题可查看日、周、月、年统计。"));LinearLayout calendar=HealthUi.vertical(this);HealthUi.padding(calendar,18,0,18,0);HealthUi.dateRow(this,calendar,HealthMetricsData.dayLabel(date),date.isBefore(LocalDate.now()),()->change(date.minusDays(1)),()->change(date.plusDays(1)),()->HealthUi.pick(this,date,this::change));root.addView(calendar);
        scroll=new ScrollView(this);scroll.setVerticalScrollBarEnabled(false);LinearLayout body=HealthUi.vertical(this);scroll.addView(body);LinearLayout upper=HealthUi.vertical(this);HealthUi.padding(upper,18,0,18,18);DailyActivityCard rings=new DailyActivityCard(this);rings.bind(totals);upper.addView(rings);body.addView(upper);LinearLayout lower=HealthUi.vertical(this);lower.setBackgroundColor(0xff000000);HealthUi.padding(lower,0,0,0,24);String[] names={"步数","活动消耗","锻炼时长","活动次数"},units={"步","千卡","分钟","次"};int[] amounts=totals==null?new int[]{-1,-1,-1,-1}:new int[]{totals.steps,totals.calories,totals.minutes,totals.moves},goals=totals==null?new int[]{-1,-1,-1,-1}:new int[]{totals.stepGoal,totals.calorieGoal,totals.minuteGoal,totals.moveGoal};
        for(int i=0;i<4;i++){final int metric=i;Runnable open=i<2?()->startActivity(new Intent(this,TrendMetricActivity.class).putExtra("metric",metric==0?4:5).putExtra("date",date.toString()).putExtra("mode",0)):null;View card=OfficialDailyCard.create(this,data,date,i,amounts[i],goals[i],open);lower.addView(card,new LinearLayout.LayoutParams(-1,-2));}
        status=HealthUi.text(this,"",12,0xff888888);status.setVisibility(View.GONE);lower.addView(status);body.addView(lower);root.addView(scroll,new LinearLayout.LayoutParams(-1,0,1));setContentView(root);DeviceStyle.insets(this,root);if(y>0)scroll.post(()->scroll.scrollTo(0,y));}
}
