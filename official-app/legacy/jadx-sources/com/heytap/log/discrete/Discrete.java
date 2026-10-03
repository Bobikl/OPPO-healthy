package com.heytap.log.discrete;

import android.os.Message;
import android.text.TextUtils;
import com.heytap.log.Logger;
import com.heytap.log.uploader.UploadManager;
import com.heytap.log.util.SPUtil;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class Discrete {
    private static final String DISCRETE_LEN = "discreteLen";
    private static final String PREFFIX = "discrete_";
    private static final String TAG = "Discrete";
    private boolean enableDiscrete;
    private Logger logger;
    private Random random;
    private String spDiscreteKey;
    private int startLength = 2000;
    private int endLength = 3600000;
    private int maxLength = 86400000;

    public Discrete(Logger logger) {
        this.enableDiscrete = false;
        this.logger = logger;
        this.spDiscreteKey = PREFFIX + logger.getLogConfig().getBusiness();
        this.enableDiscrete = isDiscreteEnable(logger);
        logger.debug(TAG, "enableDiscrete : " + this.enableDiscrete);
    }

    private long makeRandomDiscreteLen() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.random == null) {
            this.random = new Random();
        }
        long j2 = SPUtil.getInstance().getLong(this.spDiscreteKey, 0L);
        if (j2 > 0) {
            if (j2 < jCurrentTimeMillis) {
                finishDiscrete();
                this.logger.debug(TAG, "makeRandomDiscreteLen 离散时间已过，立即执行请求！");
                return 0L;
            }
            long j3 = j2 - jCurrentTimeMillis;
            this.logger.debug(TAG, "makeRandomDiscreteLen 离上次约定的离散时间还差 ：" + j3);
            SPUtil.getInstance().put(this.spDiscreteKey, jCurrentTimeMillis + j3);
            return j3;
        }
        int iNextInt = this.random.nextInt((this.endLength - this.startLength) + 1) + this.startLength;
        long j4 = iNextInt;
        long j5 = jCurrentTimeMillis + j4;
        SPUtil.getInstance().put(this.spDiscreteKey, j5);
        this.logger.debug(TAG, "makeRandomDiscreteLen raiseLen : " + iNextInt);
        this.logger.debug(TAG, "makeRandomDiscreteLen discreteTime : " + j5);
        return j4;
    }

    public void finishDiscrete() {
        SPUtil.getInstance().put(this.spDiscreteKey, 0L);
    }

    public boolean isDiscreteEnable(Logger logger) {
        String string = SPUtil.getInstance().getString("hlogcfg_" + logger.getLogConfig().getBusiness());
        logger.debug(TAG, "isDiscreteEnable 本地读取的离散配置信息: " + string);
        setDiscreteEnable(logger, string);
        return this.enableDiscrete;
    }

    public boolean needDiscrete(UploadManager.UploadHandler uploadHandler, Message message) {
        if (!this.enableDiscrete || uploadHandler == null || message == null) {
            return false;
        }
        long jMakeRandomDiscreteLen = makeRandomDiscreteLen();
        this.logger.debug(TAG, "needDiscrete 逻辑将在" + jMakeRandomDiscreteLen + "毫秒后开始请求cdn");
        uploadHandler.sendMessageDelayed(message, jMakeRandomDiscreteLen);
        return true;
    }

    public void setDiscreteEnable(Logger logger, String str) {
        if (TextUtils.isEmpty(str)) {
            this.enableDiscrete = false;
            this.endLength = 0;
            return;
        }
        try {
            SPUtil.getInstance().put("hlogcfg_" + logger.getLogConfig().getBusiness(), str);
            int iOptInt = new JSONObject(str).optInt(DISCRETE_LEN);
            if (iOptInt == 0) {
                this.enableDiscrete = false;
                finishDiscrete();
                return;
            }
            int i = iOptInt * 60 * 1000;
            this.endLength = i;
            if (i < this.startLength) {
                this.enableDiscrete = false;
                finishDiscrete();
                return;
            }
            if (i > this.maxLength) {
                logger.debug(TAG, "业务设置的离散时间段超过一天 : " + this.endLength + "毫秒, 不生效，仅提供1天生效");
                this.endLength = this.maxLength;
            }
            this.enableDiscrete = true;
        } catch (JSONException unused) {
        }
    }
}
