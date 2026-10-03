package com.oplus.aiunit.vision;

import com.heytap.speech.engine.HeytapSpeechEngine;
import com.heytap.speech.engine.Module;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.channel.client.data.Action;
import io.protostuff.MapSchema;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 -2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J+\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\tJ'\u0010\u0014\u001a\u00020\u00042\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b\"\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002J\b\u0010\u001a\u001a\u00020\u0004H\u0002J\b\u0010\u001b\u001a\u00020\u0002H\u0002J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\tH\u0002J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010)¨\u0006."}, d2 = {"Lcom/oplus/aiunit/vision/lif;", "Lcom/oplus/aiunit/vision/s61;", "", "f", "", MapSchema.FIELD_NAME_KEY, "j", "topic", "", "", "parts", "a", "(Ljava/lang/String;[[B)V", "url", "args", "Lcom/oplus/aiunit/vision/u92$c;", "b", "(Ljava/lang/String;[[B)Lcom/oplus/aiunit/vision/u92$c;", SpeechConstant.AUDIO_FORMAT_PCM, "s", "q", "([[B)V", "client", "", "w", "o", "r", "u", "t", "state", "x", "", "v", "()Ljava/lang/Integer;", "d", "Ljava/lang/Integer;", "mRecordType", "Ljava/util/ArrayList;", MapSchema.FIELD_NAME_ENTRY, "Ljava/util/ArrayList;", "clients", "Z", "mRecording", "<init>", "()V", "Companion", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public final class lif extends s61 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    public static lif g;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Integer mRecordType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ArrayList<String> clients = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean mRecording;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.lif$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/lif$a;", "", "Lcom/oplus/aiunit/vision/lif;", "sInstance", "Lcom/oplus/aiunit/vision/lif;", "a", "()Lcom/oplus/aiunit/vision/lif;", "setSInstance", "(Lcom/oplus/aiunit/vision/lif;)V", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final lif a() {
            return lif.g;
        }
    }

    public lif() {
        g = this;
    }

    @Override // com.oplus.aiunit.vision.s61, com.oplus.aiunit.vision.fa2
    public void a(@NotNull String topic, @NotNull byte[]... parts) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(parts, "parts");
        if (Intrinsics.areEqual(topic, "pickup.switch")) {
            if (Intrinsics.areEqual("busy", getMState())) {
                t7b.INSTANCE.g("RecorderNode", "pickup switch, should renew Recorder");
                this.mRecordType = v();
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(topic, "recorder.ctrl")) {
            byte[] bArr = parts[0];
            Charset charset = Charsets.UTF_8;
            String str = new String(bArr, charset);
            int iHashCode = str.hashCode();
            if (iHashCode == -1884333473) {
                if (str.equals("stopall")) {
                    this.mRecording = false;
                    r();
                    x("idle");
                    return;
                }
                return;
            }
            if (iHashCode == 3540994) {
                if (str.equals(Action.LIFE_CIRCLE_VALUE_STOP)) {
                    if (!this.mRecording) {
                        t7b.INSTANCE.b("RecorderNode", "recorder return");
                        return;
                    }
                    q((byte[][]) Arrays.copyOf(parts, parts.length));
                    this.mRecording = false;
                    String str2 = new String(parts[1], charset);
                    t7b t7bVar = t7b.INSTANCE;
                    t7bVar.b("RecorderNode", "recorder.ctrl\t" + str + '\t' + str2);
                    if (o(str2)) {
                        t7bVar.b("RecorderNode", Intrinsics.stringPlus("recorder stop:", str2));
                        x("idle");
                    }
                    bee.INSTANCE.j();
                    tz0 audioRecorder = HeytapSpeechEngine.INSTANCE.getInstance().getEngineConfig().getAudioRecorder();
                    if (audioRecorder == null) {
                        return;
                    }
                    audioRecorder.c();
                    return;
                }
                return;
            }
            if (iHashCode == 109757538 && str.equals("start")) {
                if (this.mRecording) {
                    t7b.INSTANCE.b("RecorderNode", "recorder return");
                    return;
                }
                q((byte[][]) Arrays.copyOf(parts, parts.length));
                this.mRecording = true;
                String str3 = new String(parts[1], charset);
                t7b t7bVar2 = t7b.INSTANCE;
                t7bVar2.b("RecorderNode", "recorder.ctrl\t" + str + '\t' + str3);
                if (w(str3)) {
                    t7bVar2.g("RecorderNode", Intrinsics.stringPlus("recorder start:", str3));
                    this.mRecordType = v();
                    x("busy");
                }
                t7bVar2.b("RecorderNode", u());
                bee.INSTANCE.i();
                tz0 audioRecorder2 = HeytapSpeechEngine.INSTANCE.getInstance().getEngineConfig().getAudioRecorder();
                if (audioRecorder2 == null) {
                    return;
                }
                audioRecorder2.b();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.fa2
    @Nullable
    public u92.c b(@NotNull String url, @NotNull byte[]... args) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(args, "args");
        String str = new String(args[0], Charsets.UTF_8);
        int iHashCode = url.hashCode();
        if (iHashCode != -402740144) {
            if (iHashCode != 399944148) {
                if (iHashCode == 895266098 && url.equals("/local_recorder/stop_all")) {
                    r();
                    x("idle");
                    return null;
                }
            } else if (url.equals("/local_recorder/start")) {
                q((byte[][]) Arrays.copyOf(args, args.length));
                t7b t7bVar = t7b.INSTANCE;
                t7bVar.b("RecorderNode", Intrinsics.stringPlus("/local_recorder/start\t", str));
                if (w(str)) {
                    t7bVar.b("RecorderNode", Intrinsics.stringPlus("recorder start:", str));
                    this.mRecordType = v();
                    x("busy");
                }
                t7bVar.b("RecorderNode", u());
                return null;
            }
        } else if (url.equals("/local_recorder/stop")) {
            q((byte[][]) Arrays.copyOf(args, args.length));
            t7b t7bVar2 = t7b.INSTANCE;
            t7bVar2.b("RecorderNode", Intrinsics.stringPlus("/local_recorder/stop\t", str));
            if (!o(str)) {
                return null;
            }
            t7bVar2.b("RecorderNode", Intrinsics.stringPlus("recorder stop:", str));
            x("idle");
            return null;
        }
        t7b.INSTANCE.k("RecorderNode", Intrinsics.stringPlus("Unsupported RPC: ", url));
        return null;
    }

    @Override // com.oplus.aiunit.vision.s61
    @NotNull
    public String f() {
        return "RecorderNode";
    }

    @Override // com.oplus.aiunit.vision.s61
    public void j() {
        super.j();
        u92 busClient = getBusClient();
        if (busClient != null) {
            busClient.D("pickup.switch", "recorder.ctrl");
        }
        x("idle");
    }

    @Override // com.oplus.aiunit.vision.s61
    public void k() {
        super.k();
        u92 busClient = getBusClient();
        if (busClient == null) {
            return;
        }
        busClient.C("pickup.switch", "recorder.ctrl");
    }

    public final boolean o(String client) {
        if (!this.clients.contains(client)) {
            return false;
        }
        this.clients.remove(client);
        return this.clients.size() == 0;
    }

    public final void q(byte[]... args) {
        if (!(!(args.length == 0))) {
            throw new IllegalArgumentException("/local_recorder/start or stop needs argument to identify caller. For example: bc.call('/local_recorder/start', 'wakeup')".toString());
        }
    }

    public final void r() {
        this.clients.clear();
    }

    public final void s(@NotNull byte[] pcm) {
        Intrinsics.checkNotNullParameter(pcm, "pcm");
        if ((Intrinsics.areEqual("busy", getMState()) || this.mRecording) && getBusClient() != null) {
            t(pcm);
        } else {
            t7b.INSTANCE.d("RecorderNode", "not started, drop");
        }
    }

    public final void t(byte[] pcm) {
        Integer num = this.mRecordType;
        if (num != null && num.intValue() == 0) {
            u92 busClient = getBusClient();
            if (busClient != null) {
                byte[] bytes = "mono".getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                busClient.t("local_recorder.pcm", false, bytes, pcm);
            }
            u92 busClient2 = getBusClient();
            if (busClient2 == null) {
                return;
            }
            busClient2.s("local_recorder.volume", false, String.valueOf(mif.a(pcm)));
            return;
        }
        if (num != null && num.intValue() == 1) {
            u92 busClient3 = getBusClient();
            if (busClient3 != null) {
                byte[] bytes2 = "stereo".getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes2, "(this as java.lang.String).getBytes(charset)");
                busClient3.t("local_recorder.pcm", false, bytes2, pcm);
            }
            u92 busClient4 = getBusClient();
            if (busClient4 == null) {
                return;
            }
            busClient4.s("local_recorder.volume", false, String.valueOf(mif.a(pcm)));
            return;
        }
        if (num != null && num.intValue() == 2) {
            u92 busClient5 = getBusClient();
            if (busClient5 != null) {
                busClient5.t("local_recorder.pcm", false, pcm);
            }
            u92 busClient6 = getBusClient();
            if (busClient6 == null) {
                return;
            }
            busClient6.s("local_recorder.volume", false, String.valueOf(mif.a(pcm)));
            return;
        }
        if (num == null || num.intValue() != 3) {
            u92 busClient7 = getBusClient();
            if (busClient7 == null) {
                return;
            }
            busClient7.t("local_recorder.pcm", false, pcm);
            return;
        }
        u92 busClient8 = getBusClient();
        if (busClient8 != null) {
            busClient8.t("local_recorder.pcm", false, pcm);
        }
        u92 busClient9 = getBusClient();
        if (busClient9 == null) {
            return;
        }
        busClient9.s("local_recorder.volume", false, String.valueOf(mif.a(pcm)));
    }

    public final String u() {
        StringBuilder sb = new StringBuilder("====Clients list: ");
        Iterator<String> it = this.clients.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "clients.iterator()");
        while (it.hasNext()) {
            String next = it.next();
            if (next == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            sb.append(next);
            sb.append("\t");
        }
        sb.append("=====");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "builder.toString()");
        return string;
    }

    public final Integer v() {
        if (this.mRecordType == null) {
            Object objA = qu3.INSTANCE.a("module");
            if (objA == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.heytap.speech.engine.Module");
            }
            Module module = (Module) objA;
            this.mRecordType = module.getEnable() ? Integer.valueOf(module.getType()) : 0;
        }
        return this.mRecordType;
    }

    public final boolean w(String client) {
        boolean z = this.clients.size() == 0;
        if (!this.clients.contains(client)) {
            this.clients.add(client);
        }
        return z;
    }

    public final void x(String state) {
        l(state);
        if (getBusClient() != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("state", state);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            u92 busClient = getBusClient();
            if (busClient == null) {
                return;
            }
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "obj.toString()");
            busClient.u("local_recorder.state", string);
        }
    }
}
