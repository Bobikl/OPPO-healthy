package com.example.opponotificationrelay;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.*;
import android.widget.*;

final class DevicePage implements DeviceController.View {
    private final Activity activity;
    private final TextView name,status,notifications,protection,toolbar,metrics;
    private final View hero;
    private final ScrollView scroll;
    private String currentName="设备";
    DevicePage(Activity activity) {
        this.activity=activity;activity.setContentView(R.layout.activity_device);
        DeviceStyle.insets(activity,activity.findViewById(R.id.device_root));
        name=activity.findViewById(R.id.device_name);status=activity.findViewById(R.id.device_connection);
        metrics=activity.findViewById(R.id.device_metrics);
        toolbar=activity.findViewById(R.id.device_toolbar_title);hero=activity.findViewById(R.id.device_hero);
        scroll=activity.findViewById(R.id.device_scroll);
        activity.findViewById(R.id.device_manage).setOnClickListener(v->open(SettingsActivity.DEVICE));
        LinearLayout primary=activity.findViewById(R.id.device_primary_group);
        notifications=row(primary,"同步手机通知",R.drawable.official_ic_icon_notify1,0,SettingsActivity.NOTIFICATIONS);
        divider(primary);protection=row(primary,"防断连设置",R.drawable.official_ic_icon_keep_alive,0,SettingsActivity.PROTECTION);
        LinearLayout health=activity.findViewById(R.id.device_health_group);
        int[] healthIcons={R.drawable.official_health_daily_activity,R.drawable.official_health_heart_rate,R.drawable.official_health_blood_oxygen,R.drawable.official_health_body_status,R.drawable.official_health_sleep};
        String[] healthHints={"活动目标与提醒","自动监测与心率预警","全天监测与低血氧提醒","自动监测与状态提醒","睡眠监测设置"};
        for(int i=0;i<healthIcons.length;i++){if(i>0)divider(health);row(health,HealthSetting.CATEGORIES[i],healthIcons[i],0,"health:"+i).setText(healthHints[i]);}
        LinearLayout secondary=activity.findViewById(R.id.device_secondary_group);
        row(secondary,"设备管理",R.drawable.official_ic_icon_connect_share,0,SettingsActivity.DEVICE).setText("配对信息与连接管理");
        divider(secondary);row(secondary,"高级设置与诊断",R.drawable.official_ic_icon_more1,0,SettingsActivity.DIAGNOSTICS).setText("状态详情、监听修复与日志");
        String version="";try{version=activity.getPackageManager().getPackageInfo(activity.getPackageName(),0).versionName;}catch(Exception ignored){}
        ((TextView)activity.findViewById(R.id.device_footer)).setText("独立通知转发 · "+version);
        scroll.setOnScrollChangeListener((v,x,y,oldX,oldY)->updateTitle());
    }
    private void open(String section){
        if(section.startsWith("health:")){activity.startActivity(new Intent(activity,HealthSettingsActivity.class).putExtra(HealthSettingsActivity.CATEGORY,Integer.parseInt(section.substring(7))));return;}
        if(SettingsActivity.NOTIFICATIONS.equals(section))activity.startActivity(new Intent(activity,NotificationsActivity.class));
        else activity.startActivity(new Intent(activity,SettingsActivity.class).putExtra(SettingsActivity.EXTRA_SECTION,section));
    }
    private TextView row(LinearLayout parent,String title,int icon,int color,String section) {
        View view=activity.getLayoutInflater().inflate(R.layout.device_row,parent,false);
        ImageView image=view.findViewById(R.id.row_icon);image.setImageResource(icon);image.setPadding(0,0,0,0);image.setBackground(null);
        ((TextView)view.findViewById(R.id.row_title)).setText(title);view.setOnClickListener(v->open(section));parent.addView(view);
        return view.findViewById(R.id.row_subtitle);
    }
    private void divider(LinearLayout parent){View line=new View(activity);line.setBackgroundColor(0xff333333);
        LinearLayout.LayoutParams p=new LinearLayout.LayoutParams(-1,DeviceStyle.dp(activity,1));p.setMargins(DeviceStyle.dp(activity,68),0,DeviceStyle.dp(activity,18),0);parent.addView(line,p);}
    private static void text(TextView view,String value){if(!android.text.TextUtils.equals(view.getText(),value))view.setText(value);}
    private void updateTitle(){text(toolbar,hero.getHeight()>0 && scroll.getScrollY()>name.getTop()?currentName:"设备");}
    @Override public void render(DeviceUiState state){
        currentName=state.name;text(name,state.name);text(status,"●  "+state.connectionText);
        status.setTextColor(state.connection==DeviceUiState.Connection.READY?0xff72d4a3:
            state.connection==DeviceUiState.Connection.CONNECTING || state.connection==DeviceUiState.Connection.CHECKING?0xffe5bd76:DeviceStyle.MUTED);
        ((DeviceHeroView)activity.findViewById(R.id.device_appearance)).identity(state.identity);text(metrics,state.metrics());
        text(notifications,NotificationPreferences.enabled(activity)?state.notifications:"已关闭");text(protection,state.protection);
        activity.findViewById(R.id.device_metrics).setVisibility(state.configured?View.VISIBLE:View.GONE);updateTitle();
    }
}
