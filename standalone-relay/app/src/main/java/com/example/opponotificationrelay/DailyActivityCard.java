package com.example.opponotificationrelay;

import android.content.Context;
import android.graphics.*;
import android.view.View;

/** Native Canvas equivalent of the official two-column DailyProgressView and four circular tracks. */
final class DailyActivityCard extends View {
    private final Paint paint=new Paint(Paint.ANTI_ALIAS_FLAG);private DailyActivityData data;
    private final int[] colors={0xff00df6a,0xffff8800,0xffffb200,0xff00baf5};
    DailyActivityCard(Context c){super(c);setImportantForAccessibility(IMPORTANT_FOR_ACCESSIBILITY_YES);setFocusable(true);bind(null);}
    void bind(DailyActivityData value){data=value;
        setContentDescription(value==null?"每日活动，尚无当天记录":
            "每日活动。步数 "+value.steps+" 步，目标 "+goal(value.stepGoal,"步")+"。活动消耗 "+value.calories+" 千卡，目标 "+goal(value.calorieGoal,"千卡")+
            "。锻炼时长 "+value.minutes+" 分钟，目标 "+goal(value.minuteGoal,"分钟")+"。活动次数 "+value.moves+" 次，目标 "+goal(value.moveGoal,"次"));invalidate();}
    private static String goal(int n,String unit){return n>0?n+" "+unit:"— "+unit;}
    @Override protected void onMeasure(int width,int height){int w=MeasureSpec.getSize(width);setMeasuredDimension(w,Math.round(w*184f/360));}
    @Override protected void onDraw(Canvas c){super.onDraw(c);float scale=getWidth()/360f;c.save();c.scale(scale,scale);
        paint.setStyle(Paint.Style.FILL);paint.setShader(null);paint.setColor(0xff3b3b3b);c.drawRoundRect(0,0,360,184,24,24,paint);
        for(int i=0;i<4;i++){float x=(i%2==0)?143:220,y=i<2?52:134;ring(c,x,y,i,ringProgress(i));}
        metric(c,89,30,true,"步数",data==null?"—":String.valueOf(data.steps),goal(data==null?-1:data.stepGoal,"步"));
        metric(c,271,30,false,"活动消耗",data==null?"—":String.valueOf(data.calories),goal(data==null?-1:data.calorieGoal,"千卡"));
        metric(c,89,112,true,"锻炼时长",data==null?"—":String.valueOf(data.minutes),goal(data==null?-1:data.minuteGoal,"分钟"));
        metric(c,271,112,false,"活动次数",data==null?"—":String.valueOf(data.moves),goal(data==null?-1:data.moveGoal,"次"));c.restore();
    }
    private float ringProgress(int i){if(data==null)return 0;int[] values={data.steps,data.calories,data.minutes,data.moves},goals={data.stepGoal,data.calorieGoal,data.minuteGoal,data.moveGoal};return goals[i]>0?Math.max(0,values[i]/(float)goals[i]):0;}
    private void ring(Canvas c,float x,float y,int index,float progress){OfficialActivityRing.draw(c,paint,x,y,index,progress);}
    private void metric(Canvas c,float x,float y,boolean right,String title,String number,String goal){
        paint.setTextAlign(right?Paint.Align.RIGHT:Paint.Align.LEFT);paint.setTypeface(Typeface.create("sans-serif",Typeface.NORMAL));
        text(c,title,x,y,14,0xffababab,83);paint.setTypeface(Typeface.create("sans-serif-medium",0));text(c,number,x,y+29,25,0xffeeeeee,83);paint.setTypeface(Typeface.create("sans-serif",0));text(c,goal,x,y+50,15,0xffdedede,83);
    }
    private void text(Canvas c,String s,float x,float y,float size,int color,float width){
        float font=Math.min(1.25f,getResources().getConfiguration().fontScale);paint.setTextSize(size*font);
        float actual=paint.measureText(s);if(actual>width)paint.setTextSize(size*font*width/actual);paint.setColor(color);c.drawText(s,x,y,paint);
    }
}