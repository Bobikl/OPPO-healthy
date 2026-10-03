package com.example.opponotificationrelay;
import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.os.Build;
import android.util.TypedValue;
import android.view.*;
import android.widget.*;

/** 6.6.7 app_main_tab_item / app_activity_main geometry with a non-clickable gesture gap. */
final class HealthNavigation {
    static void add(LinearLayout root,boolean health,Runnable openHealth,Runnable openDevice){
        Context c=root.getContext();float density=OfficialUiScale.density(c);
        View line=new View(c);line.setBackgroundColor(0xff303030);root.addView(line,new LinearLayout.LayoutParams(-1,Math.max(1,Math.round(.7f*density))));
        LinearLayout area=new LinearLayout(c);area.setOrientation(1);area.setBackgroundColor(DeviceStyle.BG);
        LinearLayout bar=new LinearLayout(c);bar.setGravity(Gravity.CENTER);
        tab(bar,"健康",true,health,openHealth,density);tab(bar,"设备",false,!health,openDevice,density);
        area.addView(bar,new LinearLayout.LayoutParams(-1,Math.round(48*density)));
        // A separate, non-clickable sibling keeps the tab hit regions out of the home gesture.
        View gap=new View(c);gap.setImportantForAccessibility(View.IMPORTANT_FOR_ACCESSIBILITY_NO);
        int base=Math.round(8*density),hiddenGestureFallback=DeviceStyle.dp(c,10);
        area.addView(gap,new LinearLayout.LayoutParams(-1,Math.max(base,hiddenGestureFallback)));
        area.setOnApplyWindowInsetsListener((v,w)->{
            int nav,gesture;
            if(Build.VERSION.SDK_INT>=30){nav=w.getInsets(WindowInsets.Type.navigationBars()).bottom;gesture=Math.max(w.getInsets(WindowInsets.Type.systemGestures()).bottom,w.getInsets(WindowInsets.Type.mandatorySystemGestures()).bottom);}
            else {nav=w.getSystemWindowInsetBottom();gesture=Math.max(w.getSystemGestureInsets().bottom,w.getMandatorySystemGestureInsets().bottom);}
            // DeviceStyle already reserves nav outside the root; reserve only the remainder here.
            int height=Math.max(base+nav,Math.max(gesture,hiddenGestureFallback))-nav;
            if(gap.getLayoutParams().height!=height){gap.getLayoutParams().height=height;gap.requestLayout();}
            return w;
        });
        root.addView(area,new LinearLayout.LayoutParams(-1,-2));area.requestApplyInsets();
    }
    private static void tab(LinearLayout bar,String title,boolean heart,boolean selected,Runnable action,float density){Context c=bar.getContext();
        LinearLayout tab=new LinearLayout(c);tab.setOrientation(1);tab.setGravity(Gravity.CENTER);tab.setBackgroundResource(R.drawable.device_row_press);tab.setContentDescription(title);tab.setSelected(selected);tab.setOnClickListener(v->action.run());
        LinearLayout content=new LinearLayout(c);content.setOrientation(1);content.setGravity(Gravity.CENTER_HORIZONTAL);
        ImageView icon=new ImageView(c);icon.setImageResource(heart?(selected?R.drawable.official_nav_health_selected:R.drawable.official_nav_health_normal):(selected?R.drawable.official_nav_device_selected:R.drawable.official_nav_device_normal));icon.setAlpha(selected?.9f:.54f);
        LinearLayout.LayoutParams image=new LinearLayout.LayoutParams(Math.round(28*density),Math.round(25*density));image.topMargin=Math.round(8*density);content.addView(icon,image);
        TextView label=new TextView(c);label.setText(title);label.setTextSize(TypedValue.COMPLEX_UNIT_PX,10*density);label.setTextColor(selected?0xffeeeeee:0xff999999);label.setGravity(Gravity.CENTER);content.addView(label);
        tab.addView(content,new LinearLayout.LayoutParams(-1,-2));bar.addView(tab,new LinearLayout.LayoutParams(0,-1,1));
    }
}
