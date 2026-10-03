package com.example.opponotificationrelay;

import android.app.*;
import android.content.*;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.view.*;
import android.widget.*;
import android.text.*;
import android.text.style.*;
import java.time.*;

final class HealthUi {
    static final int TEXT=0xffeeeeee,MUTED=0xffaaaaaa;
    static final String[] HEART_NAMES={"最近心率","静息心率","步行平均心率","睡眠基准心率"};
    static final String[] HEART_EXPLANATIONS={"心率是心脏跳动的频率，用每分钟心脏跳动的次数来表示，非活动状态下成年人通常为50～100次/分。\n\n心脏为身体提供血液循环、氧气和养分，心率可被视为心血管健康的重要指标。\n\n心率因年龄、性别或其他生理因素会产生个体差异。一般来说，年龄越小心率越快，女性的心率比同龄男性快。睡眠状态下心率一般比清醒时更低，运动时的心率则随运动强度而变化。","穿戴设备智能测得您每天清醒且安静状态下的较低心率值作为静息心率值。\n\n静息心率值是评估心脏健康状态的重要参考指标，定期运动、体重标准、作息规律且没有抽烟喝酒习惯的人，静息心率会保持在一个相对缓慢而稳定的区间。静息心率不包括睡眠过程中的心率。","穿戴设备智能识别您的活动状态，自动计算日常走路时的平均心率。步行心率的个体差异较大，与走路速度、体重、情绪等因素相关。\n\n经常运动，保持标准体重并缓解压力时，步行平均心率会相对较低。","睡眠基准心率是相对连续的一段睡眠记录中出现次数最多的心率数值。睡眠中佩戴穿戴设备睡觉，醒来后将为您计算睡眠基准心率。\n\n睡眠基准心率反映个体在睡眠期间的基础心率水平，是判断心脏健康状态的重要依据。"};
    static int dp(Context c,int n){return DeviceStyle.dp(c,n);}
    static TextView text(Context c,String s,int size,int color){TextView v=new TextView(c);v.setText(s);v.setTextSize(size);v.setTextColor(color);v.setIncludeFontPadding(false);return v;}
    static LinearLayout vertical(Context c){LinearLayout v=new LinearLayout(c);v.setOrientation(1);return v;}
    static void padding(View v,int left,int top,int right,int bottom){Context c=v.getContext();v.setPadding(dp(c,left),dp(c,top),dp(c,right),dp(c,bottom));}
    static TextView label(Context c,String s,int size){return text(c,s,size,TEXT);}
    static void divider(LinearLayout parent){View line=new View(parent.getContext());line.setBackgroundColor(0xff303030);parent.addView(line,new LinearLayout.LayoutParams(-1,dp(parent.getContext(),1)));}
    static TextView value(Context c,String number,String unit,int size){TextView v=text(c,"",size,TEXT);SpannableString s=new SpannableString(number+(unit.isEmpty()?"":" "+unit));if(!unit.isEmpty())s.setSpan(new AbsoluteSizeSpan(16,true),number.length(),s.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);v.setText(s);return v;}
    static LinearLayout header(Activity a,LinearLayout root,String title,Runnable menu){LinearLayout bar=new LinearLayout(a);bar.setGravity(Gravity.CENTER_VERTICAL);padding(bar,8,0,12,0);ImageButton back=new ImageButton(a);back.setImageResource(R.drawable.official_health_back);back.setContentDescription("返回");back.setBackgroundResource(R.drawable.device_row_press);back.setOnClickListener(v->a.finish());bar.addView(back,new LinearLayout.LayoutParams(dp(a,48),dp(a,48)));
        TextView name=text(a,title,21,TEXT);name.setTypeface(null,Typeface.BOLD);LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(0,-2,1);lp.leftMargin=dp(a,8);bar.addView(name,lp);if(menu!=null){ImageButton more=new ImageButton(a);more.setImageResource(R.drawable.official_health_more);more.setBackgroundResource(R.drawable.device_row_press);more.setContentDescription("更多选项");more.setOnClickListener(v->menu.run());bar.addView(more,new LinearLayout.LayoutParams(dp(a,40),dp(a,48)));}root.addView(bar,new LinearLayout.LayoutParams(-1,dp(a,58)));return bar;
    }
    interface ModeChanged {void change(int mode);}
    static void segments(Activity a,LinearLayout root,int selected,ModeChanged changed){LinearLayout row=new LinearLayout(a);row.setGravity(Gravity.CENTER_VERTICAL);padding(row,4,4,4,4);row.setBackground(DeviceStyle.shape(0xff333333,24,a));String[] labels={"日","周","月","年"};for(int i=0;i<4;i++){final int mode=i;TextView t=text(a,labels[i],18,TEXT);t.setGravity(Gravity.CENTER);if(i==selected)t.setBackground(DeviceStyle.shape(0xff484848,22,a));t.setSelected(i==selected);t.setOnClickListener(v->changed.change(mode));row.addView(t,new LinearLayout.LayoutParams(0,-1,1));}LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(-1,dp(a,46));lp.setMargins(dp(a,18),dp(a,5),dp(a,18),0);root.addView(row,lp);}
    static void dateRow(Activity a,LinearLayout parent,String title,boolean next,Runnable previous,Runnable forward,Runnable pick){LinearLayout row=new LinearLayout(a);row.setGravity(Gravity.CENTER_VERTICAL);HealthDateArrow before=new HealthDateArrow(a,false);before.setContentDescription("上一时段");before.setOnClickListener(v->previous.run());row.addView(before,new LinearLayout.LayoutParams(dp(a,28),dp(a,28)));TextView date=text(a,title+"  ▾",17,TEXT);date.setGravity(Gravity.CENTER);date.setContentDescription("选择日期");date.setOnClickListener(v->pick.run());row.addView(date,new LinearLayout.LayoutParams(0,dp(a,64),1));HealthDateArrow after=new HealthDateArrow(a,true);after.setContentDescription("下一时段");if(next){after.setOnClickListener(v->forward.run());}else after.setVisibility(View.INVISIBLE);row.addView(after,new LinearLayout.LayoutParams(dp(a,28),dp(a,28)));parent.addView(row,new LinearLayout.LayoutParams(-1,dp(a,64)));}
    interface DateChanged {void change(LocalDate date);}
    static void pick(Activity a,LocalDate current,DateChanged callback){HealthCalendar.show(a,current,callback);}

    static LinearLayout card(Context c,int background){LinearLayout card=vertical(c);padding(card,18,17,18,17);card.setBackground(DeviceStyle.shape(background,14,c));return card;}
    static void addCard(LinearLayout parent,View card){LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(-1,-2);lp.bottomMargin=dp(parent.getContext(),14);parent.addView(card,lp);}
    static void sheet(Activity a,String title,String value,String unit,String body){Dialog dialog=new Dialog(a);dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);LinearLayout content=vertical(a);content.setBackground(DeviceStyle.shape(0xff202020,24,a));padding(content,28,28,28,22);TextView heading=text(a,title,20,TEXT);heading.setGravity(Gravity.CENTER);heading.setTypeface(null,1);content.addView(heading,new LinearLayout.LayoutParams(-1,-2));
        if(value!=null){TextView number=value(a,value,unit,42);number.setGravity(Gravity.CENTER);LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(-1,-2);lp.topMargin=dp(a,27);lp.bottomMargin=dp(a,22);content.addView(number,lp);}
        TextView description=text(a,body,16,MUTED);description.setLineSpacing(dp(a,4),1);ScrollView scroll=new ScrollView(a);scroll.setVerticalScrollBarEnabled(false);scroll.addView(description);LinearLayout.LayoutParams copy=new LinearLayout.LayoutParams(-1,-2);copy.topMargin=dp(a,value==null?22:0);int max=a.getResources().getDisplayMetrics().heightPixels/2;scroll.setFillViewport(false);description.measure(View.MeasureSpec.makeMeasureSpec(a.getResources().getDisplayMetrics().widthPixels-dp(a,92),View.MeasureSpec.EXACTLY),View.MeasureSpec.makeMeasureSpec(0,View.MeasureSpec.UNSPECIFIED));if(description.getMeasuredHeight()>max)copy.height=max;content.addView(scroll,copy);
        TextView done=text(a,"知道了",18,0xff5899ff);done.setGravity(Gravity.CENTER);done.setTypeface(null,1);done.setOnClickListener(v->dialog.dismiss());LinearLayout.LayoutParams ok=new LinearLayout.LayoutParams(-1,dp(a,52));ok.topMargin=dp(a,16);content.addView(done,ok);dialog.setContentView(content);Window w=dialog.getWindow();w.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));w.addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);WindowManager.LayoutParams attrs=w.getAttributes();attrs.gravity=Gravity.BOTTOM;attrs.dimAmount=.65f;attrs.y=dp(a,16);w.setAttributes(attrs);dialog.show();w.setLayout(a.getResources().getDisplayMetrics().widthPixels-dp(a,36),-2);
    }
}
