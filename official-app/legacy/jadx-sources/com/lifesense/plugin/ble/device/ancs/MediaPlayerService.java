package com.lifesense.plugin.ble.device.ancs;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.heytap.sports.service.BgConnect;
import com.lifesense.plugin.ble.data.other.MediaFiles;
import com.lifesense.plugin.ble.data.other.PlaybackStatus;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class MediaPlayerService extends Service implements AudioManager.OnAudioFocusChangeListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener {
    public static final String ACTION_NEXT = "com.valdioveliu.valdio.audioplayer.ACTION_NEXT";
    public static final String ACTION_PAUSE = "com.valdioveliu.valdio.audioplayer.ACTION_PAUSE";
    public static final String ACTION_PLAY = "com.valdioveliu.valdio.audioplayer.ACTION_PLAY";
    public static final String ACTION_PREVIOUS = "com.valdioveliu.valdio.audioplayer.ACTION_PREVIOUS";
    public static final String ACTION_STOP = "com.valdioveliu.valdio.audioplayer.ACTION_STOP";
    private static final int NOTIFICATION_ID = 101;
    private static final String TAG = "MPS";
    private static MediaFiles activeAudio = null;
    private static int audioIndex = -1;
    private static ArrayList audioList;
    private AudioManager audioManager;
    private PlaybackStatus mPlayerStatus;
    private MediaPlayer mediaPlayer;
    private PhoneStateListener phoneStateListener;
    private boolean playPermission;
    private int resumePosition;
    private TelephonyManager telephonyManager;
    private final IBinder iBinder = new k(this);
    private boolean ongoingCall = false;
    private BroadcastReceiver becomingNoisyReceiver = new h(this);
    private BroadcastReceiver playNewAudio = new j(this);

    private void callStateListener() {
        this.telephonyManager = (TelephonyManager) getSystemService("phone");
        i iVar = new i(this);
        this.phoneStateListener = iVar;
        this.telephonyManager.listen(iVar, 32);
    }

    public static boolean initLocalAudiofiles(ArrayList arrayList) {
        logMessage("init local audio files >>" + arrayList);
        audioList = arrayList;
        audioIndex = 0;
        return true;
    }

    private void initMediaPlayer() {
        MediaFiles mediaFiles = activeAudio;
        if (mediaFiles == null || mediaFiles.getFilePath() == null) {
            return;
        }
        logMessage("init media player.....");
        if (this.mediaPlayer == null) {
            this.mediaPlayer = new MediaPlayer();
        }
        this.mediaPlayer.setOnCompletionListener(this);
        this.mediaPlayer.setOnErrorListener(this);
        this.mediaPlayer.setOnPreparedListener(this);
        this.mediaPlayer.setOnBufferingUpdateListener(this);
        this.mediaPlayer.setOnSeekCompleteListener(this);
        this.mediaPlayer.setOnInfoListener(this);
        this.mediaPlayer.reset();
        this.mediaPlayer.setAudioStreamType(3);
        try {
            this.mediaPlayer.setDataSource(activeAudio.getFilePath());
        } catch (IOException e2) {
            e2.printStackTrace();
            this.mPlayerStatus = PlaybackStatus.Unknown;
            stopSelf();
        }
        this.mediaPlayer.prepareAsync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logMessage(String str) {
        com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Player_Service, true, str, null);
    }

    private PendingIntent playbackAction(int i) {
        String str;
        Intent intent = new Intent(this, (Class<?>) MediaPlayerService.class);
        if (i == 0) {
            str = ACTION_PLAY;
        } else if (i == 1) {
            str = ACTION_PAUSE;
        } else if (i == 2) {
            str = ACTION_NEXT;
        } else {
            if (i != 3) {
                return null;
            }
            str = ACTION_PREVIOUS;
        }
        intent.setAction(str);
        PushAutoTrackHelper.hookIntentGetService(this, i, intent, 0);
        PendingIntent service = PendingIntent.getService(this, i, intent, 0);
        PushAutoTrackHelper.hookPendingIntentGetService(service, this, i, intent, 0);
        return service;
    }

    private void registerBecomingNoisyReceiver() {
        registerReceiver(this.becomingNoisyReceiver, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }

    private void register_playNewAudio() {
    }

    private boolean removeAudioFocus() {
        logMessage("remove audio focus.....");
        return 1 == this.audioManager.abandonAudioFocus(this);
    }

    private void removeNotification() {
        ((NotificationManager) getSystemService(BgConnect.KEY_NOTIFICATION)).cancel(101);
    }

    private boolean requestAudioFocus() {
        logMessage("request audio focus.....");
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        this.audioManager = audioManager;
        return audioManager.requestAudioFocus(this, 3, 1) == 1;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
        MediaPlayer mediaPlayer;
        float f;
        logMessage("MediaPlayer callback >> onAudioFocusChange....;status=" + i + "; playPermission=" + this.playPermission);
        if (this.playPermission) {
            if (i != -3) {
                if (i == -2) {
                    if (this.mediaPlayer.isPlaying()) {
                        this.mediaPlayer.pause();
                        return;
                    }
                    return;
                } else {
                    if (i == -1) {
                        if (this.mediaPlayer.isPlaying()) {
                            this.mediaPlayer.stop();
                        }
                        this.mediaPlayer.release();
                        this.mediaPlayer = null;
                        return;
                    }
                    if (i != 1) {
                        return;
                    }
                    MediaPlayer mediaPlayer2 = this.mediaPlayer;
                    if (mediaPlayer2 == null) {
                        initMediaPlayer();
                    } else if (!mediaPlayer2.isPlaying()) {
                        this.mediaPlayer.start();
                    }
                    mediaPlayer = this.mediaPlayer;
                    f = 1.0f;
                }
            } else {
                if (!this.mediaPlayer.isPlaying()) {
                    return;
                }
                mediaPlayer = this.mediaPlayer;
                f = 0.1f;
            }
            mediaPlayer.setVolume(f, f);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.iBinder;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        logMessage("MediaPlayer callback >> onBufferingUpdate....");
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        logMessage("MediaPlayer callback >> onCompletion....");
        skipToNext();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        logMessage("lifecycle onCreate...........");
        this.mPlayerStatus = PlaybackStatus.Unknown;
        callStateListener();
        registerBecomingNoisyReceiver();
        register_playNewAudio();
    }

    @Override // android.app.Service
    public void onDestroy() {
        logMessage("lifecycle onDestroy......");
        this.mPlayerStatus = PlaybackStatus.Unknown;
        this.playPermission = false;
        super.onDestroy();
        try {
            if (this.mediaPlayer != null) {
                stopMedia();
                this.mediaPlayer.release();
            }
            removeAudioFocus();
            PhoneStateListener phoneStateListener = this.phoneStateListener;
            if (phoneStateListener != null) {
                this.telephonyManager.listen(phoneStateListener, 0);
            }
            removeNotification();
            unregisterReceiver(this.becomingNoisyReceiver);
            unregisterReceiver(this.playNewAudio);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        logMessage("MediaPlayer callback >> onError....,what=" + i + "; extra=" + i2);
        return false;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        logMessage("MediaPlayer callback >> onInfo....,what=" + i + "; extra=" + i2);
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        logMessage("MediaPlayer callback >> onPrepared...." + this.playPermission);
        if (!this.playPermission || this.mediaPlayer.isPlaying()) {
            return;
        }
        this.mediaPlayer.start();
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(MediaPlayer mediaPlayer) {
        logMessage("MediaPlayer callback >> onSeekComplete....");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        PushAutoTrackHelper.onServiceStartCommand(this, intent, i, i2);
        logMessage("lifecycle onStartCommand,intent=" + intent);
        try {
            int i3 = audioIndex;
            if (i3 == -1 || i3 >= audioList.size()) {
                logMessage("stopSelf,no audio files...");
                this.mPlayerStatus = PlaybackStatus.Unknown;
                stopSelf();
            } else {
                activeAudio = (MediaFiles) audioList.get(audioIndex);
            }
        } catch (NullPointerException unused) {
            logMessage("stopSelf,null pointer exception...");
            this.mPlayerStatus = PlaybackStatus.Unknown;
            stopSelf();
        }
        boolean zRequestAudioFocus = requestAudioFocus();
        logMessage("try to request audio focus,status=" + zRequestAudioFocus);
        if (!zRequestAudioFocus) {
            logMessage("stopSelf,failed to get focus...");
            this.mPlayerStatus = PlaybackStatus.Unknown;
            stopSelf();
        }
        if (this.mPlayerStatus == PlaybackStatus.Unknown) {
            this.mPlayerStatus = PlaybackStatus.PLAYING;
            initMediaPlayer();
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        logMessage("lifecycle onUnbind:" + intent.toString());
        removeNotification();
        return super.onUnbind(intent);
    }

    public void pauseMedia() {
        if (this.mediaPlayer == null) {
            return;
        }
        logMessage("pauseMedia:" + this.mediaPlayer.isPlaying());
        if (this.mediaPlayer.isPlaying()) {
            this.mediaPlayer.pause();
            this.resumePosition = this.mediaPlayer.getCurrentPosition();
        }
    }

    public void playMedia() {
        if (this.mediaPlayer == null) {
            return;
        }
        logMessage("playMedia:" + this.mediaPlayer.isPlaying() + "; permission=" + this.playPermission);
        this.playPermission = true;
    }

    public void resumeMedia() {
        if (this.mediaPlayer == null) {
            return;
        }
        logMessage("resumeMedia:" + this.mediaPlayer.isPlaying());
        if (this.mediaPlayer.isPlaying()) {
            return;
        }
        this.mediaPlayer.seekTo(this.resumePosition);
        this.mediaPlayer.start();
    }

    public void skipToNext() {
        Object obj;
        if (audioList == null) {
            return;
        }
        logMessage("skipToNext,activeIndex=" + audioIndex + "; size=" + audioList.size());
        if (audioIndex == audioList.size() - 1) {
            audioIndex = 0;
            obj = audioList.get(0);
        } else {
            ArrayList arrayList = audioList;
            int i = audioIndex + 1;
            audioIndex = i;
            obj = arrayList.get(i);
        }
        activeAudio = (MediaFiles) obj;
        stopMedia();
        this.mediaPlayer.reset();
        initMediaPlayer();
    }

    public void skipToPrevious() {
        ArrayList arrayList;
        int size;
        if (audioList == null) {
            return;
        }
        logMessage("skipToPrevious,activeIndex=" + audioIndex + "; size=" + audioList.size());
        int i = audioIndex;
        if (i == 0) {
            size = audioList.size() - 1;
            audioIndex = size;
            arrayList = audioList;
        } else {
            arrayList = audioList;
            size = i - 1;
            audioIndex = size;
        }
        activeAudio = (MediaFiles) arrayList.get(size);
        stopMedia();
        this.mediaPlayer.reset();
        initMediaPlayer();
    }

    public void stopMedia() {
        if (this.mediaPlayer == null) {
            return;
        }
        logMessage("stopMedia:" + this.mediaPlayer.isPlaying());
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.mediaPlayer.stop();
        }
    }
}
