package com.example.opponotificationrelay;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import java.time.*;
import java.util.*;

public final class HealthTrendActivity extends Activity implements HealthDataManager.Listener {
    private LocalDate date=LocalDate.now();private HealthMetricsData data;private LinearLayout root,toolbar;private ScrollView scroll;private TextView status;
    @Override public void onCreate(Bundle state){super.onCreate(state);try{date=LocalDate.parse(state!=null?state.getString("date"):getIntent().getStringExtra("date"));}catch(Exception ignored){}build(false);}
    @Override protected void onStart(){super.onStart();HealthDataManager.get(this).add(this);HealthDataManager.get(this).request(date,false,false);}
    @Override protected void onStop(){HealthDataManager.get(this).remove(this);super.onStop();}
    @Override protected void onSaveInstanceState(Bundle state){state.putString("date",date.toString());super.onSaveInstanceState(state);}
    @Override public void changed(HealthMetricsData value,String message,boolean busy){if(value!=data){data=value;build(true);}if(status!=null){status.setText(message);status.setVisibility(message.isEmpty()?View.GONE:View.VISIBLE);}}
    private void change(LocalDate value){if(value.isAfter(LocalDate.now())||value.isBefore(LocalDate.of(2019,1,1)))return;date=value;build(false);HealthDataManager.get(this).request(date,false,false);}
    private void build(boolean keep){int old=keep&&scroll!=null?scroll.getScrollY():0;root=HealthUi.vertical(this);root.setBackgroundColor(DeviceStyle.BG);toolbar=HealthUi.header(this,root,"健康趋势",this::menu);LinearLayout calendar=HealthUi.vertical(this);HealthUi.padding(calendar,18,7,18,8);HealthUi.dateRow(this,calendar,HealthMetricsData.dayLabel(date),date.isBefore(LocalDate.now()),()->change(date.minusDays(1)),()->change(date.plusDays(1)),()->HealthUi.pick(this,date,this::change));root.addView(calendar);
        scroll=new ScrollView(this);scroll.setVerticalScrollBarEnabled(false);LinearLayout body=HealthUi.vertical(this);HealthUi.padding(body,18,8,18,24);scroll.addView(body);List<HealthMetricsData.Trend> trends=data==null?Collections.emptyList():data.trends(date);
        if(trends.isEmpty()){TextView empty=HealthUi.text(this,data==null?"正在读取记录…":"暂无健康趋势",19,HealthUi.TEXT);empty.setGravity(Gravity.CENTER);HealthUi.padding(empty,10,80,10,16);body.addView(empty);TextView note=HealthUi.text(this,"连续积累睡眠和活动记录后，可查看日均值的变化。",14,HealthUi.MUTED);note.setGravity(Gravity.CENTER);HealthUi.padding(note,24,0,24,40);body.addView(note);}
        for(HealthMetricsData.Trend trend:trends){LinearLayout card=HealthUi.card(this,0xff3b3b3b);LinearLayout heading=new LinearLayout(this);heading.setGravity(Gravity.CENTER_VERTICAL);ImageView icon=new ImageView(this);icon.setImageResource(trend.metric==HealthMetricsData.STEPS?R.drawable.official_insight_step:trend.metric==HealthMetricsData.CALORIES?R.drawable.official_insight_calories:R.drawable.official_insight_sleep);heading.addView(icon,new LinearLayout.LayoutParams(HealthUi.dp(this,22),HealthUi.dp(this,22)));TextView title=HealthUi.text(this,trend.title(),18,HealthUi.TEXT);LinearLayout.LayoutParams tp=new LinearLayout.LayoutParams(-1,-2);tp.leftMargin=HealthUi.dp(this,7);heading.addView(title,tp);card.addView(heading);
            TextView wording=HealthUi.text(this,trend.wording()+" "+(trend.delta()>0?"↑":"↓"),16,HealthUi.MUTED);HealthUi.padding(wording,0,8,0,0);card.addView(wording);TrendComparisonChart chart=new TrendComparisonChart(this);chart.bind(trend);card.addView(chart);card.setOnClickListener(v->open(trend));card.setContentDescription(trend.title()+"，"+trend.wording()+"，查看详情");HealthUi.addCard(body,card);}
        status=HealthUi.text(this,"",12,0xff888888);status.setVisibility(View.GONE);body.addView(status);root.addView(scroll,new LinearLayout.LayoutParams(-1,0,1));setContentView(root);DeviceStyle.insets(this,root);if(old>0)scroll.post(()->scroll.scrollTo(0,old));
    }
    private void open(HealthMetricsData.Trend t){startActivity(new Intent(this,TrendMetricActivity.class).putExtra("metric",t.metric).putExtra("date",t.end.toString()).putExtra("start",t.start.toString()).putExtra("monthly",t.monthly));}
    private void menu(){PopupMenu menu=new PopupMenu(this,toolbar.getChildAt(toolbar.getChildCount()-1));menu.getMenu().add("数据说明").setOnMenuItemClickListener(item->{HealthUi.sheet(this,"健康趋势",null,"","健康趋势根据已保存的活动和睡眠记录，对比前后两个统计时段的日均值。\n\n步数和消耗使用截至前一天的记录，睡眠评分包含所选当天的记录。缺少记录的日期不参与日均值计算。\n\n每段七天至少需有三天有效记录。步数日均变化达到500步、消耗达到100千卡或睡眠评分达到5分时，会显示相应趋势。");return true;});menu.show();}
}
