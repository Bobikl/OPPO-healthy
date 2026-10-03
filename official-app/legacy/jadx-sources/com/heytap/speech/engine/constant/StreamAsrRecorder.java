package com.heytap.speech.engine.constant;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.t7b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0006\u0010\u000b\u001a\u00020\fJ.\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/heytap/speech/engine/constant/StreamAsrRecorder;", "", "()V", "TAG", "", "<set-?>", "Lcom/heytap/speech/engine/constant/StreamASRBean;", "streamASRBean", "getStreamASRBean", "()Lcom/heytap/speech/engine/constant/StreamASRBean;", "buildTextFromList", "clearTextWhenOneshotFinal", "", "updateStreamASRBean", SpeechConstant.KEY_RECORD_ID, "content", "mode", "seqNo", "", "replaceIndex", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class StreamAsrRecorder {

    @NotNull
    public static final StreamAsrRecorder INSTANCE = new StreamAsrRecorder();

    @NotNull
    public static final String TAG = "StreamAsrRecorder";

    @Nullable
    private static StreamASRBean streamASRBean;

    private StreamAsrRecorder() {
    }

    private final String buildTextFromList() {
        List<StreamASRBean.StreamSentenceBean> sentenceList;
        StreamASRBean streamASRBean2 = streamASRBean;
        String strStringPlus = "";
        if (streamASRBean2 != null && (sentenceList = streamASRBean2.getSentenceList()) != null) {
            Iterator<T> it = sentenceList.iterator();
            while (it.hasNext()) {
                strStringPlus = Intrinsics.stringPlus(strStringPlus, ((StreamASRBean.StreamSentenceBean) it.next()).getSentence());
            }
        }
        return strStringPlus;
    }

    public final void clearTextWhenOneshotFinal() {
        t7b.INSTANCE.b(TAG, "clearTextWhenOneshotFinal");
        streamASRBean = null;
    }

    @Nullable
    public final StreamASRBean getStreamASRBean() {
        return streamASRBean;
    }

    public final void updateStreamASRBean(@NotNull String recordId, @NotNull String content, @NotNull String mode, int seqNo, int replaceIndex) {
        List<StreamASRBean.StreamSentenceBean> sentenceList;
        StreamASRBean streamASRBean2;
        List<StreamASRBean.StreamSentenceBean> sentenceList2;
        List<StreamASRBean.StreamSentenceBean> sentenceList3;
        Intrinsics.checkNotNullParameter(recordId, "recordId");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(mode, "mode");
        StreamASRBean streamASRBean3 = streamASRBean;
        if (!Intrinsics.areEqual(recordId, streamASRBean3 == null ? null : streamASRBean3.getRecordId())) {
            t7b.INSTANCE.b(TAG, "updateStreamASRBean, new.");
            StreamASRBean streamASRBean4 = new StreamASRBean();
            streamASRBean = streamASRBean4;
            streamASRBean4.setRecordId(recordId);
            StreamASRBean streamASRBean5 = streamASRBean;
            if (streamASRBean5 != null) {
                streamASRBean5.setText(content);
            }
            ArrayList arrayList = new ArrayList();
            StreamASRBean.StreamSentenceBean streamSentenceBean = new StreamASRBean.StreamSentenceBean();
            streamSentenceBean.setSeqNo(Integer.valueOf(seqNo));
            streamSentenceBean.setSentence(content);
            Unit unit = Unit.INSTANCE;
            arrayList.add(streamSentenceBean);
            StreamASRBean streamASRBean6 = streamASRBean;
            if (streamASRBean6 == null) {
                return;
            }
            streamASRBean6.setSentenceList(arrayList);
            return;
        }
        if (!Intrinsics.areEqual(mode, "append")) {
            if (!Intrinsics.areEqual(mode, "replace")) {
                StreamASRBean streamASRBean7 = streamASRBean;
                if (streamASRBean7 != null) {
                    streamASRBean7.setText(content);
                }
                StreamASRBean streamASRBean8 = streamASRBean;
                if (streamASRBean8 == null) {
                    return;
                }
                streamASRBean8.setSentenceList(null);
                return;
            }
            StreamASRBean streamASRBean9 = streamASRBean;
            if (streamASRBean9 != null && (sentenceList = streamASRBean9.getSentenceList()) != null) {
                for (StreamASRBean.StreamSentenceBean streamSentenceBean2 : sentenceList) {
                    Integer seqNo2 = streamSentenceBean2.getSeqNo();
                    if (seqNo2 != null && seqNo2.intValue() == replaceIndex) {
                        streamSentenceBean2.setSentence(content);
                    }
                }
            }
            StreamASRBean streamASRBean10 = streamASRBean;
            if (streamASRBean10 == null) {
                return;
            }
            streamASRBean10.setText(buildTextFromList());
            return;
        }
        StreamASRBean streamASRBean11 = streamASRBean;
        boolean z = false;
        if (streamASRBean11 != null && (sentenceList3 = streamASRBean11.getSentenceList()) != null) {
            for (StreamASRBean.StreamSentenceBean streamSentenceBean3 : sentenceList3) {
                Integer seqNo3 = streamSentenceBean3.getSeqNo();
                if (seqNo3 != null && seqNo3.intValue() == seqNo) {
                    streamSentenceBean3.setSentence(Intrinsics.stringPlus(streamSentenceBean3.getSentence(), content));
                    z = true;
                }
            }
        }
        if (!z && (streamASRBean2 = streamASRBean) != null && (sentenceList2 = streamASRBean2.getSentenceList()) != null) {
            StreamASRBean.StreamSentenceBean streamSentenceBean4 = new StreamASRBean.StreamSentenceBean();
            streamSentenceBean4.setSeqNo(Integer.valueOf(seqNo));
            streamSentenceBean4.setSentence(content);
            Unit unit2 = Unit.INSTANCE;
            sentenceList2.add(streamSentenceBean4);
        }
        StreamASRBean streamASRBean12 = streamASRBean;
        if (streamASRBean12 == null) {
            return;
        }
        streamASRBean12.setText(buildTextFromList());
    }
}
