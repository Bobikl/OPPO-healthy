package com.example.opponotificationrelay;
import android.app.Activity;
import android.content.Context;
import android.view.*;
import android.widget.*;
import com.coui.appcompat.panel.COUIBottomSheetDialog;
import com.heytap.health.sleep.view.OplusNearTimePicker;
/** Official time wheels and bottom panel, connected to existing validated save callbacks. */
final class OfficialTimePicker {
    interface Result{void selected(int minutes);}
    static void show(Activity activity,String title,int minutes,Result result){
        Context c=OfficialUiResources.panel(activity);COUIBottomSheetDialog dialog=new COUIBottomSheetDialog(c);dialog.setIsShowInMaxHeight(false);
        LinearLayout content=new LinearLayout(c);content.setOrientation(1);content.setPadding(0,dp(c,8),0,dp(c,12));
        TextView heading=new TextView(c);heading.setText(title);heading.setTextSize(18);heading.setTextColor(0xffeeeeee);heading.setGravity(Gravity.CENTER);content.addView(heading,new LinearLayout.LayoutParams(-1,dp(c,48)));
        OplusNearTimePicker picker=new OplusNearTimePicker(c);picker.setIs24HourView(true);picker.setCurrentHour(minutes/60);picker.setCurrentMinute(minutes%60);picker.setTextVisibility(false);picker.setUnitVisible(true);picker.setContentDescription(title);content.addView(picker,new LinearLayout.LayoutParams(-1,dp(c,210)));
        content.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1,-2));dialog.setContentView(content);OfficialPanelStyle.apply(c,dialog);dialog.setBottomButtonBar(true,"取消",v->dialog.dismiss(),null,null,"确定",v->{picker.clearFocus();int chosen=picker.getCurrentHour()*60+picker.getCurrentMinute();dialog.dismiss();result.selected(chosen);});dialog.setSkipCollapsed(true);dialog.show();
    }
    static void showValues(Activity activity,String title,String[] labels,int selected,Result result){
        Context c=OfficialUiResources.panel(activity);COUIBottomSheetDialog dialog=new COUIBottomSheetDialog(c);dialog.setIsShowInMaxHeight(false);
        LinearLayout content=new LinearLayout(c);content.setOrientation(1);content.setGravity(Gravity.CENTER_HORIZONTAL);
        TextView heading=new TextView(c);heading.setText(title);heading.setTextSize(18);heading.setTextColor(0xffeeeeee);heading.setGravity(Gravity.CENTER);content.addView(heading,new LinearLayout.LayoutParams(-1,dp(c,48)));
        com.coui.appcompat.picker.COUINumberPicker picker=new com.coui.appcompat.picker.COUINumberPicker(c);picker.setMinValue(0);picker.setMaxValue(labels.length-1);picker.setDisplayedValues(labels);picker.setWrapSelectorWheel(false);picker.setValue(Math.max(0,Math.min(labels.length-1,selected)));picker.setContentDescription(title);content.addView(picker,new LinearLayout.LayoutParams(dp(c,240),dp(c,210)));
        content.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1,-2));dialog.setContentView(content);OfficialPanelStyle.apply(c,dialog);dialog.setBottomButtonBar(true,"取消",v->dialog.dismiss(),null,null,"确定",v->{int chosen=picker.getValue();dialog.dismiss();result.selected(chosen);});dialog.setSkipCollapsed(true);dialog.show();
    }
    static int dp(Context c,int n){return Math.round(n*c.getResources().getDisplayMetrics().density);}
}
