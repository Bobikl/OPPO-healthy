package com.example.opponotificationrelay;

import android.content.*;
import android.graphics.drawable.GradientDrawable;
import android.view.*;
import android.widget.*;
import com.github.mikephil.charting.data.CandleDataSet;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.model.GradientColor;
import com.heytap.health.main.card.common.HealthCommonCardView;
import com.heytap.health.core.widget.charts.*;
import com.heytap.health.core.widget.charts.data.HealthCandleEntry;
import com.heytap.health.healthbase.view.HealthProgressBarView3;
import com.oplus.aiunit.vision.c1f;
import java.time.*;
import java.util.*;

/** Original 6.6.7 card container, XML and chart renderers; local data/navigation adapter. */
final class OfficialHomeSmallCard extends FrameLayout {
    static final int TREND=0,HEART=1,SLEEP=2,OXYGEN=3,WRIST=4,MENTAL=5,RELAX=6,SUNSHINE=7,WEIGHT=8,GLUCOSE=9,APNEA=10;
    private final Context ui;private final int kind;private final HealthCommonCardView card;private final View content;
    private com.heytap.health.hrv.ui.chart.BaseChart mentalChart;
    private LocalDate date=LocalDate.now(),detailDate=LocalDate.now();private String boundKey;
    OfficialHomeSmallCard(Context host,int kind){
        super(host);this.kind=kind;ui=OfficialUiResources.wrap(host);card=new HealthCommonCardView(ui);card.d();
        addView(card,new FrameLayout.LayoutParams(-1,-2));
        content=LayoutInflater.from(ui).inflate(id("layout",kind==TREND?"health_health_trend_card":kind==HEART?"health_heart_rate_common_card":kind==SLEEP?"health_common_sleep_card_new":kind==OXYGEN?"health_common_blood_oxygen_card":kind==WRIST?"health_common_wrist_card":kind==MENTAL?"health_hrv_common_card":kind==RELAX?"health_common_relax_card":kind==SUNSHINE?"health_common_sunshine_card":kind==WEIGHT?"health_common_weight_card_new":kind==GLUCOSE?"health_common_card_blood_sugar":"health_common_snore_card"),card.getFrameLayout(),false);
        card.addView(content);setClickable(true);setFocusable(true);setDescendantFocusability(FOCUS_BLOCK_DESCENDANTS);
        setOnClickListener(v->host.startActivity(new Intent(host,kind==TREND?HealthTrendActivity.class:kind==HEART?HeartDetailActivity.class:kind==SLEEP?SleepDetailActivity.class:kind<=WRIST?VitalsDetailActivity.class:kind<=SUNSHINE?WellnessDetailActivity.class:AdditionalHealthActivity.class).putExtra("date",detailDate.toString()).putExtra("vital",kind)));
        if(kind==MENTAL){mentalChart=new com.heytap.health.hrv.ui.chart.BaseChart(ui);((LinearLayout)view("hrv_card_chart")).addView(mentalChart,new LinearLayout.LayoutParams(-1,-1));}
        bind(null,date);
    }
    private int id(String type,String name){return OfficialUiResources.id(ui,type,name);}
    private String str(String name,Object... args){return ui.getString(id("string",name),args);}
    private <T extends View>T view(String name){return content.findViewById(id("id",name));}
    private int px(float dp){return Math.round(dp*ui.getResources().getDisplayMetrics().density);}
    @Override public boolean onInterceptTouchEvent(android.view.MotionEvent e){return true;}
    void bind(HealthMetricsData data,LocalDate day){
        date=day;detailDate=day;HealthMetricsData.Day d=data==null?null:data.find(day);
        // Cache by rendered values, not the reader object: the home poll must not restart chart animation.
        String key=kind+"/"+day+"/"+(d==null?"empty":d.latest+"/"+d.latestTime+"/"+d.min+"/"+d.max+"/"+d.rest+"/"+d.sleepMinutes+"/"+d.sleepScore+"/"+d.sleepOut+"/"+d.oxygenLatest+"/"+d.oxygenTime+"/"+d.wristBase+"/"+d.wristValue+"/"+d.mentalAverage+"/"+d.mentalState+"/"+d.mentalLatest+"/"+d.mentalLatestState+"/"+d.mentalTime+"/"+d.sunshineMinutes+"/"+d.sunshineTarget+"/"+d.relaxSeconds+"/"+d.relaxCount);
        if(data!=null){if(kind==HEART){for(HealthCandleEntry e:heartEntries(data,day))key+="/"+e.getX()+":"+e.getLow()+":"+e.getHigh();}
            else if(kind==SLEEP){for(HealthMetricsData.SleepSegment s:data.sleep(day))key+="/"+s.start+":"+s.end+":"+s.stage+":"+s.last;}
            else if(kind==MENTAL){for(HealthMetricsData.Mental p:data.mental(day))key+="/"+p.time+":"+p.value+":"+p.state;}
            else if(kind==RELAX){for(HealthMetricsData.Relax p:data.relax(day))key+="/"+p.time+":"+p.seconds+":"+p.type+":"+p.subtype;}
            else if(kind==TREND)for(HealthMetricsData.Trend t:data.trends(day))key+="/"+t.metric+":"+t.wording();}
        if(kind>=WEIGHT){if(d!=null)key+="/"+d.glucoseLatest+"/"+d.glucoseTime+"/"+d.glucoseLow+"/"+d.glucoseHigh+"/"+d.glucoseTrend+"/"+d.apneaLevel+"/"+d.apneaVersion;if(data!=null){if(kind==WEIGHT){Map.Entry<Long,Integer> last=data.weights.floorEntry(HealthMetricsData.time(day.plusDays(1))-1);if(last!=null){detailDate=HealthMetricsData.date(last.getKey());key+="/"+data.weights.subMap(HealthMetricsData.time(detailDate.minusDays(6)),true,HealthMetricsData.time(detailDate.plusDays(1)),false);}}if(kind==GLUCOSE)for(HealthMetricsData.Glucose p:data.glucose(day))key+="/"+p.time+":"+p.milli+":"+p.trend;}}
        if(key.equals(boundKey))return;boundKey=key;card.d();card.setForeground(null);card.setCustomBackgroundDrawable(null);
        if(kind==HEART)bindHeart(data,d);else if(kind==SLEEP)bindSleep(data,d);else if(kind==OXYGEN)bindOxygen(d);else if(kind==WRIST)bindWrist(d);else if(kind==MENTAL)bindMental(data,d);else if(kind==RELAX)bindRelax(data,d);else if(kind==SUNSHINE)bindSunshine(d);else if(kind==WEIGHT)bindWeight(data);else if(kind==GLUCOSE)bindGlucose(data,d);else if(kind==APNEA)bindApnea(d);else bindTrend(data);
    }
    private void empty(String title,String icon,String tip){card.setIcon(id("drawable",icon));card.f(title,tip,"查看详情");setContentDescription(title+"，暂无记录，点按查看详情");}
    private void bindHeart(HealthMetricsData data,HealthMetricsData.Day d){
        List<HealthCandleEntry> entries=data==null?Collections.emptyList():heartEntries(data,date);
        if(d==null||d.latest<=0){empty("心率","health_icon_heart",str("health_home_card_hr_no_data_tip"));return;}
        card.setDataModel("心率");card.n.setTextSize(22);card.p.setTextSize(14);
        String value=date.equals(LocalDate.now())?String.valueOf(d.latest):HealthMetricsData.rangeText(new int[]{d.min,d.max});
        card.setDataContent(value);card.setDataContent2(str("health_base_heart_rate_state_util"));card.setDataNoticeToTime(d.latestTime);
        TextView rest=view("tv_rest_hr_value");rest.setVisibility(d.rest>0?VISIBLE:GONE);rest.setText(d.rest>0?str("health_home_card_hr_rest_value",String.valueOf(d.rest)):"");
        HeartRateBarChart chart=view("heart_rate_bar_chart");chart.setVisibility(entries.isEmpty()?INVISIBLE:VISIBLE);
        if(!entries.isEmpty()){
            chart.setEntryList(entries);chart.getXAxis().setEnabled(false);chart.getAxisRight().setEnabled(false);chart.getXAxis().setGranularity(1);
            chart.setOnTouchListener((ChartTouchListener)null);chart.setTouchEnabled(false);chart.setBarWidth(.6363636f);chart.setXAxisMinimum(0);chart.setXAxisMaximum(24);chart.e(true);chart.l(1,1,1,1);chart.setForceCandleHeightBiggerThanWidth(true);
            float min=chart.getData().getYMin(),max=chart.getData().getYMax();chart.setYAxisMinimum(min==max?min-1:min);chart.setYAxisMaximum(min==max?max+1:entries.size()==1?(float)((max-min*.3)/.7):max);
            int color=ui.getColor(id("color","health_color_heart"));chart.setBarGradientColor(new GradientColor(color,color));
            CandleDataSet set=(CandleDataSet)chart.getData().getDataSetByIndex(0);set.setShowCandleBar(true);set.setShadowColor(ui.getColor(id("color","health_card_bar_chart_bg")));chart.notifyDataSetChanged();chart.invalidate();
        }
        setContentDescription("心率，"+value+"次/分，静息心率 "+(d.rest>0?d.rest+"次/分":"暂无记录")+"，点按查看详情");
    }
    static List<HealthCandleEntry> heartEntries(HealthMetricsData data,LocalDate date){
        int[] lo=new int[24],hi=new int[24];long start=HealthMetricsData.time(date),end=HealthMetricsData.time(date.plusDays(1));
        // The official card groups valid raw measurements by local hour. Retain bin fallback for live watch data.
        for(HealthMetricsData.Bin b:data.bins.subMap(start,true,end,false).values()){int h=Instant.ofEpochMilli(b.stamp).atZone(HealthMetricsData.zone()).getHour();if(b.min>0){lo[h]=lo[h]==0?b.min:Math.min(lo[h],b.min);hi[h]=Math.max(hi[h],b.max);}}
        for(Map.Entry<Long,Integer> e:data.raw.subMap(start,true,end,false).entrySet()){int h=Instant.ofEpochMilli(e.getKey()).atZone(HealthMetricsData.zone()).getHour(),v=e.getValue();if(v>0){lo[h]=lo[h]==0?v:Math.min(lo[h],v);hi[h]=Math.max(hi[h],v);}}
        List<HealthCandleEntry> out=new ArrayList<>();for(int h=0;h<24;h++)if(lo[h]>0)out.add(new HealthCandleEntry(h,lo[h],hi[h]));return out;
    }
    private void bindSleep(HealthMetricsData data,HealthMetricsData.Day d){
        if(d==null||d.sleepMinutes<=0){empty("睡眠","health_icon_sleep",str("health_home_card_sleep_no_data_tip"));return;}
        card.setDataModel("睡眠");card.n.setTextSize(14);card.p.setVisibility(GONE);
        // Official c9i uses application density for absolute spans, while card XML uses Activity density.
        float spanScale=getContext().getApplicationContext().getResources().getDisplayMetrics().density/ui.getResources().getDisplayMetrics().density;
        CharSequence duration=com.oplus.aiunit.vision.c9i.INSTANCE.e(d.sleepMinutes,22*spanScale,14*spanScale);
        card.setDataContent(duration);card.e(d.sleepOut>0?d.sleepOut:HealthMetricsData.time(date),true);
        TextView score=view("tv_sleep_score");score.setVisibility(d.sleepScore>0?VISIBLE:GONE);score.setText(d.sleepScore>0?str("health_home_card_sleep_score_tip",String.valueOf(d.sleepScore)):"");
        SleepDetailsChart chart=view("sleep_daily_chart");List<HealthMetricsData.SleepSegment> rows=data.sleep(date);chart.setVisibility(rows.isEmpty()?INVISIBLE:VISIBLE);
        if(!rows.isEmpty()){chart.setDrawBg(true);chart.setBgColor(ui.getColor(id("color","health_base_black_3alpha")));chart.getXAxis().setEnabled(false);chart.getAxisLeft().setEnabled(false);chart.getAxisRight().setEnabled(false);chart.setMarker(null);chart.setHighlightPerDragEnabled(false);chart.setOnTouchListener((ChartTouchListener)null);chart.setTouchEnabled(false);chart.setRadius(2);chart.e(true);chart.n(0,0,0,0);chart.P(OfficialChartSupport.sleep(rows),10,1);chart.Q();}
        setContentDescription("睡眠，"+duration+"，睡眠质量 "+(d.sleepScore>0?d.sleepScore+"分":"暂无评分")+"，点按查看详情");
    }
    private int color(String name){return ui.getColor(id("color",name));}
    private void bindOxygen(HealthMetricsData.Day d){
        if(d==null||d.oxygenLatest<=0){empty("血氧","health_icon_spo2",str("health_home_card_spo2_no_data_tip"));return;}
        card.setDataModel("血氧");card.n.setTextSize(22);card.p.setTextSize(14);card.setDataContent(String.valueOf(d.oxygenLatest));card.setDataContent2("%");card.setDataNoticeToTime(d.oxygenTime);
        HealthProgressBarView3 bar=view("progress_bar_view");bar.setDrawCursor(true);bar.setIntervalPx(0);bar.setCursorColor(color("lib_base_colorBlack"));
        OfficialChartSupport.enumOption(bar,"setCurSorType","com.heytap.health.healthbase.view.HealthProgressBarView3$CurSorType","TRULY");
        bar.setData(Arrays.asList(new c1f(70,89,color("health_color_F50E60"),"70%",""),new c1f(90,100,color("health_color_2979FF"),"","100%")),d.oxygenLatest);bar.animateY();
        setContentDescription("血氧，"+d.oxygenLatest+"%，"+HealthMetricsData.timeLabel(d.oxygenTime)+"，点按查看详情");
    }
    static String wristValue(HealthMetricsData.Day d){float value=Math.round((d.wristValue-d.wristBase)/10f)/10f;return String.format(Locale.CHINA,value>0?"+%.1f":"%.1f",value==0?0:value);}
    private void bindWrist(HealthMetricsData.Day d){
        if(d==null||d.wristBase<=0||d.wristValue<=0){empty("手腕温度","health_icon_wrist",str("health_home_card_wrist_no_data_tip"));return;}
        float delta=Math.round((d.wristValue-d.wristBase)/10f)/10f;String value=wristValue(d)+str("health_base_degree_centigrade");
        card.setDataModel("手腕温度");card.n.setTextSize(22);card.setDataContent(value);card.p.setVisibility(GONE);card.e(HealthMetricsData.time(date),true);
        TextView tip=view("tvDataTip");tip.setVisibility(VISIBLE);tip.setText(str(delta>1?"health_home_card_wrist_baseline2":delta< -1?"health_home_card_wrist_baseline1":delta==0?"health_home_card_wrist_baseline_state3":"health_home_card_wrist_baseline3"));
        HealthProgressBarView3 bar=view("progress_bar_view");bar.setDrawCursor(true);bar.setIntervalPx(0);bar.setCursorColor(color("lib_base_colorBlack"));OfficialChartSupport.enumOption(bar,"setCurSorType","com.heytap.health.healthbase.view.HealthProgressBarView3$CurSorType","CENTER");
        bar.setData(Arrays.asList(new c1f(0,9,color("health_color_2A93E6"),"",""),new c1f(10,19,color("health_color_7E35FD"),"",""),new c1f(20,30,color("health_color_F45E27"),"","")),delta>1?25:delta< -1?5:15);bar.animateY();
        setContentDescription("手腕温度，较基准"+value+"，点按查看详情");
    }
    private void bindMental(HealthMetricsData data,HealthMetricsData.Day d){
        boolean today=date.equals(LocalDate.now());int value=d==null?0:today?d.mentalLatest:d.mentalAverage,state=d==null?0:today?d.mentalLatestState:d.mentalState;
        if(value<=0||state<=0){empty("身心状态","health_icon_hrv",str("health_home_card_hrv_no_data_tip"));return;}
        card.setDataModel("身心状态");card.n.setTextSize(22);card.p.setVisibility(GONE);card.setDataContent(String.valueOf(value));if(today)card.setDataNoticeToTime(d.mentalTime);else card.e(HealthMetricsData.time(date),true);
        ((TextView)view("tv_target_value")).setText(WellnessUi.mentalState(state));card.w.setVisibility(VISIBLE);card.w.setImageResource(id("drawable",state==1?"health_icon_hrv_level_over":state==2?"health_icon_hrv_level_normal":state==3?"health_icon_hrv_level_relax":"health_icon_hrv_level_good"));
        WellnessUi.mental(mentalChart,data,date,true);setContentDescription("身心状态，"+value+"，"+WellnessUi.mentalState(state)+"，点按查看详情");
    }
    private void bindRelax(HealthMetricsData data,HealthMetricsData.Day d){
        List<HealthMetricsData.Relax> rows=data==null?Collections.emptyList():data.relax(date);if(rows.isEmpty()){empty("放松","health_icon_relax",str("health_home_card_relax_no_data_tip"));return;}
        HealthMetricsData.Relax r=rows.get(rows.size()-1);card.setDataModel("放松");card.n.setTextSize(14);card.p.setVisibility(GONE);float scale=getContext().getApplicationContext().getResources().getDisplayMetrics().density/ui.getResources().getDisplayMetrics().density;
        card.setDataContent(com.oplus.aiunit.vision.c9i.INSTANCE.e(r.seconds/60,22*scale,14*scale));card.e(r.time,false);String name=WellnessUi.relaxName(ui,r.type,r.subtype);((TextView)view("tv_health_relax_card_name")).setText(name);((ImageView)view("iv_icon")).setImageResource(com.oplus.aiunit.vision.hpf.e(r.type,r.subtype));setContentDescription("放松，"+name+"，"+r.seconds/60+"分钟，点按查看详情");
    }
    private void bindSunshine(HealthMetricsData.Day d){
        if(d==null||d.sunshineMinutes<0){empty("日照","health_icon_sunshine",str("health_sunshine_card_empty_desc"));return;}
        card.setDataModel("日照");card.setIcon(id("drawable","health_icon_sunshine"));card.n.setTextSize(22);card.p.setTextSize(14);card.setDataContent(String.valueOf(d.sunshineMinutes));card.setDataContent2("分钟");card.e(HealthMetricsData.time(date),true);
        TextView target=view("tv_target_value");target.setText(str("health_sunshine_goal_minute",d.sunshineTarget));target.setVisibility(d.sunshineTarget>0?VISIBLE:GONE);
        int color=id("color","health_sunshine_card_progress_color");com.heytap.health.main.card.StepCardComposeBridge.a((androidx.compose.ui.platform.ComposeView)view("progress_compose_view"),d.sunshineMinutes,d.sunshineTarget,color,color);setContentDescription("日照，"+d.sunshineMinutes+"分钟，目标"+d.sunshineTarget+"分钟，点按查看详情");
    }
    private void bindWeight(HealthMetricsData data){Map.Entry<Long,Integer> latest=data==null?null:data.weights.floorEntry(HealthMetricsData.time(date.plusDays(1))-1);if(latest==null){empty("体重","health_icon_weight",str("health_home_card_bf_no_data_tip2"));return;}card.setDataModel("体重");card.n.setTextSize(22);card.p.setTextSize(14);String value=String.format(Locale.CHINA,"%.1f",latest.getValue()/1000f);card.setDataContent(value);card.setDataContent2(str("settings_weight_unit_metric"));card.setDataNoticeToTime(latest.getKey());AdditionalCardUi.weight(ui,(androidx.compose.ui.platform.ComposeView)view("weight_health_line_chart"),data,latest.getKey());setContentDescription("体重，"+value+"公斤，点按查看详情");}
    private void bindGlucose(HealthMetricsData data,HealthMetricsData.Day d){if(d==null||d.glucoseLatest<=0){empty("血糖","health_icon_blood_sugar",str("health_home_card_blood_sugar_no_data_tip"));return;}card.setDataModel("血糖");card.n.setTextSize(22);card.p.setTextSize(14);String value=String.format(Locale.CHINA,"%.1f",d.glucoseLatest/1000f);card.setDataContent(value);card.setDataContent2(str("health_blood_glucose_unit"));card.setDataNoticeToTime(d.glucoseTime);card.w.setVisibility(d.glucoseTrend>=1&&d.glucoseTrend<=6?VISIBLE:GONE);if(d.glucoseTrend>=1&&d.glucoseTrend<=6)card.w.setImageResource(id("drawable",new String[]{"health_icon_glu_up","health_icon_glu_right_top","health_icon_glu_right","health_icon_glu_right_down","health_icon_glu_down","health_icon_glu_down2"}[d.glucoseTrend-1]));AdditionalCardUi.glucose((GluCombineChart)view("view_history_chart"),data,date,true);setContentDescription("血糖，"+value+" mmol/L，点按查看详情");}
    private void bindApnea(HealthMetricsData.Day d){String title=str("health_card_snore");if(d==null||d.apneaLevel== -2){empty(title,"health_icon_snore",str("health_home_card_snore_no_data_tip"));return;}card.setDataModel(title);card.n.setTextSize(18);card.p.setVisibility(GONE);String value=AdditionalCardUi.apnea(ui,d.apneaLevel);card.setDataContent(value);card.n.setTextColor(d.apneaLevel>=1&&d.apneaLevel<=3?color("health_sleep_snore_level_"+new String[]{"low","medium","high"}[d.apneaLevel-1]):color("health_base_black_90alpha"));card.n.setForceDarkAllowed(false);card.e(HealthMetricsData.time(date),true);AdditionalCardUi.apneaBar(ui,(HealthProgressBarView3)view("progress_bar_view"),d.apneaLevel);setContentDescription(title+"，"+value+"，点按查看详情");}
    private void bindTrend(HealthMetricsData data){
        List<HealthMetricsData.Trend> values=data==null?Collections.emptyList():new ArrayList<>(data.trends(date));
        if(values.isEmpty()){empty("健康趋势","health_icon_health_trend",str("health_insight_card_guide_tip"));return;}
        values.sort((a,b)->Integer.compare(a.metric==HealthMetricsData.SLEEP_SCORE?9:a.metric,b.metric==HealthMetricsData.SLEEP_SCORE?9:b.metric));
        card.setDataModel("健康趋势");card.z.setVisibility(GONE);card.o.setVisibility(GONE);
        view("ll_data_one").setVisibility(values.size()==1?VISIBLE:GONE);view("ll_data_two").setVisibility(values.size()>1?VISIBLE:GONE);
        for(int i=0;i<Math.min(values.size(),2);i++){
            HealthMetricsData.Trend t=values.get(i);String suffix=values.size()==1?"one":"item_"+(i+1);
            ((TextView)view("tv_data_"+suffix)).setText(t.wording());((ImageView)view("iv_data_"+suffix)).setImageDrawable(ui.getDrawable(id("drawable",t.metric==HealthMetricsData.STEPS?"health_trend_step":t.metric==HealthMetricsData.CALORIES?"health_trend_consumption":"health_trend_sleep")));
            if(values.size()>1){GradientDrawable bg=new GradientDrawable();bg.setColor(0x0a000000);bg.setCornerRadius(px(8));view("ll_data_item_"+(i+1)).setBackground(bg);}
        }
        ((TextView)view("tv_date")).setText(card.a(HealthMetricsData.time(date),true));TextView more=view("tv_more_items");more.setVisibility(values.size()>2?VISIBLE:GONE);more.setText(values.size()>2?str("health_insight_card_more_items",values.size()-2):"");
        StringBuilder desc=new StringBuilder("健康趋势");for(HealthMetricsData.Trend t:values)desc.append("，").append(t.wording());setContentDescription(desc.append("，点按查看详情").toString());
    }
}
