package com.example.opponotificationrelay;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Insets;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.*;
import android.widget.*;

final class DeviceStyle {
    static final int BG=Color.rgb(25,25,25), CARD=Color.rgb(38,38,38), TEXT=Color.rgb(245,245,245),
        MUTED=Color.rgb(170,170,170), ACCENT=Color.rgb(129,172,255);
    static int dp(Context c,int value){return Math.round(value*c.getResources().getDisplayMetrics().density);}
    static GradientDrawable shape(int color,int radius,Context c){
        GradientDrawable drawable=new GradientDrawable();drawable.setColor(color);drawable.setCornerRadius(dp(c,radius));return drawable;
    }
    static void insets(Activity activity,View root) {
        activity.getWindow().setStatusBarColor(BG);activity.getWindow().setNavigationBarColor(BG);
        activity.getWindow().getDecorView().setSystemUiVisibility(0);
        // Own the insets on both target-35 enforced edge-to-edge and older Android versions.
        if(Build.VERSION.SDK_INT>=30)activity.getWindow().setDecorFitsSystemWindows(false);
        else activity.getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE|View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN|View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
        root.setOnApplyWindowInsetsListener((v,w)->{
            int left,top,right,bottom;
            if(Build.VERSION.SDK_INT>=30){Insets i=w.getInsets(WindowInsets.Type.systemBars()|WindowInsets.Type.displayCutout()|WindowInsets.Type.ime());left=i.left;top=i.top;right=i.right;bottom=i.bottom;}
            else {left=w.getSystemWindowInsetLeft();top=w.getSystemWindowInsetTop();right=w.getSystemWindowInsetRight();bottom=w.getSystemWindowInsetBottom();}
            v.setPadding(left,top,right,bottom);return w;
        });root.requestApplyInsets();
    }
    static LinearLayout shell(Activity activity,String title,View content) {
        LinearLayout shell=new LinearLayout(activity);shell.setOrientation(LinearLayout.VERTICAL);shell.setBackgroundColor(BG);
        LinearLayout bar=new LinearLayout(activity);bar.setGravity(Gravity.CENTER_VERTICAL);bar.setPadding(dp(activity,8),0,dp(activity,20),0);
        ImageButton back=new ImageButton(activity);back.setImageResource(R.drawable.device_back);back.setContentDescription("返回");
        back.setBackgroundResource(R.drawable.device_row_press);back.setOnClickListener(v->activity.finish());
        bar.addView(back,new LinearLayout.LayoutParams(dp(activity,48),dp(activity,48)));
        TextView label=new TextView(activity);label.setText(title);label.setTextColor(TEXT);label.setTextSize(21);label.setTypeface(null,1);
        bar.addView(label,new LinearLayout.LayoutParams(0,-2,1));shell.addView(bar,new LinearLayout.LayoutParams(-1,dp(activity,60)));
        shell.addView(content,new LinearLayout.LayoutParams(-1,0,1));activity.setContentView(shell);insets(activity,shell);return shell;
    }
    static void styleTree(View view) {
        Context c=view.getContext();
        if(view instanceof TextView) {
            TextView text=(TextView)view;text.setTextColor(TEXT);text.setLineSpacing(dp(c,3),1f);
            if(text.getTextSize()/c.getResources().getDisplayMetrics().scaledDensity<=13)text.setTextColor(MUTED);
            if(!(text instanceof Button) && !(text instanceof EditText))text.setPadding(text.getPaddingLeft(),dp(c,6),text.getPaddingRight(),dp(c,6));
        }
        if(view instanceof Button && !(view instanceof CompoundButton)) {
            Button button=(Button)view;button.setAllCaps(false);button.setTextSize(14);button.setMinHeight(dp(c,48));
            button.setBackground(new RippleDrawable(ColorStateList.valueOf(0x24ffffff),shape(0xff344258,14,c),null));
            button.setTextColor(new ColorStateList(new int[][]{new int[]{-android.R.attr.state_enabled},new int[]{}},new int[]{0xff777777,TEXT}));
            if(button.getLayoutParams() instanceof LinearLayout.LayoutParams){LinearLayout.LayoutParams p=(LinearLayout.LayoutParams)button.getLayoutParams();p.topMargin=dp(c,6);p.bottomMargin=dp(c,6);}
        }
        if(view instanceof CompoundButton){CompoundButton button=(CompoundButton)view;button.setMinHeight(dp(c,52));button.setTextSize(15);}
        if(view instanceof EditText){((EditText)view).setHintTextColor(MUTED);}
        if(view instanceof ViewGroup){ViewGroup group=(ViewGroup)view;for(int i=0;i<group.getChildCount();i++)styleTree(group.getChildAt(i));}
    }
}
