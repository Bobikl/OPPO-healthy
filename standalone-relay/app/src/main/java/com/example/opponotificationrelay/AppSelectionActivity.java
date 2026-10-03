package com.example.opponotificationrelay;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.*;
import java.text.Collator;
import java.util.*;

/** 应用列表仅用于本地选择；后台加载，ListView 复用条目，不加载全部图标。 */
public final class AppSelectionActivity extends Activity {
    private final List<Entry> all=new ArrayList<>(), shown=new ArrayList<>();
    private Set<String> selected;
    private ArrayAdapter<String> adapter;
    private ListView list;
    private TextView count;
    private EditText search;
    private volatile boolean cancelled;
    private Thread loader;
    private final android.os.Handler callbacks=new android.os.Handler(android.os.Looper.getMainLooper());
    private static final class Entry {
        final String label,pkg;
        Entry(String label,String pkg){this.label=label;this.pkg=pkg;}
    }
    @Override public void onCreate(Bundle saved) {
        super.onCreate(saved);
        selected=RelayConfig.selectedApps(this);
        LinearLayout root=new LinearLayout(this);root.setOrientation(LinearLayout.VERTICAL);
        int pad=(int)(16*getResources().getDisplayMetrics().density);root.setPadding(pad,pad,pad,pad);

        TextView hint=new TextView(this);hint.setText("仅勾选的应用会由独立版转发；更改立即保存，不修改官方健康的设置。未勾选的新应用默认不转发。");root.addView(hint);
        count=new TextView(this);root.addView(count);
        search=new EditText(this);search.setSingleLine(true);search.setHint("搜索应用名称或包名");root.addView(search);
        LinearLayout actions=new LinearLayout(this);
        Button select=new Button(this);select.setText("选中搜索结果");actions.addView(select,new LinearLayout.LayoutParams(0,-2,1));
        Button clear=new Button(this);clear.setText("全部取消");actions.addView(clear,new LinearLayout.LayoutParams(0,-2,1));root.addView(actions);
        list=new ListView(this);list.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_multiple_choice,new ArrayList<>());list.setAdapter(adapter);
        root.addView(list,new LinearLayout.LayoutParams(-1,0,1));
        Button done=new Button(this);done.setText("完成");done.setOnClickListener(v->finish());root.addView(done);DeviceStyle.styleTree(root);DeviceStyle.shell(this,"应用通知",root);
        list.setOnItemClickListener((parent,view,position,id)->{
            String pkg=shown.get(position).pkg;
            if(list.isItemChecked(position))selected.add(pkg);else selected.remove(pkg);
            persist();
        });
        select.setOnClickListener(v->{for(Entry e:shown)selected.add(e.pkg);persist();filter();});
        clear.setOnClickListener(v->new AlertDialog.Builder(this).setTitle("取消所有应用？")
            .setMessage("独立版将不再转发任何应用通知，手动测试通知不受影响。")
            .setNegativeButton("保留",null).setPositiveButton("全部取消",(d,w)->{selected.clear();persist();filter();}).show());
        search.addTextChangedListener(new TextWatcher(){
            public void beforeTextChanged(CharSequence s,int start,int c,int after){}
            public void onTextChanged(CharSequence s,int start,int before,int c){filter();}
            public void afterTextChanged(Editable s){}
        });
        count.setText("正在加载本机应用…");
        final android.content.Context app=getApplicationContext();
        loader=new Thread(()->{
            List<Entry> found=new ArrayList<>();
            try {
                for(ApplicationInfo info:app.getPackageManager().getInstalledApplications(0)) {
                    if(cancelled || Thread.currentThread().isInterrupted())return;
                    if(info.packageName.equals(getPackageName()))continue;
                    String label;
                    try{label=String.valueOf(info.loadLabel(app.getPackageManager()));}catch(Exception e){label=info.packageName;}
                    found.add(new Entry(label,info.packageName));
                }
                if(cancelled)return;
                Collator collator=Collator.getInstance(Locale.SIMPLIFIED_CHINESE);
                found.sort((a,b)->collator.compare(a.label,b.label));
                if(cancelled)return;
                callbacks.post(()->{if(cancelled || isFinishing()||isDestroyed())return;all.addAll(found);filter();});
            }catch(Exception e){if(!cancelled)callbacks.post(()->{if(!cancelled && !isFinishing() && !isDestroyed())count.setText("读取应用列表失败，请返回重试");});}
        },"OAF-app-list");loader.start();
    }
    @Override protected void onDestroy() {
        cancelled=true;if(loader!=null){loader.interrupt();loader=null;}callbacks.removeCallbacksAndMessages(null);
        all.clear();shown.clear();if(selected!=null)selected.clear();
        if(adapter!=null)adapter.clear();if(list!=null)list.setAdapter(null);
        adapter=null;list=null;count=null;search=null;super.onDestroy();
    }
    private void persist(){RelayConfig.selectApps(this,selected);updateCount();}
    private void updateCount(){count.setText("已选择 "+selected.size()+" 个应用 · 当前显示 "+shown.size()+" 个");}
    private void filter(){
        String q=search.getText().toString().trim().toLowerCase(Locale.ROOT);
        shown.clear();adapter.setNotifyOnChange(false);adapter.clear();list.clearChoices();
        for(Entry e:all)if(q.isEmpty()||e.label.toLowerCase(Locale.ROOT).contains(q)||e.pkg.toLowerCase(Locale.ROOT).contains(q)){
            shown.add(e);adapter.add(e.label+"\n"+e.pkg);
        }
        adapter.notifyDataSetChanged();
        for(int i=0;i<shown.size();i++)list.setItemChecked(i,selected.contains(shown.get(i).pkg));
        updateCount();
    }
}
