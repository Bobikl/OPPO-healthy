package com.example.opponotificationrelay;
import android.app.Activity;
import android.os.*;
import android.widget.*;
import org.json.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/** Explicit, bounded diagnostic. Reads the watch directly; never opens the official database. */
public final class HealthSyncProbeActivity extends Activity {
    private TextView output;private Button button;private volatile boolean cancelled;private boolean running;
    private final StringBuilder display=new StringBuilder();
    @Override protected void onCreate(Bundle state){super.onCreate(state);HealthSyncManager.get(this).interactive(true);LinearLayout root=new LinearLayout(this);root.setOrientation(1);root.setPadding(24,20,24,20);ScrollView scroll=new ScrollView(this);scroll.addView(root);DeviceStyle.shell(this,"手表健康同步测试",scroll);
        button=new Button(this);button.setText("读取最新健康记录");root.addView(button);output=new TextView(this);output.setTextColor(DeviceStyle.TEXT);output.setTextSize(15);root.addView(output);output.setText("直接从手表读取近两小时活动、心率、血氧和身心记录，以及近两天睡眠/身心汇总。测试结果保存在独立版私有目录。\n\n此页面用于验证同步能力，尚不是健康首页。");
        button.setOnClickListener(v->{if(running)return;running=true;button.setEnabled(false);display.setLength(0);new Thread(this::runProbe,"health-history-probe").start();});
    }
    @Override protected void onResume(){super.onResume();HealthSyncManager.get(this).interactive(true);}
    @Override protected void onPause(){HealthSyncManager.get(this).interactive(false);super.onPause();}
    @Override protected void onDestroy(){cancelled=true;super.onDestroy();}
    private void line(String message){runOnUiThread(()->{if(!isFinishing() && !isDestroyed()){display.append(message).append("\n\n");output.setText(display.toString());}});}
    private static String stamp(int seconds){return seconds==0?"未解析记录时间":new SimpleDateFormat("MM-dd HH:mm:ss",Locale.ROOT).format(new Date(seconds*1000L));}
    private byte[] read(RfcommWearTransport transport,String mac,HealthSyncProtocol.Request request)throws Exception{
        long until=SystemClock.elapsedRealtime()+25000;OafHealthChannel.Snapshot state=transport.healthSettings();
        if(!state.connected || state.busy)transport.requestHealthSettings();
        while(true){if(cancelled || !mac.equals(RelayConfig.getTargetMac(this)))throw new IOException("SYNC_CANCELLED");state=transport.healthSettings();if(state.connected&&!state.busy)break;if(SystemClock.elapsedRealtime()>=until)throw new IOException("SYNC_CONNECT_TIMEOUT");Thread.sleep(100);}
        long connection=transport.healthConnection();CountDownLatch done=new CountDownLatch(1);boolean[] ok={false};byte[][] response={null};
        if(!transport.readHealthHistory(request,(success,body,msg)->{ok[0]=success;response[0]=body;done.countDown();}))throw new IOException("SYNC_BUSY");
        if(!done.await(20,TimeUnit.SECONDS) || !ok[0] || connection!=transport.healthConnection() || !mac.equals(RelayConfig.getTargetMac(this)))throw new IOException("SYNC_RESPONSE_TIMEOUT");return response[0];
    }
    private static void save(File path,byte[] data)throws IOException{try(FileOutputStream out=new FileOutputStream(path)){out.write(data);out.getFD().sync();}}
    private void runProbe(){
        long began=SystemClock.elapsedRealtime();JSONArray results=new JSONArray();File dir=new File(getFilesDir(),"health-sync-probe/"+System.currentTimeMillis());
        try{if(!dir.mkdirs())throw new IOException("SYNC_STORAGE");RfcommWearTransport transport=RfcommWearTransport.getInstance(this);String mac=RelayConfig.getTargetMac(this);int end=(int)(System.currentTimeMillis()/1000);
            for(HealthSyncProtocol.Kind kind:HealthSyncProtocol.Kind.values()){
                if(cancelled)break;line(kind.title+"：正在请求…");JSONObject item=new JSONObject().put("kind",kind.name()).put("cid",kind.cid);results.put(item);JSONArray packets=new JSONArray();item.put("packets",packets);int start=end-kind.seconds,total=0,latest=0,last=-1;boolean complete=false;long one=SystemClock.elapsedRealtime();
                try{for(int page=0;page<12;page++){
                    if(cancelled)throw new IOException("SYNC_CANCELLED");HealthSyncProtocol.Request request=HealthSyncProtocol.range(kind,start,end);byte[] bytes=read(transport,mac,request);
                    save(new File(dir,kind.name()+"-"+page+".pb"),bytes);HealthSyncProtocol.Summary summary=HealthSyncProtocol.parse(request,bytes);
                    packets.put(new JSONObject().put("requestStart",start).put("requestEnd",end).put("bytes",bytes.length).put("start",summary.start).put("end",summary.end).put("count",summary.count).put("latest",summary.latest).put("value",summary.lastValue).put("more",summary.more));
                    total+=summary.count;if(summary.latest>=latest){latest=summary.latest;last=summary.lastValue;}
                    if(!summary.more){complete=true;break;}if(summary.end<=start || summary.end>=end)throw new IOException("SYNC_CURSOR_STALLED");start=summary.end;
                }item.put("complete",complete).put("count",total).put("latest",latest).put("lastValue",last);line(kind.title+"："+total+" 条；"+(latest==0?"时间见诊断记录":kind.daily()?"日期 "+new SimpleDateFormat("MM-dd",Locale.ROOT).format(new Date(latest*1000L)):"最新 "+stamp(latest))+(kind==HealthSyncProtocol.Kind.HEART&&last>=0?"，"+last+" 次/分":"")+(kind==HealthSyncProtocol.Kind.ACTIVITY_SUMMARY&&last>=0?"，"+last+" 步":"")+(kind==HealthSyncProtocol.Kind.OXYGEN&&last>=0?"，"+last+"%":"")+(complete?"":"（达到本次分页上限）"));
                }catch(Exception e){String code=e.getMessage();if(code==null || !code.matches("[A-Z_]{1,64}"))code="SYNC_READ_OR_PARSE_FAILED";item.put("error",code);line(kind.title+"："+code);}
                item.put("elapsedMs",SystemClock.elapsedRealtime()-one);
                save(new File(dir,"summary.json"),new JSONObject().put("source","watch-direct").put("startedAt",end).put("elapsedMs",SystemClock.elapsedRealtime()-began).put("results",results).toString(2).getBytes(StandardCharsets.UTF_8));
            }
            line("本次读取结束，用时 "+((SystemClock.elapsedRealtime()-began)/1000.0)+" 秒。诊断结果已保存在应用私有目录。");
        }catch(Exception e){line("测试未完成，请检查连接后重试。");}
        finally{runOnUiThread(()->{running=false;if(!isDestroyed())button.setEnabled(true);});}
    }
}
