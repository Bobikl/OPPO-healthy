package com.example.opponotificationrelay;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import java.time.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.*;

/** First health home card. No sample values: empty dates remain explicitly empty. */
final class HealthPage implements HealthDataManager.Listener {
    private final OfficialHomeSmallCard sleepCard,trendCard,heartCard,oxygenCard,wristCard,mentalCard,relaxCard,sunshineCard,weightCard,glucoseCard,apneaCard;private HealthMetricsData detail,boundDetail;private String boundDate;
    private final Activity activity;private final DailyActivityCard card;private final TextView date,status,updated;private final Button refresh;private final Button officialSync;private final TextView officialStatus;
    private final Handler main=new Handler(Looper.getMainLooper());private final ExecutorService reader=Executors.newSingleThreadExecutor(r->new Thread(r,"health-home-read"));
    private final LinearLayout cardRows;private final OfficialHomeSmallCard[] smallCards;private String cardOrder;
    private String renderedMac,renderedDate;private ZoneId renderedZone;
    private boolean active,loading,closed;private String selected=LocalDate.now().toString();private boolean followToday=true;
    private final Runnable tick=new Runnable(){public void run(){if(!active)return;HealthSyncManager.get(activity).request(false);HealthDataManager.get(activity).local();load();main.postDelayed(this,2000);}};
    HealthPage(Activity a,Runnable health,Runnable device){
        activity=a;LinearLayout root=new LinearLayout(a);root.setOrientation(1);root.setBackgroundColor(DeviceStyle.BG);
        ScrollView scroll=new ScrollView(a);scroll.setFillViewport(true);scroll.setVerticalScrollBarEnabled(false);
        LinearLayout body=new LinearLayout(a);body.setOrientation(1);body.setPadding(Math.round(16*OfficialUiScale.density(a)),0,Math.round(16*OfficialUiScale.density(a)),dp(24));scroll.addView(body);
        TextView title=text("健康",36,0xffeeeeee);title.setGravity(Gravity.BOTTOM);title.setPadding(0,0,0,dp(15));body.addView(title,new LinearLayout.LayoutParams(-1,dp(115)));
        card=new DailyActivityCard(a);card.setClickable(true);card.setOnClickListener(v->a.startActivity(new android.content.Intent(a,DailyActivityDetailActivity.class).putExtra("date",selected)));body.addView(card,new LinearLayout.LayoutParams(-1,-2));
        trendCard=new OfficialHomeSmallCard(a,OfficialHomeSmallCard.TREND);heartCard=new OfficialHomeSmallCard(a,OfficialHomeSmallCard.HEART);
        oxygenCard=new OfficialHomeSmallCard(a,OfficialHomeSmallCard.OXYGEN);sleepCard=new OfficialHomeSmallCard(a,OfficialHomeSmallCard.SLEEP);wristCard=new OfficialHomeSmallCard(a,OfficialHomeSmallCard.WRIST);
        mentalCard=new OfficialHomeSmallCard(a,OfficialHomeSmallCard.MENTAL);relaxCard=new OfficialHomeSmallCard(a,OfficialHomeSmallCard.RELAX);sunshineCard=new OfficialHomeSmallCard(a,OfficialHomeSmallCard.SUNSHINE);
        weightCard=new OfficialHomeSmallCard(a,OfficialHomeSmallCard.WEIGHT);glucoseCard=new OfficialHomeSmallCard(a,OfficialHomeSmallCard.GLUCOSE);apneaCard=new OfficialHomeSmallCard(a,OfficialHomeSmallCard.APNEA);
        smallCards=new OfficialHomeSmallCard[]{trendCard,heartCard,sleepCard,oxygenCard,wristCard,mentalCard,relaxCard,sunshineCard,weightCard,glucoseCard,apneaCard};
        cardRows=new LinearLayout(a);cardRows.setOrientation(1);body.addView(cardRows,new LinearLayout.LayoutParams(-1,-2));applyOrder();
        for(OfficialHomeSmallCard tile:smallCards)tile.setOnLongClickListener(v->{a.startActivity(new android.content.Intent(a,HomeCardEditActivity.class));return true;});
        LinearLayout controls=new LinearLayout(a);controls.setGravity(Gravity.CENTER_VERTICAL);controls.setPadding(0,dp(10),0,0);
        date=text("今天 ▾",14,DeviceStyle.MUTED);date.setGravity(Gravity.CENTER_VERTICAL);date.setMinHeight(dp(48));date.setContentDescription("选择活动记录日期");date.setOnClickListener(v->chooseDate());controls.addView(date,new LinearLayout.LayoutParams(0,dp(48),1));
        refresh=new Button(a);refresh.setText("同步");refresh.setTextSize(14);refresh.setAllCaps(false);refresh.setTextColor(0xffdddddd);refresh.setBackgroundResource(R.drawable.device_row_press);refresh.setOnClickListener(v->{HealthSyncManager.get(a).request(true);HealthDataManager.get(a).request(LocalDate.parse(selected),false,true);HealthDataManager.get(a).request(LocalDate.parse(selected),true,true);load();});controls.addView(refresh,new LinearLayout.LayoutParams(dp(72),dp(48)));body.addView(controls);
        updated=text("尚无当天记录",13,0xffaaaaaa);body.addView(updated);
        status=text("连接手表后自动同步",12,0xff888888);status.setPadding(0,dp(8),0,0);status.setLineSpacing(dp(3),1);body.addView(status);
        officialSync=new Button(a);officialSync.setText("与官方健康同步");officialSync.setAllCaps(false);officialSync.setTextColor(0xffdddddd);officialSync.setTextSize(14);officialSync.setBackgroundResource(R.drawable.device_row_press);officialSync.setOnClickListener(v->{ActivityBridgeManager.get(a).sync();load();});
        LinearLayout.LayoutParams bridgeLayout=new LinearLayout.LayoutParams(-1,dp(48));bridgeLayout.topMargin=dp(18);body.addView(officialSync,bridgeLayout);
        officialStatus=text(ActivityBridgeManager.get(a).message(),12,0xff888888);officialStatus.setPadding(0,dp(4),0,0);body.addView(officialStatus);
        root.addView(scroll,new LinearLayout.LayoutParams(-1,0,1));HealthNavigation.add(root,true,health,device);a.setContentView(root);DeviceStyle.insets(a,root);
    }
    private void addRow(LinearLayout body,View first,View second){LinearLayout row=new LinearLayout(activity);LinearLayout.LayoutParams left=new LinearLayout.LayoutParams(0,-2,1);left.rightMargin=dp(7);row.addView(first,left);LinearLayout.LayoutParams right=new LinearLayout.LayoutParams(0,-2,1);right.leftMargin=dp(7);row.addView(second,right);LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(-1,-2);lp.topMargin=dp(14);body.addView(row,lp);}
    private void applyOrder(){
        List<Integer> order=HomeCardOrder.load(activity);String key=HomeCardOrder.encode(order);if(key.equals(cardOrder))return;
        for(OfficialHomeSmallCard tile:smallCards)if(tile.getParent() instanceof ViewGroup)((ViewGroup)tile.getParent()).removeView(tile);
        cardRows.removeAllViews();for(int i=0;i<order.size();i+=2)addRow(cardRows,smallCards[order.get(i)],i+1<order.size()?smallCards[order.get(i+1)]:new View(activity));cardOrder=key;
    }
    private int dp(int n){return DeviceStyle.dp(activity,n);}
    private TextView text(String s,int size,int color){TextView t=new TextView(activity);t.setText(s);t.setTextSize(size);t.setTextColor(color);return t;}
    void start(){if(closed||active)return;active=true;applyOrder();if(followToday)selected=LocalDate.now().toString();bindDetails();HealthDataManager.get(activity).add(this);HealthDataManager.get(activity).request(LocalDate.parse(selected),false,false);HealthDataManager.get(activity).request(LocalDate.parse(selected),true,false);HealthSyncManager.get(activity).request(false);main.removeCallbacks(tick);main.post(tick);}
    void stop(){active=false;detail=null;boundDetail=null;boundDate=null;HealthDataManager.get(activity).remove(this);main.removeCallbacks(tick);}
    void close(){closed=true;stop();reader.shutdown();}
    private void chooseDate(){HealthUi.pick(activity,LocalDate.parse(selected),day->{selected=day.toString();followToday=day.equals(LocalDate.now());HealthDataManager.get(activity).request(day,false,false);HealthDataManager.get(activity).request(day,true,false);bindDetails();load();});}
    @Override public void changed(HealthMetricsData data,String message,boolean busy){if(closed||!active)return;detail=data;bindDetails();}
    private void bindDetails(){
        String mac=RelayConfig.getTargetMac(activity);ZoneId zone=ZoneId.systemDefault();LocalDate day=LocalDate.parse(selected);
        // Keep only the already rendered views while waiting; stopped pages release their full snapshot.
        if(detail!=null&&(!mac.equalsIgnoreCase(detail.device)||!HealthSnapshotWindow.home(day).same(detail.window)))detail=null;
        boolean sameScope=mac.equalsIgnoreCase(renderedMac)&&selected.equals(renderedDate)&&zone.equals(renderedZone);
        if(detail==null&&sameScope)return;
        if(sameScope&&detail==boundDetail&&selected.equals(boundDate))return;
        if(!sameScope)card.bind(null);
        renderedMac=mac;renderedDate=selected;renderedZone=zone;boundDetail=detail;boundDate=selected;trendCard.bind(detail,day);heartCard.bind(detail,day);sleepCard.bind(detail,day);oxygenCard.bind(detail,day);wristCard.bind(detail,day);mentalCard.bind(detail,day);relaxCard.bind(detail,day);sunshineCard.bind(detail,day);weightCard.bind(detail,day);glucoseCard.bind(detail,day);apneaCard.bind(detail,day);}
    private void load(){
        if(!active||closed)return;if(followToday&&!selected.equals(LocalDate.now().toString())){selected=LocalDate.now().toString();HealthDataManager.get(activity).request(LocalDate.parse(selected),false,false);HealthDataManager.get(activity).request(LocalDate.parse(selected),true,false);bindDetails();}
        HealthSyncManager manager=HealthSyncManager.get(activity);status.setText(manager.message());refresh.setEnabled(!manager.running());refresh.setText(manager.running()?"同步中":"同步");
        ActivityBridgeManager bridge=ActivityBridgeManager.get(activity);officialStatus.setText(bridge.message());officialSync.setEnabled(!bridge.running());
        if(loading)return;loading=true;String day=selected,mac=RelayConfig.getTargetMac(activity);
        reader.execute(()->{DailyActivityData value=null;boolean error=false;try{value=HealthArchive.get(activity).daily(mac,day);}catch(Exception e){error=true;}
            final DailyActivityData result=value;final boolean failed=error;main.post(()->{loading=false;if(closed||!active||!day.equals(selected)||!mac.equalsIgnoreCase(RelayConfig.getTargetMac(activity)))return;
                card.bind(result);bindDetails();date.setText(day.equals(LocalDate.now().toString())?"今天 ▾":day+" ▾");
                updated.setText(result==null?(failed?"暂时无法读取本地记录":"尚无当天记录"):
                    "已保存 · "+new SimpleDateFormat("MM-dd HH:mm",Locale.ROOT).format(new Date(result.savedAt))+" 更新");
            });
        });
    }
}