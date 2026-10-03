package com.heytap.speech.engine.nodes;

import com.heytap.log.formatter.LogFieldKey;
import com.heytap.speech.engine.callback.TTSRequestListener;
import com.heytap.speech.engine.constant.EngineConstant;
import com.oplus.aiunit.vision.kp3;
import com.oplus.aiunit.vision.s61;
import com.oplus.aiunit.vision.t7b;
import com.oplus.aiunit.vision.u92;
import com.oplus.channel.client.data.Action;
import io.protostuff.MapSchema;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J+\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0002H\u0002R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/heytap/speech/engine/nodes/TtsExNode;", "Lcom/oplus/aiunit/vision/s61;", "", "f", "", MapSchema.FIELD_NAME_KEY, "j", "topic", "", "", "parts", "a", "(Ljava/lang/String;[[B)V", "url", "args", "Lcom/oplus/aiunit/vision/u92$c;", "b", "(Ljava/lang/String;[[B)Lcom/oplus/aiunit/vision/u92$c;", "o", "([[B)V", LogFieldKey.PROCESS_NAME_KEY, "state", "q", "Ljava/util/ArrayList;", "d", "Ljava/util/ArrayList;", "clients", "Lcom/heytap/speech/engine/callback/TTSRequestListener;", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/speech/engine/callback/TTSRequestListener;", "mListener", "<init>", "()V", "Companion", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public final class TtsExNode extends s61 {

    @Nullable
    public static TtsExNode f;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<String> clients = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public TTSRequestListener mListener;

    public TtsExNode() {
        f = this;
    }

    @Override // com.oplus.aiunit.vision.s61, com.oplus.aiunit.vision.fa2
    public void a(@NotNull String topic, @NotNull byte[]... parts) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(parts, "parts");
        if (Intrinsics.areEqual(topic, "tts.error.ctrl")) {
            o((byte[][]) Arrays.copyOf(parts, parts.length));
        } else if (Intrinsics.areEqual(topic, "tts.ctrl")) {
            p((byte[][]) Arrays.copyOf(parts, parts.length));
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    @Override // com.oplus.aiunit.vision.fa2
    @Nullable
    public u92.c b(@NotNull String url, @NotNull byte[]... args) {
        String str;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(args, "args");
        byte[] bArr = args[0];
        Charset charset = Charsets.UTF_8;
        String str2 = new String(bArr, charset);
        if (!Intrinsics.areEqual(url, "/external_tts/start")) {
            if (!Intrinsics.areEqual(url, "/external_tts/stop")) {
                t7b.INSTANCE.k("TtsExNode", Intrinsics.stringPlus("Unsupported RPC: ", url));
                return null;
            }
            TTSRequestListener tTSRequestListener = this.mListener;
            if (tTSRequestListener != null) {
                tTSRequestListener.onStop();
            }
            q("idle");
            return null;
        }
        if (args.length < 2) {
            str = "text";
        } else {
            if (new String(args[1], charset).length() > 0) {
                str = EngineConstant.TTS_TYPE_SSML;
            } else {
                str = "text";
            }
        }
        TTSRequestListener tTSRequestListener2 = this.mListener;
        if (tTSRequestListener2 != null) {
            tTSRequestListener2.onStart(str, str2);
        }
        q("busy");
        return null;
    }

    @Override // com.oplus.aiunit.vision.s61
    @NotNull
    public String f() {
        return "TtsExNode";
    }

    @Override // com.oplus.aiunit.vision.s61
    public void j() {
        super.j();
        u92 busClient = getBusClient();
        if (busClient != null) {
            busClient.D("tts.ctrl", "tts.error.ctrl");
        }
        q("idle");
    }

    @Override // com.oplus.aiunit.vision.s61
    public void k() {
        super.k();
        u92 busClient = getBusClient();
        if (busClient == null) {
            return;
        }
        busClient.C("tts.ctrl", "tts.error.ctrl");
    }

    public final void o(byte[]... parts) {
        byte[] bArr = parts[0];
        Charset charset = Charsets.UTF_8;
        if (Intrinsics.areEqual(new String(bArr, charset), "start")) {
            TTSRequestListener tTSRequestListener = this.mListener;
            if (tTSRequestListener != null) {
                tTSRequestListener.onStart("error", new String(parts[1], charset));
            }
            q("busy");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(byte[]... parts) {
        byte[] bArr = parts[0];
        Charset charset = Charsets.UTF_8;
        String str = new String(bArr, charset);
        int iHashCode = str.hashCode();
        if (iHashCode != -1361636432) {
            if (iHashCode != 3540994) {
                if (iHashCode == 109757538 && str.equals("start")) {
                    final String str2 = new String(parts[1], charset);
                    final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    objectRef.element = "text";
                    kp3.INSTANCE.a(new Function0<Unit>() { // from class: com.heytap.speech.engine.nodes.TtsExNode$processTts$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p010kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            String strOptString = new JSONObject(str2).optString(EngineConstant.SSML_FLAG_VALUE_STR);
                            objectRef.element = strOptString == null || strOptString.length() == 0 ? "text" : EngineConstant.TTS_TYPE_SSML;
                        }
                    }, new Function0<Unit>() { // from class: com.heytap.speech.engine.nodes.TtsExNode$processTts$2
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }

                        @Override // p010kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }
                    });
                    TTSRequestListener tTSRequestListener = this.mListener;
                    if (tTSRequestListener != null) {
                        tTSRequestListener.onStart((String) objectRef.element, str2);
                    }
                    q("busy");
                    return;
                }
            } else if (str.equals(Action.LIFE_CIRCLE_VALUE_STOP)) {
                TTSRequestListener tTSRequestListener2 = this.mListener;
                if (tTSRequestListener2 != null) {
                    tTSRequestListener2.onStop();
                }
                q("idle");
                return;
            }
        } else if (str.equals("change")) {
            String str3 = new String(parts[1], charset);
            TTSRequestListener tTSRequestListener3 = this.mListener;
            if (tTSRequestListener3 == null) {
                return;
            }
            tTSRequestListener3.onConfigChange(str3);
            return;
        }
        t7b.INSTANCE.k("TtsExNode", "Unsupported tts ctrl event");
    }

    public final void q(String state) {
        if (Intrinsics.areEqual(getMState(), state)) {
            t7b.INSTANCE.b("TtsExNode", "state not changed, ignore");
            return;
        }
        if (getBusClient() == null) {
            t7b.INSTANCE.d("TtsExNode", "Never Happened! busClient is null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("state", state);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        u92 busClient = getBusClient();
        if (busClient != null) {
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "obj.toString()");
            busClient.u("local_tts.state", string);
        }
        u92 busClient2 = getBusClient();
        if (busClient2 == null) {
            return;
        }
        String string2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "obj.toString()");
        busClient2.u("local_player.state", string2);
    }
}
