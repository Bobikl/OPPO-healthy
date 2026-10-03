package com.example.opponotificationrelay;
import android.os.Handler;
import android.os.Looper;

/** Foreground-only refresh. It never opens, stops or restarts a watch connection. */
public final class DeviceController {
    public interface View { void render(DeviceUiState state); }
    private final DeviceRepository repository;
    private final View view;
    private final Handler handler=new Handler(Looper.getMainLooper());
    private boolean active;
    private final Runnable refresh=new Runnable() {
        @Override public void run() {
            if(!active)return;
            view.render(repository.snapshot());
            if(active)handler.postDelayed(this,2000);
        }
    };
    public DeviceController(DeviceRepository repository,View view) {this.repository=repository;this.view=view;}
    public void start() {stop();active=true;repository.onVisible();refresh.run();}
    public void stop() {active=false;handler.removeCallbacksAndMessages(null);}
}
