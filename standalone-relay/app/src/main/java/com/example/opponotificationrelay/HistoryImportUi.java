package com.example.opponotificationrelay;
import android.app.*;
import android.os.*;
import android.widget.*;
import java.util.*;
/** Application-scoped job; the Activity observes progress and can reopen after rotation. */
final class HistoryImportUi {
    private static boolean running;private static int percent;private static String message="";
    static synchronized boolean running(){return running;}
    static void show(Activity activity,Runnable done){
        synchronized(HistoryImportUi.class){if(!running){
            if(!OfficialHistoryStore.allowed(activity)){Toast.makeText(activity,"请先开启允许读取官方 App 数据",Toast.LENGTH_LONG).show();return;}
            running=true;percent=0;message="正在准备导入…";android.content.Context c=activity.getApplicationContext();
            new Thread(()->{try{OfficialHistoryStore.importAll(c,(p,m)->{synchronized(HistoryImportUi.class){percent=p;message=m;}});}
                catch(Exception failure){synchronized(HistoryImportUi.class){message="合并失败\n新增记录：0 条（未提交本次合并）\n错误："+OfficialSettingsClient.errorMessage(failure)+"\n原有独立版数据已保留。\n\n上次结果：\n"+OfficialHistoryStore.status(c);}}
                finally{synchronized(HistoryImportUi.class){running=false;}}
            },"personal-history-import").start();
        }}
        LinearLayout content=new LinearLayout(activity);content.setOrientation(1);int padding=(int)(24*activity.getResources().getDisplayMetrics().density);content.setPadding(padding,padding,padding,padding);
        ProgressBar bar=new ProgressBar(activity,null,android.R.attr.progressBarStyleHorizontal);bar.setMax(100);content.addView(bar,new LinearLayout.LayoutParams(-1,-2));
        TextView status=new TextView(activity);status.setPadding(0,padding/2,0,0);content.addView(status);
        AlertDialog dialog=new AlertDialog.Builder(activity).setTitle("导入并合并全部个人数据").setView(content).setPositiveButton("完成",null).create();dialog.setCancelable(false);dialog.show();
        Handler handler=new Handler(Looper.getMainLooper());Runnable refresh=new Runnable(){public void run(){if(activity.isFinishing()||activity.isDestroyed()){dialog.dismiss();return;}boolean active;int value;String text;synchronized(HistoryImportUi.class){active=running;value=percent;text=message;}bar.setProgress(value);bar.setIndeterminate(active&&value<35);status.setText(active&&value>=35?value+"% · "+text:text);dialog.getButton(AlertDialog.BUTTON_POSITIVE).setEnabled(!active);if(active)handler.postDelayed(this,200);else {bar.setIndeterminate(false);if(done!=null)done.run();}}};refresh.run();
    }
}
