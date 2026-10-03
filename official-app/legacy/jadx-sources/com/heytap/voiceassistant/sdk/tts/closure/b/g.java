package com.heytap.voiceassistant.sdk.tts.closure.b;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Process;
import com.heytap.voiceassistant.sdk.tts.SpeechException;
import com.heytap.voiceassistant.sdk.tts.audio.BufferParagraphInfo;
import com.heytap.voiceassistant.sdk.tts.monitor.Logger;

/* JADX INFO: loaded from: classes19.dex */
public class g extends Thread implements AudioManager.OnAudioFocusChangeListener {
    public int b;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8376e;
    public Context h;
    public boolean m;
    public final Object a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8375c = 0;
    public AudioTrack f = null;
    public e g = null;
    public a i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile int f8377j = 1;
    public volatile boolean k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f8378l = false;

    public interface a {
    }

    public g(Context context, int i, boolean z, int i2, boolean z2) {
        this.b = 3;
        this.d = 2;
        this.h = context;
        this.b = i;
        this.f8376e = z;
        this.d = i2;
        this.m = z2;
        setName("StreamPcmPlayer");
    }

    public final void a(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        if (this.f8376e && this.f8378l) {
            Logger.print("StreamPcmPlayer", "abandonAudioFocus: real abandon");
            if (audioFocusRequest != null) {
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
            this.f8378l = false;
        }
    }

    public final void b(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        if (!this.f8376e || this.f8378l) {
            return;
        }
        Logger.print("StreamPcmPlayer", "requestAudioFocus: real request");
        audioManager.requestAudioFocus(audioFocusRequest);
        this.f8378l = true;
    }

    public final void c() {
        AudioTrack audioTrack = this.f;
        if (audioTrack != null) {
            if (audioTrack.getPlayState() == 3) {
                this.f.stop();
            }
            this.f.release();
            this.f = null;
        }
        Logger.debug("StreamPcmPlayer", "mAudioTrack released");
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
        Logger.print("StreamPcmPlayer", "onAudioFocusChange=" + i);
        if (i != -2 && i != -1) {
            if (i == 1) {
                Logger.print("StreamPcmPlayer", "resume start");
                this.f8378l = true;
                return;
            }
            return;
        }
        StringBuilder sbA = com.heytap.voiceassistant.sdk.tts.closure.a.a.a("pause start mAudioFocusChange2Stop=");
        sbA.append(this.m);
        Logger.print("StreamPcmPlayer", sbA.toString());
        if (this.m && a()) {
            Logger.print("StreamPcmPlayer", "pause success");
            a aVar = this.i;
            if (aVar != null) {
                com.heytap.voiceassistant.sdk.tts.closure.f.c.a aVar2 = (com.heytap.voiceassistant.sdk.tts.closure.f.c.a) aVar;
                synchronized (com.heytap.voiceassistant.sdk.tts.closure.f.c.this.a) {
                    com.heytap.voiceassistant.sdk.tts.closure.c.g gVar = com.heytap.voiceassistant.sdk.tts.closure.f.c.this.m;
                    if (gVar != null) {
                        ((com.heytap.voiceassistant.sdk.tts.closure.c.f) gVar).c(1);
                    }
                }
            }
        }
        this.f8378l = false;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x01b7 A[PHI: r1 r3
  0x01b7: PHI (r1v4 android.media.AudioTrack) = (r1v3 android.media.AudioTrack), (r1v5 android.media.AudioTrack) binds: [B:118:0x01b5, B:98:0x0186] A[DONT_GENERATE, DONT_INLINE]
  0x01b7: PHI (r3v4 android.media.AudioFocusRequest) = (r3v3 android.media.AudioFocusRequest), (r3v10 android.media.AudioFocusRequest) binds: [B:118:0x01b5, B:98:0x0186] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:132:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws Throwable {
        AudioFocusRequest audioFocusRequestBuild;
        AudioTrack audioTrack;
        AudioTrack audioTrack2;
        AudioManager audioManager = (AudioManager) this.h.getSystemService("audio");
        try {
            try {
                Logger.debug("StreamPcmPlayer", "start player sRequestFocus=" + this.f8376e);
                Process.setThreadPriority(-19);
                if (this.f8376e) {
                    audioFocusRequestBuild = new AudioFocusRequest.Builder(4).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).setOnAudioFocusChangeListener(this).build();
                    try {
                        audioManager.requestAudioFocus(audioFocusRequestBuild);
                        this.f8378l = true;
                    } catch (Exception e2) {
                        e = e2;
                        Logger.error("StreamPcmPlayer", "", e);
                        com.heytap.voiceassistant.sdk.tts.closure.f.c.a(com.heytap.voiceassistant.sdk.tts.closure.f.c.this, new SpeechException(20011));
                        synchronized (this.a) {
                            this.f8377j = 5;
                        }
                        audioTrack2 = this.f;
                        if (audioTrack2 != null) {
                            audioTrack2.release();
                            this.f = null;
                        }
                    }
                } else {
                    audioFocusRequestBuild = null;
                }
                this.g.c();
                synchronized (this.a) {
                    if (this.f8377j != 5 && this.f8377j != 4) {
                        this.f8377j = 3;
                    }
                }
                while (this.f8377j != 5) {
                    b();
                    if (this.f8377j == 3 || this.f8377j == 2) {
                        e eVar = this.g;
                        if (eVar.k < eVar.f8371j || eVar.r < eVar.s) {
                            synchronized (this.a) {
                                if (this.f8377j == 2) {
                                    this.f8377j = 3;
                                    a aVar = this.i;
                                    if (aVar != null) {
                                        ((com.heytap.voiceassistant.sdk.tts.closure.f.c.a) aVar).a(0);
                                    }
                                }
                            }
                            if (this.k) {
                                b(audioManager, audioFocusRequestBuild);
                            }
                            this.g.b();
                            BufferParagraphInfo bufferParagraphInfoA = this.g.a((long) (((double) this.f.getPlaybackHeadPosition()) * 2.0d));
                            if (bufferParagraphInfoA != null) {
                                Logger.debug("StreamPcmPlayer", "onNextIndex: " + bufferParagraphInfoA.paraIndex + "text: " + bufferParagraphInfoA.text);
                                a aVar2 = this.i;
                                if (aVar2 != null) {
                                    ((com.heytap.voiceassistant.sdk.tts.closure.f.c.a) aVar2).a(bufferParagraphInfoA);
                                }
                            }
                            this.g.a();
                            if (this.f.getPlayState() != 3) {
                                this.f.play();
                            }
                            this.g.a(this.f, this.f8375c);
                        } else if (this.g.d()) {
                            Logger.debug("StreamPcmPlayer", "play stopped");
                            synchronized (this.a) {
                                this.f8377j = 5;
                                a aVar3 = this.i;
                                if (aVar3 != null) {
                                    com.heytap.voiceassistant.sdk.tts.closure.f.c.a(com.heytap.voiceassistant.sdk.tts.closure.f.c.this, (SpeechException) null);
                                }
                            }
                        } else {
                            synchronized (this.a) {
                                if (this.f8377j == 3) {
                                    Logger.debug("StreamPcmPlayer", "play onPaused!");
                                    this.f8377j = 2;
                                }
                            }
                            Thread.sleep(50L);
                        }
                    } else if (this.f8377j == 4) {
                        if (this.f.getPlayState() != 2) {
                            this.f.pause();
                        }
                        if (!this.k) {
                            a(audioManager, audioFocusRequestBuild);
                        }
                        Thread.sleep(50L);
                    }
                }
                AudioTrack audioTrack3 = this.f;
                if (audioTrack3 != null) {
                    try {
                        audioTrack3.stop();
                    } catch (Exception e3) {
                        Logger.error("StreamPcmPlayer", "", e3);
                    }
                }
                synchronized (this.a) {
                    this.f8377j = 5;
                }
                audioTrack2 = this.f;
                if (audioTrack2 != null) {
                    audioTrack2.release();
                    this.f = null;
                }
            } catch (Throwable th) {
                th = th;
                synchronized (this.a) {
                    this.f8377j = 5;
                }
                audioTrack = this.f;
                if (audioTrack != null) {
                    audioTrack.release();
                    this.f = null;
                }
                a(audioManager, null);
                Logger.debug("StreamPcmPlayer", "play finally");
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            audioFocusRequestBuild = null;
        } catch (Throwable th2) {
            th = th2;
            synchronized (this.a) {
                this.f8377j = 5;
                audioTrack = this.f;
                if (audioTrack != null) {
                    audioTrack.release();
                    this.f = null;
                }
                a(audioManager, null);
                Logger.debug("StreamPcmPlayer", "play finally");
                throw th;
            }
        }
        a(audioManager, audioFocusRequestBuild);
        Logger.debug("StreamPcmPlayer", "play finally");
    }

    public boolean a() {
        synchronized (this.a) {
            Logger.debug("StreamPcmPlayer", "pause mPlayState= " + f.a(this.f8377j));
            if (this.f8377j != 5 && this.f8377j != 4) {
                this.f8377j = 4;
                this.k = false;
                return true;
            }
            return false;
        }
    }

    public final void b() throws Exception {
        AudioTrack audioTrack = this.f;
        if (audioTrack == null || audioTrack.getStreamType() != this.b) {
            Logger.debug("StreamPcmPlayer", "prepareAudioPlayer || AudioTrack stream type is change.");
            Logger.debug("StreamPcmPlayer", "createAudio begin");
            if (this.f != null) {
                c();
            }
            int i = this.g.f8370e;
            int minBufferSize = AudioTrack.getMinBufferSize(i, 4, 2);
            this.f8375c = minBufferSize;
            if (minBufferSize == -2 || minBufferSize == -1) {
                StringBuilder sbA = com.heytap.voiceassistant.sdk.tts.closure.a.a.a("mBufferSize = ");
                sbA.append(this.f8375c);
                Logger.error("StreamPcmPlayer", sbA.toString());
                StringBuilder sbA2 = com.heytap.voiceassistant.sdk.tts.closure.a.a.a("createAudio BufferSize = ");
                sbA2.append(this.f8375c);
                sbA2.append(" is not available");
                throw new Exception(sbA2.toString());
            }
            StringBuilder sbA3 = com.heytap.voiceassistant.sdk.tts.closure.a.a.a("createAudio || mStreamType = ");
            sbA3.append(this.b);
            sbA3.append(", sampleRate = ");
            sbA3.append(i);
            sbA3.append(", mBufferSize = ");
            sbA3.append(this.f8375c);
            Logger.debug("StreamPcmPlayer", sbA3.toString());
            AudioTrack audioTrack2 = new AudioTrack(com.heytap.voiceassistant.sdk.tts.closure.b.a.a(this.b), new AudioFormat.Builder().setChannelMask(4).setEncoding(2).setSampleRate(i).build(), this.f8375c * 2, 1, 0);
            this.f = audioTrack2;
            if (1 != audioTrack2.getState()) {
                StringBuilder sbA4 = com.heytap.voiceassistant.sdk.tts.closure.a.a.a("AudioTrack state = ");
                sbA4.append(this.f.getState());
                sbA4.append(", retry");
                Logger.print("StreamPcmPlayer", sbA4.toString());
                c();
                AudioTrack audioTrack3 = new AudioTrack(com.heytap.voiceassistant.sdk.tts.closure.b.a.a(this.b), new AudioFormat.Builder().setChannelMask(4).setEncoding(2).setSampleRate(i).build(), this.f8375c, 1, 0);
                this.f = audioTrack3;
                if (1 != audioTrack3.getState()) {
                    StringBuilder sbA5 = com.heytap.voiceassistant.sdk.tts.closure.a.a.a("AudioTrack state = ");
                    sbA5.append(this.f.getState());
                    Logger.error("StreamPcmPlayer", sbA5.toString());
                    StringBuilder sbA6 = com.heytap.voiceassistant.sdk.tts.closure.a.a.a("createAudio AudioTrack state = ");
                    sbA6.append(this.f.getState());
                    sbA6.append(" is not valid");
                    throw new Exception(sbA6.toString());
                }
            }
            Logger.debug("StreamPcmPlayer", "createAudio end");
        }
    }
}
