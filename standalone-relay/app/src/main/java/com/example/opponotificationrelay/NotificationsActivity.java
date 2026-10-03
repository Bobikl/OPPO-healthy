package com.example.opponotificationrelay;

import android.app.*;
import android.content.*;
import android.content.pm.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.os.*;
import android.text.*;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.LruCache;
import android.view.*;
import android.widget.*;
import java.text.Collator;
import java.util.*;
import java.util.concurrent.*;

/** One scrolling notification page. App rows are recycled; icons are bounded and loaded off the UI thread. */
public final class NotificationsActivity extends OfficialUiActivity {
    private static final int CARD=0xff303030, BLUE=0xff287bff;
    private final Handler ui=new Handler(Looper.getMainLooper());
    private final List<Entry> all=new ArrayList<>(),shown=new ArrayList<>();
    private final Set<String> iconPending=new HashSet<>();
    private final LruCache<String,Bitmap> icons=new LruCache<>(48);
    private final ThreadPoolExecutor iconWorker=new ThreadPoolExecutor(1,1,0,TimeUnit.SECONDS,
        new ArrayBlockingQueue<>(32),r->new Thread(r,"OAF-app-icons"),new ThreadPoolExecutor.AbortPolicy());
    private Set<String> selected=new HashSet<>();
    private ListView list;private Apps adapter;private EditText search;
    private TextView allAction,count,wristHint;private CompoundButton master,wrist,screen;
    private boolean rendering,loaded;private volatile boolean cancelled;private Thread loader;
    private final Runnable refresh=new Runnable(){public void run(){render();ui.postDelayed(this,2000);}};
    private static final class Entry {
        final String pkg,label;final boolean system;
        Entry(String pkg,String label,boolean system){this.pkg=pkg;this.label=label;this.system=system;}
    }
    @Override public void onUiCreate(Bundle saved){
        super.onUiCreate(saved);selected=RelayConfig.selectedApps(this);
        LinearLayout content=new LinearLayout(this);content.setOrientation(LinearLayout.VERTICAL);
        search=new EditText(this);search.setSingleLine(true);search.setTextSize(15);search.setTextColor(DeviceStyle.TEXT);
        search.setHintTextColor(DeviceStyle.MUTED);search.setHint("搜索应用名称或包名");search.setVisibility(View.GONE);
        search.setPadding(dp(20),dp(4),dp(20),dp(4));content.addView(search,new LinearLayout.LayoutParams(-1,dp(52)));
        list=new ListView(this);list.setDivider(null);list.setSelector(android.R.color.transparent);
        list.setPadding(dp(18),0,dp(18),dp(24));list.setClipToPadding(false);list.setVerticalScrollBarEnabled(false);
        list.addHeaderView(header(),null,false);list.addFooterView(footer(),null,false);
        adapter=new Apps();list.setAdapter(adapter);content.addView(list,new LinearLayout.LayoutParams(-1,0,1));
        LinearLayout shell=DeviceStyle.shell(this,"同步手机通知",content);
        LinearLayout bar=(LinearLayout)shell.getChildAt(0);TextView find=label("更多",14,DeviceStyle.ACCENT);
        find.setGravity(Gravity.CENTER);find.setPadding(dp(10),0,0,0);bar.addView(find,new LinearLayout.LayoutParams(-2,dp(48)));
        find.setOnClickListener(v->{PopupMenu menu=new PopupMenu(this,find);
            menu.getMenu().add(0,1,0,"搜索应用");menu.getMenu().add(0,2,1,"更多通知设置");
            menu.setOnMenuItemClickListener(item->{if(item.getItemId()==2){startActivity(new Intent(this,SettingsActivity.class).putExtra(SettingsActivity.EXTRA_SECTION,SettingsActivity.NOTIFICATIONS));return true;}
                boolean show=search.getVisibility()!=View.VISIBLE;search.setVisibility(show?View.VISIBLE:View.GONE);
                android.view.inputmethod.InputMethodManager keyboard=getSystemService(android.view.inputmethod.InputMethodManager.class);
                if(show){search.requestFocus();if(keyboard!=null)keyboard.showSoftInput(search,android.view.inputmethod.InputMethodManager.SHOW_IMPLICIT);}
                else {search.setText("");if(keyboard!=null)keyboard.hideSoftInputFromWindow(search.getWindowToken(),0);}return true;});menu.show();});
        search.addTextChangedListener(new TextWatcher(){public void beforeTextChanged(CharSequence s,int a,int c,int f){}
            public void afterTextChanged(Editable s){}public void onTextChanged(CharSequence s,int a,int b,int c){filter();}});
        loadApps();render();
    }
    @Override protected void onUiResume(){super.onUiResume();selected=RelayConfig.selectedApps(this);if(adapter!=null)adapter.notifyDataSetChanged();render();ui.postDelayed(refresh,2000);}
    @Override protected void onUiPause(){ui.removeCallbacks(refresh);super.onUiPause();}
    @Override protected void onUiDestroy(){
        cancelled=true;if(loader!=null)loader.interrupt();iconWorker.shutdownNow();ui.removeCallbacksAndMessages(null);
        icons.evictAll();iconPending.clear();if(list!=null)list.setAdapter(null);all.clear();shown.clear();super.onUiDestroy();
    }
    private int dp(int n){return DeviceStyle.dp(this,n);}
    private TextView label(String text,int size,int color){TextView v=new TextView(this);v.setText(text);v.setTextSize(size);v.setTextColor(color);v.setLineSpacing(dp(3),1);return v;}
    private LinearLayout vertical(){LinearLayout v=new LinearLayout(this);v.setOrientation(LinearLayout.VERTICAL);return v;}
    private LinearLayout card(){LinearLayout v=vertical();v.setBackground(DeviceStyle.shape(CARD,16,this));return v;}
    private void addCard(LinearLayout parent,View card,int bottom){LinearLayout.LayoutParams p=new LinearLayout.LayoutParams(-1,-2);p.bottomMargin=dp(bottom);parent.addView(card,p);}
    private CompoundButton toggle(){return new OfficialStyleSwitch(this);}
    private CompoundButton switchRow(LinearLayout parent,String title,String description,boolean divider){
        if(divider)divider(parent,18);
        LinearLayout row=new LinearLayout(this);row.setGravity(Gravity.CENTER_VERTICAL);row.setPadding(dp(18),dp(13),dp(18),dp(13));
        LinearLayout texts=vertical();TextView name=label(title,18,DeviceStyle.TEXT);texts.addView(name);
        TextView hint=label(description,14,DeviceStyle.MUTED);LinearLayout.LayoutParams hp=new LinearLayout.LayoutParams(-1,-2);hp.topMargin=dp(4);texts.addView(hint,hp);
        row.addView(texts,new LinearLayout.LayoutParams(0,-2,1));CompoundButton s=toggle();s.setContentDescription(title);row.addView(s,new LinearLayout.LayoutParams(-2,dp(48)));
        row.setOnClickListener(v->{if(s.isEnabled())s.setChecked(!s.isChecked());});parent.addView(row,new LinearLayout.LayoutParams(-1,-2));
        if(title.startsWith("脱腕"))wristHint=hint;
        if(title.equals("同步手机通知")){
            SpannableString help=new SpannableString(description);int begin=description.indexOf("帮助");
            help.setSpan(new ClickableSpan(){public void onClick(View v){showHelp();}
                public void updateDrawState(android.text.TextPaint ds){ds.setColor(DeviceStyle.ACCENT);ds.setUnderlineText(false);}},begin,begin+2,0);
            hint.setText(help);hint.setMovementMethod(LinkMovementMethod.getInstance());
        }
        return s;
    }
    private void divider(LinearLayout parent,int left){View v=new View(this);v.setBackgroundColor(0xff424242);
        LinearLayout.LayoutParams p=new LinearLayout.LayoutParams(-1,dp(1));p.setMargins(dp(left),0,dp(18),0);parent.addView(v,p);}
    private View header(){
        LinearLayout root=vertical();root.setPadding(0,dp(20),0,0);
        LinearLayout main=card();master=switchRow(main,"同步手机通知","开启后，设备将接收手机的通知，若收不到消息，请查看帮助。",false);
        master.setOnCheckedChangeListener((v,on)->{if(!rendering){NotificationPreferences.setEnabled(this,on);render();adapter.notifyDataSetChanged();}});addCard(root,main,18);
        LinearLayout options=card();LinearLayout cloud=new LinearLayout(this);cloud.setGravity(Gravity.CENTER_VERTICAL);cloud.setPadding(dp(18),dp(13),dp(18),dp(13));
        LinearLayout cloudText=vertical();cloudText.addView(label("云通知",18,DeviceStyle.TEXT));cloudText.addView(label("暂未接入",14,DeviceStyle.MUTED));
        cloud.addView(cloudText,new LinearLayout.LayoutParams(0,-2,1));options.addView(cloud);cloud.setOnClickListener(v->new AlertDialog.Builder(this)
            .setTitle("云通知").setMessage("云通知功能暂缓开发。当前通过手机与手表的蓝牙连接同步通知。").setPositiveButton("知道了",null).show());
        wrist=switchRow(options,"脱腕时推送通知","开启后，不佩戴设备时，手机也会推送通知。",true);
        wrist.setOnCheckedChangeListener((v,on)->{if(!rendering){NotificationPreferences.setWristPush(this,on);render();}});
        screen=switchRow(options,"手机亮屏使用时推送通知","开启后，手机在亮屏且已解锁的状态下依然推送通知。",true);
        screen.setOnCheckedChangeListener((v,on)->{if(!rendering){NotificationPreferences.setScreenPush(this,on);render();}});addCard(root,options,16);
        LinearLayout appHeading=new LinearLayout(this);appHeading.setGravity(Gravity.CENTER_VERTICAL);appHeading.setPadding(dp(18),0,dp(18),0);
        TextView section=label("应用通知",14,DeviceStyle.MUTED);section.setGravity(Gravity.CENTER_VERTICAL);appHeading.addView(section,new LinearLayout.LayoutParams(0,dp(48),1));
        allAction=label("全部开启",14,DeviceStyle.ACCENT);allAction.setGravity(Gravity.CENTER_VERTICAL);appHeading.addView(allAction,new LinearLayout.LayoutParams(-2,dp(48)));
        allAction.setOnClickListener(v->{if(!loaded || !NotificationPreferences.enabled(this))return;boolean clear=allSelected();
            if(clear)selected.clear();else for(Entry e:all)selected.add(e.pkg);persist();adapter.notifyDataSetChanged();});root.addView(appHeading);return root;
    }
    private View footer(){LinearLayout v=vertical();count=label("正在加载应用…",12,DeviceStyle.MUTED);count.setPadding(dp(18),dp(12),dp(18),dp(8));v.addView(count);
        TextView more=label("更多通知设置  ›",16,DeviceStyle.TEXT);more.setGravity(Gravity.CENTER_VERTICAL);more.setPadding(dp(18),0,dp(18),0);
        more.setBackground(DeviceStyle.shape(CARD,16,this));v.addView(more,new LinearLayout.LayoutParams(-1,dp(56)));
        more.setOnClickListener(w->startActivity(new Intent(this,SettingsActivity.class).putExtra(SettingsActivity.EXTRA_SECTION,SettingsActivity.NOTIFICATIONS)));return v;}
    private void render(){if(master==null)return;rendering=true;boolean on=NotificationPreferences.enabled(this);master.setChecked(on);
        Boolean off=NotificationPreferences.wristPush(this);wrist.setChecked(Boolean.TRUE.equals(off));wrist.setEnabled(on && off!=null);
        wristHint.setText(off==null?"连接设备并读取设置后可用。":"开启后，不佩戴设备时，手机也会推送通知。");
        screen.setChecked(NotificationPreferences.screenPush(this));screen.setEnabled(on);
        allAction.setEnabled(on && loaded);allAction.setAlpha(on && loaded?1f:0.4f);allAction.setText(allSelected()?"全部关闭":"全部开启");rendering=false;updateCount();}
    private boolean allSelected(){if(all.isEmpty())return false;for(Entry e:all)if(!selected.contains(e.pkg))return false;return true;}
    private void persist(){RelayConfig.selectApps(this,selected);render();}
    private void updateCount(){if(count==null || !loaded)return;int visibleSelected=0;for(Entry e:all)if(selected.contains(e.pkg))visibleSelected++;
        count.setText("已开启 "+visibleSelected+" 个应用 · 更改自动保存"+(!NotificationPreferences.enabled(this)?"\n同步手机通知已关闭":
            RfcommWearTransport.getInstance(this).isAvailable()?"":"\n设备连接后同步设置"));}
    private void filter(){String query=search.getText().toString().trim().toLowerCase(Locale.ROOT);shown.clear();
        for(Entry e:all)if(query.isEmpty()||e.label.toLowerCase(Locale.ROOT).contains(query)||e.pkg.toLowerCase(Locale.ROOT).contains(query))shown.add(e);
        if(adapter!=null)adapter.notifyDataSetChanged();updateCount();}
    private void loadApps(){final Context app=getApplicationContext();final Set<String> initial=new HashSet<>(selected);
        loader=new Thread(()->{try{PackageManager pm=app.getPackageManager();List<Entry> found=new ArrayList<>();
            for(ApplicationInfo info:pm.getInstalledApplications(0)){
                if(cancelled || Thread.currentThread().isInterrupted())return;if(info.packageName.equals(app.getPackageName()))continue;
                boolean system=(info.flags&ApplicationInfo.FLAG_SYSTEM)!=0;
                if(!info.enabled && !initial.contains(info.packageName))continue;
                String name;try{name=String.valueOf(info.loadLabel(pm));}catch(RuntimeException ex){name=info.packageName;}
                found.add(new Entry(info.packageName,name,system && pm.getLaunchIntentForPackage(info.packageName)==null));
            }
            String sms=android.provider.Telephony.Sms.getDefaultSmsPackage(app);Collator collator=Collator.getInstance(Locale.SIMPLIFIED_CHINESE);
            found.sort((a,b)->{int ar=a.pkg.equals(sms)?0:initial.contains(a.pkg)?1:a.system?3:2;
                int br=b.pkg.equals(sms)?0:initial.contains(b.pkg)?1:b.system?3:2;int c=Integer.compare(ar,br);return c!=0?c:collator.compare(a.label,b.label);});
            if(cancelled)return;ui.post(()->{if(cancelled)return;all.addAll(found);loaded=true;filter();render();});
        }catch(RuntimeException failure){if(!cancelled)ui.post(()->{if(!cancelled)count.setText("应用列表读取失败，请返回后重试。");});}},"OAF-notification-apps");loader.start();}
    private void showHelp(){String state=ListenerRecovery.authorized(this)?RelayNotificationListenerService.bound?"通知使用权已授权，监听正常。":"通知使用权已授权，监听待恢复。":"尚未授予通知使用权。";
        new AlertDialog.Builder(this).setTitle("收不到通知？").setMessage(state+"\n\n请开启同步手机通知、选择要同步的应用，并在防断连设置中开启自动接管。官方应用运行时，独立版会等待接管。\n\n关闭亮屏推送后，仅在手机亮屏且已解锁时跳过新消息；锁屏亮着仍可推送，跳过的消息不补发。脱腕开关在独立连接后同步到手表。")
            .setPositiveButton("防断连设置",(d,w)->startActivity(new Intent(this,SettingsActivity.class).putExtra(SettingsActivity.EXTRA_SECTION,SettingsActivity.PROTECTION)))
            .setNeutralButton("通知使用权",(d,w)->startActivity(new Intent(android.provider.Settings.ACTION_NOTIFICATION_LISTENER_SETTINGS)))
            .setNegativeButton("关闭",null).show();}
    private final class Holder {
        final LinearLayout outer,row;final ImageView icon;final TextView name;final CompoundButton choice;final View line;
        Holder(){outer=vertical();row=new LinearLayout(NotificationsActivity.this);row.setGravity(Gravity.CENTER_VERTICAL);row.setPadding(dp(18),dp(8),dp(18),dp(8));
            icon=new ImageView(NotificationsActivity.this);row.addView(icon,new LinearLayout.LayoutParams(dp(36),dp(36)));
            name=label("",18,DeviceStyle.TEXT);name.setPadding(dp(18),0,dp(6),0);name.setMaxLines(2);name.setEllipsize(TextUtils.TruncateAt.END);row.addView(name,new LinearLayout.LayoutParams(0,-2,1));
            choice=toggle();row.addView(choice,new LinearLayout.LayoutParams(-2,dp(48)));outer.addView(row,new LinearLayout.LayoutParams(-1,dp(68)));
            line=new View(NotificationsActivity.this);line.setBackgroundColor(0xff424242);LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(-1,dp(1));lp.setMargins(dp(72),0,dp(18),0);outer.addView(line,lp);outer.setTag(this);
        }
    }
    private final class Apps extends BaseAdapter {
        public int getCount(){return shown.size();}public Object getItem(int position){return shown.get(position);}public long getItemId(int position){return position;}
        public View getView(int position,View convert,android.view.ViewGroup parent){Holder h=convert==null?new Holder():(Holder)convert.getTag();Entry e=shown.get(position);
            GradientDrawable bg=DeviceStyle.shape(CARD,0,NotificationsActivity.this);float top=position==0?dp(16):0,bottom=position==shown.size()-1?dp(16):0;
            bg.setCornerRadii(new float[]{top,top,top,top,bottom,bottom,bottom,bottom});h.outer.setBackground(bg);h.line.setVisibility(position==shown.size()-1?View.GONE:View.VISIBLE);
            h.name.setText(e.label);h.choice.setOnCheckedChangeListener(null);h.choice.setChecked(selected.contains(e.pkg));h.choice.jumpDrawablesToCurrentState();h.choice.setEnabled(NotificationPreferences.enabled(NotificationsActivity.this));
            h.choice.setContentDescription(e.label+"通知");h.choice.setOnCheckedChangeListener((v,on)->{if(on)selected.add(e.pkg);else selected.remove(e.pkg);persist();});
            h.row.setOnClickListener(v->{if(h.choice.isEnabled())h.choice.setChecked(!h.choice.isChecked());});bindIcon(h.icon,e.pkg);return h.outer;
        }
    }
    private void bindIcon(ImageView view,String pkg){view.setTag(pkg);Bitmap cached=icons.get(pkg);if(cached!=null){view.setImageBitmap(cached);return;}
        view.setImageDrawable(null);if(iconPending.contains(pkg))return;iconPending.add(pkg);final Context app=getApplicationContext();final int size=Math.min(dp(36),144);
        try{iconWorker.execute(()->{Bitmap result=null;try{Drawable d=app.getPackageManager().getApplicationIcon(pkg);
                result=Bitmap.createBitmap(size,size,Bitmap.Config.ARGB_8888);Canvas c=new Canvas(result);android.graphics.Path circle=new android.graphics.Path();circle.addCircle(size/2f,size/2f,size/2f,android.graphics.Path.Direction.CW);c.clipPath(circle);d.setBounds(0,0,size,size);d.draw(c);
            }catch(Exception ignored){}final Bitmap icon=result;if(cancelled)return;ui.post(()->{if(cancelled)return;iconPending.remove(pkg);
                if(icon!=null)icons.put(pkg,icon);ImageView target=list.findViewWithTag(pkg);if(target!=null){if(icon!=null)target.setImageBitmap(icon);else target.setImageResource(android.R.drawable.sym_def_app_icon);}
            });});}catch(RejectedExecutionException full){iconPending.remove(pkg);}
    }
}
