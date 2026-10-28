package com.example.opponotificationrelay;
import android.content.*;
import android.net.*;
import android.os.*;
import java.util.*;
/** Observes connection edges without treating an already satisfied condition as a new event. */
final class CloudSyncTriggers {
    private static volatile CloudSyncTriggers active;
    private final Context context;private final String mode;
    private BroadcastReceiver power;private ConnectivityManager.NetworkCallback wifi;
    private final Set<Network> networks=new HashSet<>();private boolean plugged;
    private CloudSyncTriggers(Context c,String mode){context=c;this.mode=mode;}
    static synchronized void refresh(Context c,boolean reset){
        String mode=CloudSyncState.mode(c);
        boolean needed=CloudSyncScheduler.ready(c)&&("charging".equals(mode)||"wifi".equals(mode));
        if(active!=null&&(!needed||reset||!active.mode.equals(mode))){active.stop();active=null;}
        if(needed&&active==null){active=new CloudSyncTriggers(c,mode);active.start();}
    }
    private boolean current(){return active==this;}
    private void start(){
        try{
            if("charging".equals(mode)){
                Intent battery=context.registerReceiver(null,new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
                plugged=battery!=null&&battery.getIntExtra(BatteryManager.EXTRA_PLUGGED,0)!=0;
                power=new BroadcastReceiver(){public void onReceive(Context c,Intent i){
                    if(!current()||i==null)return;
                    boolean next=Intent.ACTION_POWER_CONNECTED.equals(i.getAction());
                    boolean connected=!plugged&&next;plugged=next;
                    if(connected)CloudSyncScheduler.connection(context,"charging");
                }};
                IntentFilter filter=new IntentFilter(Intent.ACTION_POWER_CONNECTED);filter.addAction(Intent.ACTION_POWER_DISCONNECTED);
                if(Build.VERSION.SDK_INT>=33)context.registerReceiver(power,filter,Context.RECEIVER_NOT_EXPORTED);
                else context.registerReceiver(power,filter);
            }else{
                ConnectivityManager manager=context.getSystemService(ConnectivityManager.class);if(manager==null)return;
                for(Network network:manager.getAllNetworks()){
                    NetworkCapabilities caps=manager.getNetworkCapabilities(network);
                    if(caps!=null&&caps.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)&&caps.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET))networks.add(network);
                }
                wifi=new ConnectivityManager.NetworkCallback(){
                    public void onAvailable(Network network){if(current()&&networks.add(network))CloudSyncScheduler.connection(context,"wifi");}
                    public void onLost(Network network){if(current())networks.remove(network);}
                };
                manager.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(NetworkCapabilities.TRANSPORT_WIFI).addCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET).build(),wifi,new Handler(Looper.getMainLooper()));
            }
        }catch(RuntimeException failure){android.util.Log.w("HealthCloud","Connection observer failed",failure);CloudSyncState.prefs(context).edit().putString("schedulerError","系统未能监听同步条件，请重新选择同步模式").apply();}
    }
    private void stop(){
        if(power!=null)try{context.unregisterReceiver(power);}catch(RuntimeException ignored){}
        if(wifi!=null)try{context.getSystemService(ConnectivityManager.class).unregisterNetworkCallback(wifi);}catch(RuntimeException ignored){}
    }
}
