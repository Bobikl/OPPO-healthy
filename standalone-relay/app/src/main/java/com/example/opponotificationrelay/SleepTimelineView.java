package com.example.opponotificationrelay;
import android.content.Context;
import android.graphics.*;
import android.widget.FrameLayout;
import com.heytap.health.core.widget.charts.SleepDetailsChart;
import com.heytap.health.core.widget.charts.SleepCombinedChart;
import com.heytap.health.core.widget.charts.data.*;
import com.github.mikephil.charting.charts.BarLineChartBase;
import java.util.*;
/** Full original sleep detail/combined charts; independent data and host adapter. */
final class SleepTimelineView extends FrameLayout {
    static final int[] COLORS={0xff5252d3,0xff9393ff,0xff84d0ff,0xffffc30e};static final String[] NAMES={"深睡","浅睡","快速眼动","清醒"};
    private boolean expanded;private BarLineChartBase chart;private List<SleepUnitData> stages=Collections.emptyList();private List<TimeStampedData> heart=Collections.emptyList(),oxygen=Collections.emptyList();
    private List<HealthMetricsData.SleepSegment> boundRows=Collections.emptyList();private boolean boundExpanded;private String boundZone="";
    private static boolean sameRows(List<HealthMetricsData.SleepSegment> a,List<HealthMetricsData.SleepSegment> b){
        if(a.size()!=b.size())return false;for(int i=0;i<a.size();i++){HealthMetricsData.SleepSegment x=a.get(i),y=b.get(i);if(x.start!=y.start||x.end!=y.end||x.stage!=y.stage||x.last!=y.last)return false;}return true;
    }
    SleepTimelineView(Context c){super(c);}
    void setExpanded(boolean value){expanded=value;}
    void bind(List<HealthMetricsData.SleepSegment> rows){String zone=HealthMetricsData.zone().getId();if(chart!=null&&boundExpanded==expanded&&boundZone.equals(zone)&&sameRows(boundRows,rows))return;boundRows=new ArrayList<>(rows);boundExpanded=expanded;boundZone=zone;stages=OfficialChartSupport.sleep(rows);removeAllViews();Context c=OfficialUiResources.wrap(getContext());
        if(expanded){SleepCombinedChart combined=new SleepCombinedChart(c);combined.C(stages,heart,oxygen);combined.setXAxisValueFormatter((i,x)->HealthMetricsData.timeLabel((long)(x*60000)));chart=combined;}
        else{SleepDetailsChart detail=new SleepDetailsChart(c);detail.setSleepData(stages);detail.setXAxisValueFormatter((i,x)->HealthMetricsData.timeLabel((long)(x*60000)));chart=detail;}
        OfficialChartSupport.configure(chart,"暂无睡眠阶段记录",OfficialChartSupport::sleepLabel);chart.setContentDescription(rows.isEmpty()?"暂无睡眠阶段记录":"睡眠阶段时间线，"+HealthMetricsData.timeLabel(rows.get(0).start)+"至"+HealthMetricsData.timeLabel(rows.get(rows.size()-1).end-60000)+"，点按查看阶段");addView(chart,new FrameLayout.LayoutParams(-1,-1));if(chart instanceof SleepDetailsChart)((SleepDetailsChart)chart).Q();
    }
    void signals(List<TimeStampedData> h,List<TimeStampedData> o){heart=h;oxygen=o;if(chart instanceof SleepCombinedChart)((SleepCombinedChart)chart).C(stages,heart,oxygen);}
    void line(int mode){if(chart instanceof SleepCombinedChart){SleepCombinedChart c=(SleepCombinedChart)chart;c.setLineDrawModel(mode);c.C(stages,heart,oxygen);}}
    void stage(int type,boolean visible){if(chart instanceof SleepCombinedChart){SleepCombinedChart c=(SleepCombinedChart)chart;c.getSleepDrawModelMap().put(type,visible?1:0);c.invalidate();}}
    static void draw(Canvas c,Paint p,List<HealthMetricsData.SleepSegment> rows,RectF r){draw(c,p,rows,r,true);}
    private static void draw(Canvas c,Paint p,List<HealthMetricsData.SleepSegment> rows,RectF r,boolean mini){
        // 6.6.7 SleepDetailsChartRenderer: 2 physical px connector, 4 dp outer corners,
        // square corners at the connection, and bodies overlap its half-width.
        if(rows.isEmpty())return;long start=rows.get(0).start,end=rows.get(rows.size()-1).end;float span=Math.max(1,end-start),lane=r.height()/4,thick=lane*(mini?.9f:.5f),radius=mini?2:4;
        float[] matrix=new float[9];c.getMatrix().getValues(matrix);float pixel=1/Math.max(.01f,Math.abs(matrix[Matrix.MSCALE_X]));float inset=5/Math.max(.01f,Math.abs(matrix[Matrix.MSCALE_Y]));
        int n=rows.size();RectF[] boxes=new RectF[n];float[][] corners=new float[n][8];
        c.save();c.clipRect(r);p.setStyle(Paint.Style.FILL);p.setShader(null);
        if(mini){p.setColor(0xff414141);for(int i=0;i<4;i++){float y=r.bottom-(i+.5f)*lane;c.drawRoundRect(r.left,y-thick/2,r.right,y+thick/2,2,2,p);}}
        for(int i=0;i<n;i++){HealthMetricsData.SleepSegment row=rows.get(i);float y=r.bottom-(row.stage+.5f)*lane;boxes[i]=new RectF(r.left+(row.start-start)/span*r.width(),y-thick/2,r.left+(row.end-start)/span*r.width(),y+thick/2);}
        corners[0][0]=corners[0][1]=corners[0][6]=corners[0][7]=radius;
        for(int i=1;i<n;i++){HealthMetricsData.SleepSegment before=rows.get(i-1),after=rows.get(i);RectF previous=boxes[i-1],current=boxes[i];
            if(before.end==after.start&&!before.last&&before.stage!=after.stage){float boundary=current.left,from,to;
                if(previous.top>current.top){from=previous.top+Math.min(inset,thick/2);to=current.bottom-Math.min(inset,thick/2);corners[i-1][4]=corners[i-1][5]=radius;corners[i][0]=corners[i][1]=radius;}
                else{from=previous.bottom-Math.min(inset,thick/2);to=current.top+Math.min(inset,thick/2);corners[i-1][2]=corners[i-1][3]=radius;corners[i][6]=corners[i][7]=radius;}
                p.setShader(new LinearGradient(boundary,from,boundary,to,COLORS[before.stage],COLORS[after.stage],Shader.TileMode.CLAMP));c.drawRect(boundary-pixel,Math.min(from,to),boundary+pixel,Math.max(from,to),p);p.setShader(null);previous.right+=pixel;current.left-=pixel;
            }else{corners[i-1][2]=corners[i-1][3]=corners[i-1][4]=corners[i-1][5]=radius;corners[i][0]=corners[i][1]=corners[i][6]=corners[i][7]=radius;}}
        corners[n-1][2]=corners[n-1][3]=corners[n-1][4]=corners[n-1][5]=radius;
        for(int i=0;i<n;i++){p.setColor(COLORS[rows.get(i).stage]);Path path=new Path();path.addRoundRect(boxes[i],corners[i],Path.Direction.CW);c.drawPath(path,p);}c.restore();p.setShader(null);
    }
}
