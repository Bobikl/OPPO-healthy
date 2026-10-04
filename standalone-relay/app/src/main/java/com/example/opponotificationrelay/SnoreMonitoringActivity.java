package com.example.opponotificationrelay;
import android.Manifest;import android.app.*;import android.content.*;import android.content.pm.PackageManager;import android.media.MediaPlayer;import android.os.*;import android.view.*;import android.widget.*;
import java.io.File;import java.text.SimpleDateFormat;import java.util.*;import java.util.concurrent.*;
/** Explicit local recording controls. Imported risk results stay on their existing page. */
public final class SnoreMonitoringActivity extends Activity {
    private final Handler handler=new Handler(Looper.getMainLooper());private final ExecutorService worker=Executors.newSingleThreadExecutor();
    private boolean analyzing;private TextView analysis;private LinearLayout rows;private Button action;private TextView state;private volatile boolean destroyed;private volatile boolean resumed;private boolean loading,pendingPermission,startAfterPermission;private MediaPlayer player;private String playing="",fingerprint="";
    private final Runnable refresh=new Runnable(){public void run(){reload();}};
    @Override public void onCreate(Bundle saved){super.onCreate(saved);LinearLayout root=new LinearLayout(this);root.setOrientation(1);root.setPadding(DeviceStyle.dp(this,18),0,DeviceStyle.dp(this,18),0);
        TextView intro=new TextView(this);intro.setText("睡前开启录音，起床后结束。录音和鼾声特征保存在本机，可回放或删除。至少录制 1 小时，最长 10 小时；呼吸暂停分析还需完整的睡眠与手表数据。");intro.setTextSize(15);root.addView(intro);
        state=new TextView(this);root.addView(state);action=new Button(this);root.addView(action);action.setOnClickListener(v->{if(SnoreRecordingService.isRunning()){action.setEnabled(false);SnoreRecordingService.stop(this);reload();}else explainStart();});
        Button refreshButton=new Button(this);refreshButton.setText("刷新记录");refreshButton.setOnClickListener(v->reload());root.addView(refreshButton);
        Button watch=new Button(this);watch.setText("读取手表监测资料");root.addView(watch);watch.setOnClickListener(v->syncWatch(watch));
        Button analyze=new Button(this);analyze.setText("同步并分析最近一晚");root.addView(analyze);analysis=new TextView(this);analysis.setText(OsaLocalAnalysis.last(this));root.addView(analysis);analyze.setOnClickListener(v->analyze(analyze));
        rows=new LinearLayout(this);rows.setOrientation(1);root.addView(rows);ScrollView scroll=new ScrollView(this);scroll.addView(root);DeviceStyle.shell(this,"睡眠呼吸监测",scroll);DeviceStyle.styleTree(root);updateAction();if(saved==null&&getIntent().getBooleanExtra("start_recording",false)){getIntent().removeExtra("start_recording");handler.post(()->{if(resumed&&!destroyed&&!SnoreRecordingService.isRunning())explainStart();});}
    }
    @Override public void onResume(){super.onResume();resumed=true;HealthSyncManager.get(this).interactive(true);if(startAfterPermission){startAfterPermission=false;begin();}reload();}
    @Override public void onPause(){resumed=false;HealthSyncManager.get(this).interactive(false);handler.removeCallbacks(refresh);stopPlayback();super.onPause();}
    @Override public void onDestroy(){destroyed=true;handler.removeCallbacksAndMessages(null);stopPlayback();worker.shutdown();super.onDestroy();}
    private void updateAction(){boolean active=SnoreRecordingService.isRunning();action.setText(active?"结束录音并保存":"开始睡眠录音");action.setEnabled(!analyzing);state.setText(active?"录音进行中，可熄屏。结束后保存音频和分析资料。":SnoreRecordingService.lastError().isEmpty()?"尚未开始录音":SnoreRecordingService.lastError());}
    private void explainStart(){new AlertDialog.Builder(this).setTitle("开始睡眠录音").setMessage("手机将持续使用麦克风，录音期间显示通知。请将手机放在床边，保持充电并预留存储空间。录音只保存在本机。\n\n短录音不会生成呼吸暂停结果。").setNegativeButton("取消",null).setPositiveButton("开始",(d,w)->permissionOrStart()).show();}
    private void permissionOrStart(){if(!resumed)return;stopPlayback();if(checkSelfPermission(Manifest.permission.RECORD_AUDIO)!=PackageManager.PERMISSION_GRANTED){pendingPermission=true;requestPermissions(new String[]{Manifest.permission.RECORD_AUDIO},158);return;}begin();}
    private void begin(){if(!resumed||destroyed||analyzing)return;try{SnoreRecordingService.start(this);state.setText("正在开始录音…");action.setEnabled(false);handler.postDelayed(refresh,500);}catch(RuntimeException e){state.setText("无法开始录音，请检查麦克风权限后重试");}}
    @Override public void onRequestPermissionsResult(int request,String[] permissions,int[] grants){super.onRequestPermissionsResult(request,permissions,grants);if(request==158&&pendingPermission){pendingPermission=false;if(grants.length>0&&grants[0]==PackageManager.PERMISSION_GRANTED){if(resumed)begin();else startAfterPermission=true;}else state.setText("未获得麦克风权限，尚未开始录音");}}
    private static String label(SnoreSessionStore.Session s){switch(s.state){case "PREPARING":return "正在准备";case "RECORDING":return "录音中";case "FINALIZING":return "正在保存";case "WAITING_DATA":return "录音已保存，等待完整睡眠数据";case "TOO_SHORT":return "录音时长不足，未生成监测结果";case "INTERRUPTED":return "录音已中断";default:return "录音未完成";}}
    private void reload(){handler.removeCallbacks(refresh);if(destroyed||!resumed||loading)return;loading=true;
        worker.execute(()->{List<SnoreSessionStore.Session> list=Collections.emptyList();String error="";try(SnoreSessionStore store=new SnoreSessionStore(this)){SnoreRecordingService.recoverIfIdle(store);list=store.list();}catch(Exception e){error="记录读取失败，请重试";}
            List<SnoreSessionStore.Session> result=list;String message=error;handler.post(()->{loading=false;if(destroyed||!resumed)return;updateAction();if(!message.isEmpty())state.setText(message);render(result);if(SnoreRecordingService.isRunning())handler.postDelayed(refresh,2000);});
        });
    }
    private void render(List<SnoreSessionStore.Session> list){StringBuilder signature=new StringBuilder(playing).append(SnoreRecordingService.isRunning());for(SnoreSessionStore.Session s:list)signature.append(s.id).append(s.state).append(s.samples);if(signature.toString().equals(fingerprint))return;fingerprint=signature.toString();rows.removeAllViews();
        TextView title=new TextView(this);title.setText("录音记录");title.setTextSize(19);rows.addView(title);
        if(list.isEmpty()){TextView empty=new TextView(this);empty.setText("暂无录音");rows.addView(empty);}
        for(SnoreSessionStore.Session s:list){LinearLayout card=new LinearLayout(this);card.setOrientation(1);int pad=DeviceStyle.dp(this,14);card.setPadding(pad,pad,pad,pad);card.setBackground(DeviceStyle.shape(DeviceStyle.CARD,14,this));LinearLayout.LayoutParams lp=new LinearLayout.LayoutParams(-1,-2);lp.topMargin=DeviceStyle.dp(this,12);rows.addView(card,lp);
            TextView time=new TextView(this);time.setText(new SimpleDateFormat("MM月dd日 HH:mm",Locale.CHINA).format(new Date(s.started))+" · "+String.format(Locale.CHINA,"%.1f 分钟",s.samples/480000.0));card.addView(time);
            TextView detail=new TextView(this);detail.setText(label(s));card.addView(detail);
            LinearLayout buttons=new LinearLayout(this);Button play=new Button(this);play.setText(s.id.equals(playing)?"停止播放":"回放录音");play.setEnabled(!s.active()&&s.samples>0&&!SnoreRecordingService.isRunning());play.setOnClickListener(v->play(s.id));buttons.addView(play,new LinearLayout.LayoutParams(0,-2,1));
            Button delete=new Button(this);delete.setText("删除");delete.setEnabled(!s.active());delete.setOnClickListener(v->new AlertDialog.Builder(this).setTitle("删除这次录音？").setMessage("音频和这次录音的分析资料将一并删除。").setNegativeButton("取消",null).setPositiveButton("删除",(d,w)->delete(s.id)).show());buttons.addView(delete,new LinearLayout.LayoutParams(0,-2,1));card.addView(buttons);
        }DeviceStyle.styleTree(rows);
    }
    private void analyze(Button button){if(analyzing)return;if(SnoreRecordingService.isRunning()){analysis.setText("请先结束录音，再开始分析。");return;}analyzing=true;button.setEnabled(false);action.setEnabled(false);analysis.setText("正在同步整晚资料并分析…");worker.execute(()->{String message;try{message=OsaLocalAnalysis.run(this,()->destroyed||!resumed);}catch(Exception e){message=OsaLocalAnalysis.error(e);String code=e.getMessage();FileLogger.w("OsaAnalysis",code!=null&&code.matches("[A-Z_0-9]{1,80}")?code:"FAILED");}String value=message;handler.post(()->{analyzing=false;if(destroyed)return;button.setEnabled(true);updateAction();analysis.setText(value);});});}
    private void syncWatch(Button button){button.setEnabled(false);state.setText("正在读取手表近一天的监测资料…");worker.execute(()->{
        String message;try{OsaWatchSync.Result result=OsaWatchSync.sync(this,()->destroyed||!resumed);message=(result.active?"手表监测已激活":"手表监测尚未激活")+"；传感器记录 "+result.sensor+" 条，HRV 记录 "+result.hrv+" 条。"+(result.hrvError.isEmpty()?"":"HRV 资料暂未读取完整。");}catch(Exception e){message="暂未完成读取，请确认手表连接后重试";}String value=message;handler.post(()->{if(destroyed)return;button.setEnabled(true);state.setText(value);});
    });}
    private void play(String id){if(id.equals(playing)){stopPlayback();fingerprint="";reload();return;}stopPlayback();try(SnoreSessionStore store=new SnoreSessionStore(this)){
        File file=store.file(id,false);MediaPlayer next=new MediaPlayer();player=next;playing=id;next.setDataSource(file.getAbsolutePath());next.setOnPreparedListener(p->{if(resumed&&player==p&&!SnoreRecordingService.isRunning())p.start();else stopPlayback();});next.setOnCompletionListener(p->{stopPlayback();reload();});next.setOnErrorListener((p,a,b)->{stopPlayback();state.setText("这段录音暂时无法播放");return true;});next.prepareAsync();fingerprint="";reload();
    }catch(Exception e){stopPlayback();state.setText("这段录音暂时无法播放");}}
    private void stopPlayback(){MediaPlayer old=player;player=null;playing="";if(old!=null)old.release();}
    private void delete(String id){if(id.equals(playing))stopPlayback();worker.execute(()->{boolean ok=false;try(SnoreSessionStore store=new SnoreSessionStore(this)){ok=store.delete(id);}catch(Exception ignored){}boolean done=ok;handler.post(()->{if(destroyed)return;if(!done)state.setText("删除未完成，请重试");fingerprint="";reload();});});}
}
