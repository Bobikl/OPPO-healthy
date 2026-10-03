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
    static void show(Activity activity,LocalDate selected,HealthUi.DateChanged callback){
        Context c=OfficialUiResources.panel(activity);COUIBottomSheetDialog dialog=new COUIBottomSheetDialog(c);
        HealthMetricsData data=HealthDataManager.get(activity).snapshot();Map<LocalDate,Float> marked=new HashMap<>();boolean sleep=activity instanceof SleepDetailActivity||activity instanceof SleepTimelineActivity;
        if(data!=null)for(HealthMetricsData.Day d:data.days.values()){
            int metric=activity.getIntent().getIntExtra("metric",HealthMetricsData.STEPS);
            float amount=activity instanceof AdditionalHealthActivity?(((AdditionalHealthActivity)activity).has(d)?1f:0f):activity instanceof WellnessDetailActivity?(((WellnessDetailActivity)activity).has(d)?1f:0f):activity instanceof VitalsDetailActivity?(((VitalsDetailActivity)activity).oxygen()?(d.oxygenCount>0?1f:0f):(d.wristBase>0&&d.wristValue>0?1f:0f)):sleep?(d.sleepMinutes>0?1f:0f):activity instanceof HeartDetailActivity?(d.min>0?1f:0f):(metric==HealthMetricsData.CALORIES?d.calories>0:d.steps>0)?1f:0f;
            if(amount>0)marked.put(d.date,Math.min(1,amount));
        }
        Function1 choose=new Function1(){public Object invoke(Object day){dialog.dismiss();callback.change((LocalDate)day);return Unit.INSTANCE;}};
        CommonCalendarFragment fragment=new CommonCalendarFragment(selected,null,marked,sleep?HealthMetricsData.PURPLE:activity instanceof HeartDetailActivity?HealthMetricsData.RED:HealthMetricsData.GREEN,choose,null);
        FrameLayout panel=new FrameLayout(c);fragment.setContentView(panel);fragment.initView(panel);
        // initView adds an inflated root without LayoutParams; FrameLayout otherwise defaults to MATCH_PARENT.
        panel.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1,-2));
        if(panel.getChildCount()>0)panel.getChildAt(0).setLayoutParams(new FrameLayout.LayoutParams(-1,-2));
        TextView today=panel.findViewById(OfficialUiResources.id(c,"id","back_to_today"));if(today!=null){today.setTextColor(0xffeeeeee);today.setContentDescription("回到今天");}
        View calendar=panel.findViewById(OfficialUiResources.id(c,"id","recycler_view"));if(calendar!=null)calendar.setContentDescription("健康日历，上下滑动切换月份");
        dialog.setContentView(panel);OfficialPanelStyle.apply(c,dialog);
        // COUI measures its wrapper using the isolated application context. Preserve the
        // calendar's own original Activity-density measurement instead of clipping its last row.
        panel.measure(View.MeasureSpec.makeMeasureSpec(c.getResources().getDisplayMetrics().widthPixels,View.MeasureSpec.EXACTLY),View.MeasureSpec.makeMeasureSpec(0,View.MeasureSpec.UNSPECIFIED));
        dialog.setHeight(panel.getMeasuredHeight()+c.getResources().getDimensionPixelSize(OfficialUiResources.id(c,"dimen","coui_panel_drag_view_hide_height")));
        dialog.setSkipCollapsed(true);dialog.show();
    }
}
