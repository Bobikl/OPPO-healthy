package com.heytap.voiceassistant.sdk.tts.closure.b;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Process;
import com.heytap.voiceassistant.sdk.tts.SpeechException;
import com.heytap.voiceassistant.sdk.tts.monitor.Logger;

/* JADX INFO: loaded from: classes19.dex */
public class d extends Thread implements AudioManager.OnAudioFocusChangeListener {
    public int b;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8366e;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f8367j;
    public boolean m;
    public final Object a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8365c = 0;
    public boolean f = false;
    public AudioTrack g = null;
    public b h = null;
    public a k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile int f8368l = 1;

    public interface a {
    }

    public d(Context context, int i, boolean z, int i2, boolean z2, boolean z3) {
        this.b = 3;
        this.d = 2;
        this.f8367j = context;
        this.b = i;
        this.f8366e = z;
        this.d = i2;
        this.m = z2;
        this.i = z3;
        setName("PcmPlayer");
    }

    public boolean a() {
        synchronized (this.a) {
            Logger.debug("PcmPlayer", "pause mPlayState= " + c.a(this.f8368l));
            if (this.f8368l != 5 && this.f8368l != 4) {
                this.f8368l = 4;
                return true;
            }
            return false;
        }
    }

    public final void b() throws Exception {
        AudioTrack audioTrack = this.g;
        if (audioTrack == null || audioTrack.getStreamType() != this.b) {
            Logger.debug("PcmPlayer", "prepareAudioPlayer || AudioTrack stream type is change.");
            Logger.debug("PcmPlayer", "createAudio begin");
            if (this.g != null) {
                c();
            }
            int i = this.h.f8360e;
            int minBufferSize = AudioTrack.getMinBufferSize(i, 4, 2);
            this.f8365c = minBufferSize;
            if (minBufferSize == -2 || minBufferSize == -1) {
                StringBuilder sbA = com.heytap.voiceassistant.sdk.tts.closure.a.a.a("mBufferSize = ");
                sbA.append(this.f8365c);
                Logger.error("PcmPlayer", sbA.toString());
                StringBuilder sbA2 = com.heytap.voiceassistant.sdk.tts.closure.a.a.a("createAudio BufferSize = ");
                sbA2.append(this.f8365c);
                sbA2.append(" is not available");
                throw new Exception(sbA2.toString());
            }
            StringBuilder sbA3 = com.heytap.voiceassistant.sdk.tts.closure.a.a.a("createAudio || mStreamType = ");
            sbA3.append(this.b);
            sbA3.append(", sampleRate = ");
            sbA3.append(i);
            sbA3.append(", mBufferSize = ");
            sbA3.append(this.f8365c);
            Logger.debug("PcmPlayer", sbA3.toString());
            AudioTrack audioTrack2 = new AudioTrack(com.heytap.voiceassistant.sdk.tts.closure.b.a.a(this.b), new AudioFormat.Builder().setChannelMask(4).setEncoding(2).setSampleRate(i).build(), this.f8365c * 2, 1, 0);
            this.g = audioTrack2;
            if (1 != audioTrack2.getState()) {
                StringBuilder sbA4 = com.heytap.voiceassistant.sdk.tts.closure.a.a.a("AudioTrack state = ");
                sbA4.append(this.g.getState());
                sbA4.append(", retry");
                Logger.print("PcmPlayer", sbA4.toString());
                c();
                AudioTrack audioTrack3 = new AudioTrack(com.heytap.voiceassistant.sdk.tts.closure.b.a.a(this.b), new AudioFormat.Builder().setChannelMask(4).setEncoding(2).setSampleRate(i).build(), this.f8365c, 1, 0);
                this.g = audioTrack3;
                if (1 != audioTrack3.getState()) {
                    StringBuilder sbA5 = com.heytap.voiceassistant.sdk.tts.closure.a.a.a("AudioTrack state = ");
                    sbA5.append(this.g.getState());
                    Logger.error("PcmPlayer", sbA5.toString());
                    StringBuilder sbA6 = com.heytap.voiceassistant.sdk.tts.closure.a.a.a("createAudio AudioTrack state = ");
                    sbA6.append(this.g.getState());
                    sbA6.append(" is not valid");
                    throw new Exception(sbA6.toString());
                }
            }
            Logger.debug("PcmPlayer", "createAudio end");
        }
    }

    public final void c() {
        AudioTrack audioTrack = this.g;
        if (audioTrack != null) {
            if (audioTrack.getPlayState() == 3) {
                this.g.stop();
            }
            this.g.release();
            this.g = null;
        }
        Logger.debug("PcmPlayer", "mAudioTrack released");
    }

    public boolean d() {
        synchronized (this.a) {
            Logger.debug("PcmPlayer", "resume mPlayState= " + c.a(this.f8368l));
            if (this.f8368l != 4) {
                return false;
            }
            this.f8368l = 3;
            return true;
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
        Logger.print("PcmPlayer", "onAudioFocusChange=" + i);
        if (i == -2 || i == -3 || i == -1) {
            StringBuilder sbA = com.heytap.voiceassistant.sdk.tts.closure.a.a.a("pause start mAudioFocusChange2Stop=");
            sbA.append(this.m);
            Logger.print("PcmPlayer", sbA.toString());
            if (this.m && a()) {
                Logger.print("PcmPlayer", "pause success");
                this.f = true;
                a aVar = this.k;
                if (aVar != null) {
                    ((com.heytap.voiceassistant.sdk.tts.closure.f.a.C0812a) aVar).a();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 1) {
            Logger.print("PcmPlayer", "resume start");
            if (this.f) {
                this.f = false;
                if (d()) {
                    Logger.print("PcmPlayer", "resume success");
                    a aVar2 = this.k;
                    if (aVar2 != null) {
                        ((com.heytap.voiceassistant.sdk.tts.closure.f.a.C0812a) aVar2).b();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:141:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:162:0x01bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws Throwable {
        AudioFocusRequest audioFocusRequestBuild;
        AudioTrack audioTrack;
        a aVar;
        AudioManager audioManager = (AudioManager) this.f8367j.getSystemService("audio");
        try {
            try {
                Logger.debug("PcmPlayer", "start player sRequestFocus=" + this.f8366e);
                Process.setThreadPriority(-19);
                if (this.f8366e) {
                    audioFocusRequestBuild = new AudioFocusRequest.Builder(4).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).setOnAudioFocusChangeListener(this).build();
                    try {
                        int iRequestAudioFocus = audioManager.requestAudioFocus(audioFocusRequestBuild);
                        if (this.i && iRequestAudioFocus != 1) {
                            Logger.error("PcmPlayer", "start player but request focus fail");
                            throw new Exception();
                        }
                    } catch (Exception e2) {
                        e = e2;
                        Logger.error("PcmPlayer", "", e);
                        com.heytap.voiceassistant.sdk.tts.closure.f.a.a(com.heytap.voiceassistant.sdk.tts.closure.f.a.this, new SpeechException(20011));
                        synchronized (this.a) {
                            this.f8368l = 5;
                        }
                        AudioTrack audioTrack2 = this.g;
                        if (audioTrack2 != null) {
                            audioTrack2.release();
                            this.g = null;
                        }
                        if (this.f8366e && audioFocusRequestBuild != null) {
                        }
                        Logger.debug("PcmPlayer", "play finally");
                    }
                } else {
                    audioFocusRequestBuild = null;
                }
                this.h.c();
                synchronized (this.a) {
                    if (this.f8368l != 5 && this.f8368l != 4) {
                        this.f8368l = 3;
                    }
                }
                while (this.f8368l != 5) {
                    b();
                    if (this.f8368l == 3 || this.f8368l == 2) {
                        b bVar = this.h;
                        if (bVar.k < bVar.f8361j || bVar.q < bVar.r) {
                            synchronized (this.a) {
                                if (this.f8368l == 2) {
                                    this.f8368l = 3;
                                    a aVar2 = this.k;
                                    if (aVar2 != null) {
                                        ((com.heytap.voiceassistant.sdk.tts.closure.f.a.C0812a) aVar2).b();
                                    }
                                }
                            }
                            int iB = this.h.b();
                            b.a aVarA = this.h.a();
                            if (aVarA != null && (aVar = this.k) != null) {
                                ((com.heytap.voiceassistant.sdk.tts.closure.f.a.C0812a) aVar).a(iB, aVarA.f8364c, aVarA.d);
                            }
                            if (this.g.getPlayState() != 3) {
                                this.g.play();
                            }
                            this.h.a(this.g, this.f8365c);
                        } else if (this.h.d()) {
                            Logger.debug("PcmPlayer", "play stopped");
                            synchronized (this.a) {
                                this.f8368l = 5;
                                a aVar3 = this.k;
                                if (aVar3 != null) {
                                    com.heytap.voiceassistant.sdk.tts.closure.f.a.a(com.heytap.voiceassistant.sdk.tts.closure.f.a.this, (SpeechException) null);
                                }
                            }
                        } else {
                            synchronized (this.a) {
                                if (this.f8368l == 3) {
                                    Logger.debug("PcmPlayer", "play onPaused!");
                                    this.f8368l = 2;
                                    a aVar4 = this.k;
                                    if (aVar4 != null) {
                                        ((com.heytap.voiceassistant.sdk.tts.closure.f.a.C0812a) aVar4).a();
                                    }
                                }
                            }
                            Thread.sleep(50L);
                        }
                    } else if (this.f8368l == 4) {
                        if (this.g.getPlayState() != 2) {
                            this.g.pause();
                        }
                        Thread.sleep(50L);
                    }
                }
                AudioTrack audioTrack3 = this.g;
                if (audioTrack3 != null) {
                    try {
                        audioTrack3.stop();
                    } catch (Exception e3) {
                        Logger.error("PcmPlayer", "", e3);
                    }
                }
                synchronized (this.a) {
                    this.f8368l = 5;
                }
                AudioTrack audioTrack4 = this.g;
                if (audioTrack4 != null) {
                    audioTrack4.release();
                    this.g = null;
                }
                if (this.f8366e && audioFocusRequestBuild != null) {
                    audioManager.abandonAudioFocusRequest(audioFocusRequestBuild);
                }
            } catch (Throwable th) {
                th = th;
                synchronized (this.a) {
                    this.f8368l = 5;
                }
                audioTrack = this.g;
                if (audioTrack != null) {
                    audioTrack.release();
                    this.g = null;
                }
                if (this.f8366e && 0 != 0) {
                    audioManager.abandonAudioFocusRequest(null);
                }
                Logger.debug("PcmPlayer", "play finally");
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            audioFocusRequestBuild = null;
        } catch (Throwable th2) {
            th = th2;
            synchronized (this.a) {
                this.f8368l = 5;
                audioTrack = this.g;
                if (audioTrack != null) {
                    audioTrack.release();
                    this.g = null;
                }
                if (this.f8366e) {
                    audioManager.abandonAudioFocusRequest(null);
                }
                Logger.debug("PcmPlayer", "play finally");
                throw th;
            }
        }
        Logger.debug("PcmPlayer", "play finally");
    }
}
