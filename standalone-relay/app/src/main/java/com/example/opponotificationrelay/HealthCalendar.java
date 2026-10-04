package com.example.opponotificationrelay;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.*;
import com.coui.appcompat.panel.COUIBottomSheetDialog;
import com.heytap.health.healthbase.view.CommonCalendarFragment;
import java.time.*;
import java.util.*;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/** Original calendar panel, RecyclerView adapter, month/day renderers and date hit testing. */
final class HealthCalendar {
    private static final Map<Activity,Object> requests=new WeakHashMap<>();
    static void show(Activity activity,LocalDate selected,HealthUi.DateChanged callback){
        boolean sleep=activity instanceof SleepDetailActivity||activity instanceof SleepTimelineActivity;
        String metric=sleep?"sleep":activity instanceof HeartDetailActivity?"heart":activity instanceof VitalsDetailActivity?(((VitalsDetailActivity)activity).oxygen()?"oxygen":"wrist"):activity instanceof WellnessDetailActivity?(activity.getIntent().getIntExtra("vital",5)==5?"mind":activity.getIntent().getIntExtra("vital",5)==6?"relax":"sunshine"):activity instanceof AdditionalHealthActivity?(activity.getIntent().getIntExtra("vital",8)==8?"weight":activity.getIntent().getIntExtra("vital",8)==9?"glucose":"apnea"):activity.getIntent().getIntExtra("metric",HealthMetricsData.STEPS)==HealthMetricsData.CALORIES?"calories":"steps";
        Object request=new Object();requests.put(activity,request);
        HealthDataManager.get(activity).calendar(metric,(dates,error)->{
            if(requests.get(activity)!=request)return;requests.remove(activity);
            if(activity.isFinishing()||activity.isDestroyed()||!activity.hasWindowFocus())return;
            if(!error.isEmpty()){Toast.makeText(activity,error,Toast.LENGTH_LONG).show();return;}
            showComplete(activity,selected,callback,dates,sleep);
        });
    }
    private static void showComplete(Activity activity,LocalDate selected,HealthUi.DateChanged callback,Map<LocalDate,Float> marked,boolean sleep){
        Context c=OfficialUiResources.panel(activity);COUIBottomSheetDialog dialog=new COUIBottomSheetDialog(c);
        Function1 choose=new Function1(){public Object invoke(Object day){dialog.dismiss();callback.change((LocalDate)day);return Unit.INSTANCE;}};
        CommonCalendarFragment fragment=new CommonCalendarFragment(selected,null,marked,sleep?HealthMetricsData.PURPLE:activity instanceof HeartDetailActivity?HealthMetricsData.RED:HealthMetricsData.GREEN,choose,null);
        FrameLayout panel=new FrameLayout(c);fragment.setContentView(panel);fragment.initView(panel);
        // initView adds an inflated root without LayoutParams; FrameLayout otherwise defaults to MATCH_PARENT.
        panel.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1,-2));
        if(panel.getChildCount()>0)panel.getChildAt(0).setLayoutParams(new FrameLayout.LayoutParams(-1,-2));
        TextView today=panel.findViewById(OfficialUiResources.id(c,"id","back_to_today"));if(today!=null){today.setTextColor(0xffeeeeee);today.setContentDescription("回到今天");}
        View calendar=panel.findViewById(OfficialUiResources.id(c,"id","recycler_view"));if(calendar!=null)calendar.setContentDescription("健康日历，上下滑动切换月份");
        LinearLayout container=new LinearLayout(c);container.setOrientation(1);TextView loading=new TextView(c);loading.setText("彩色圆圈标记有记录的日期");loading.setTextColor(0xffaaaaaa);loading.setTextSize(13);loading.setPadding(HealthUi.dp(activity,18),HealthUi.dp(activity,8),HealthUi.dp(activity,18),0);container.addView(loading);container.addView(panel);
        dialog.setContentView(container);OfficialPanelStyle.apply(c,dialog);
        // COUI measures its wrapper using the isolated application context. Preserve the
        // calendar's own original Activity-density measurement instead of clipping its last row.
        container.measure(View.MeasureSpec.makeMeasureSpec(c.getResources().getDisplayMetrics().widthPixels,View.MeasureSpec.EXACTLY),View.MeasureSpec.makeMeasureSpec(0,View.MeasureSpec.UNSPECIFIED));
        dialog.setHeight(container.getMeasuredHeight()+c.getResources().getDimensionPixelSize(OfficialUiResources.id(c,"dimen","coui_panel_drag_view_hide_height")));
        dialog.setSkipCollapsed(true);dialog.show();
    }
}
