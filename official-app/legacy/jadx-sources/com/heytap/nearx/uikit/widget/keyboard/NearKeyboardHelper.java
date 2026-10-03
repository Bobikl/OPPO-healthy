package com.heytap.nearx.uikit.widget.keyboard;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.heytap.nearx.uikit.R$drawable;
import com.heytap.nearx.uikit.R$string;
import com.heytap.nearx.uikit.R$xml;
import com.heytap.nearx.uikit.widget.keyboard.util.ScreenConfigUtil;
import com.oplus.aiunit.vision.xvk;
import com.oplus.os.LinearmotorVibrator;
import com.oplus.os.WaveformEffect;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes18.dex */
public class NearKeyboardHelper implements SecurityKeyboardView.OnKeyboardActionListener {
    private static final int KEYBOARD_MODE_NUMERIC = 3;
    private static final int KEYBOARD_MODE_QWERTY = 1;
    private static final int KEYBOARD_MODE_SPECIAL_SYMBOLS = 4;
    private static final int KEYBOARD_MODE_SYMBOLS = 2;
    private static final int KEYBOARD_STATE_CAPSLOCK = 2;
    private static final int KEYBOARD_STATE_NORMAL = 0;
    private static final int KEYBOARD_STATE_SHIFTED = 1;
    private static final int NUMERIC = 0;
    private static final int QWERTY = 1;
    private static final int SEPARATE_QWERTY = 4;
    private static final int SEPARATE_SPECIAL_SYMBOLS = 6;
    private static final int SEPARATE_SYMBOLS = 5;
    private static final int SPECIAL_SYMBOLS = 3;
    private static final int SYMBOLS = 2;
    private static final String TAG = "KeyboardHelper";
    private AudioManager mAudioManager;
    private final Context mContext;
    protected InputMethodManager mIMM;
    private boolean mIsLinearMotorVersion;
    private final SecurityKeyboardView mKeyboardView;
    private SecurityKeyboard mNumberKeyboard;
    private SecurityKeyboard mQwertyKeyboard;
    private ContentObserver mSeparateContentObserver;
    private SecurityKeyboard mSeparateQwertyKeyboard;
    private SecurityKeyboard mSeparateSymbolsKeyboard;
    private SecurityKeyboard mSeparatesSpecialSymbolsKeyboard;
    private Drawable mShiftIcon;
    private Drawable mShiftLockIcon;
    private Drawable mShiftedIcon;
    private SecurityKeyboard mSpecialSymbolsKeyboard;
    private SecurityKeyboard mSymbolsKeyboard;
    private final View mTargetView;
    private ContentObserver mVibrationObserver;
    private int mKeyboardType = 1;
    private final String MODE_FLAG = "use_separate_keyboard";
    private final String VIBRATE_MODE_FLAG = "input_method_key_vibration";
    private final String FOLD_SCREEN_STATUS = "oplus_system_folding_mode";
    private final int FOLDABLE_STATUS_OPEN = 1;
    private int mKeyboardState = 0;
    private ArrayList<SecurityKeyboard> mKeyboards = new ArrayList<>();
    private boolean mEnableHaptics = true;
    private boolean mPlayVoice = true;
    private boolean mIsUseSeparateKeyboard = false;
    private boolean mIsFoldScreen = false;
    private boolean mIsPadScreen = false;
    private final ArrayList<Integer> mLayoutList = new ArrayList<>();

    public NearKeyboardHelper(Context context, SecurityKeyboardView securityKeyboardView, View view) {
        this.mContext = context;
        initLayoutDataList();
        this.mTargetView = view;
        this.mKeyboardView = securityKeyboardView;
        securityKeyboardView.setOnKeyboardActionListener(this);
        this.mIsLinearMotorVersion = xvk.c(context);
        if (view != null) {
            view.setImportantForAccessibility(1);
        }
        securityKeyboardView.setKeyboardType(1);
        createSecurityKeyboards();
        setKeyboardMode(1);
    }

    private void createSecurityKeyboards() {
        SecurityKeyboard securityKeyboard = new SecurityKeyboard(this.mContext, this.mLayoutList.get(1).intValue(), 0);
        this.mQwertyKeyboard = securityKeyboard;
        securityKeyboard.setKeyboardType(1);
        this.mKeyboards.add(this.mQwertyKeyboard);
        SecurityKeyboard securityKeyboard2 = new SecurityKeyboard(this.mContext, this.mLayoutList.get(4).intValue(), 0);
        this.mSeparateQwertyKeyboard = securityKeyboard2;
        securityKeyboard2.setKeyboardType(5);
        this.mKeyboards.add(this.mSeparateQwertyKeyboard);
        SecurityKeyboard securityKeyboard3 = new SecurityKeyboard(this.mContext, this.mLayoutList.get(0).intValue(), 0);
        this.mNumberKeyboard = securityKeyboard3;
        securityKeyboard3.setKeyboardType(3);
        this.mKeyboards.add(this.mNumberKeyboard);
        SecurityKeyboard securityKeyboard4 = new SecurityKeyboard(this.mContext, this.mLayoutList.get(2).intValue(), 0);
        this.mSymbolsKeyboard = securityKeyboard4;
        securityKeyboard4.setKeyboardType(2);
        this.mKeyboards.add(this.mSymbolsKeyboard);
        SecurityKeyboard securityKeyboard5 = new SecurityKeyboard(this.mContext, this.mLayoutList.get(5).intValue(), 0);
        this.mSeparateSymbolsKeyboard = securityKeyboard5;
        securityKeyboard5.setKeyboardType(6);
        this.mKeyboards.add(this.mSeparateSymbolsKeyboard);
        SecurityKeyboard securityKeyboard6 = new SecurityKeyboard(this.mContext, this.mLayoutList.get(3).intValue(), 0);
        this.mSpecialSymbolsKeyboard = securityKeyboard6;
        securityKeyboard6.setKeyboardType(4);
        this.mKeyboards.add(this.mSpecialSymbolsKeyboard);
        SecurityKeyboard securityKeyboard7 = new SecurityKeyboard(this.mContext, this.mLayoutList.get(6).intValue(), 0);
        this.mSeparatesSpecialSymbolsKeyboard = securityKeyboard7;
        securityKeyboard7.setKeyboardType(7);
        this.mKeyboards.add(this.mSeparatesSpecialSymbolsKeyboard);
    }

    @SuppressLint({"WrongConstant"})
    private void doVibrate() {
        try {
            LinearmotorVibrator linearmotorVibrator = (LinearmotorVibrator) this.mContext.getSystemService("linearmotor");
            if (linearmotorVibrator != null) {
                linearmotorVibrator.vibrate(new WaveformEffect.Builder().setEffectType(1).build());
            }
        } catch (Exception e2) {
            Log.e(TAG, "vibrate: exception: " + e2);
        } catch (NoClassDefFoundError unused) {
            Log.e(TAG, "vibrate: No class found!");
        }
    }

    private AudioManager getAudioManager() {
        SecurityKeyboardView securityKeyboardView = this.mKeyboardView;
        if (securityKeyboardView == null) {
            throw new IllegalStateException("getAudioManager called when there is no mView");
        }
        if (this.mAudioManager == null) {
            this.mAudioManager = (AudioManager) securityKeyboardView.getContext().getSystemService("audio");
        }
        return this.mAudioManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SecurityKeyboard getCorrespondingKeyboard(SecurityKeyboard securityKeyboard, SecurityKeyboard securityKeyboard2) {
        if (this.mIsFoldScreen) {
            if (this.mIsUseSeparateKeyboard && (this.mContext.getResources().getConfiguration().orientation == 2 || getFoldScreenStatus() == 1)) {
                return securityKeyboard2;
            }
        } else if (this.mIsUseSeparateKeyboard && this.mContext.getResources().getConfiguration().orientation == 2) {
            return securityKeyboard2;
        }
        return securityKeyboard;
    }

    private int getFoldScreenStatus() {
        return Settings.Global.getInt(this.mContext.getContentResolver(), "oplus_system_folding_mode", -1);
    }

    private void handleCharacter(int i, int[] iArr) {
        if (this.mKeyboardView.getNewShifted() >= 1 && i != 32 && i != 10) {
            i = Character.toUpperCase(i);
        }
        sendKeyEventsToTarget(i);
    }

    private void handleClose() {
    }

    private void handleModeChange(int i) {
        SecurityKeyboard keyboard = this.mKeyboardView.getKeyboard();
        SecurityKeyboard correspondingKeyboard = this.mNumberKeyboard;
        if (keyboard == correspondingKeyboard && i == -2) {
            correspondingKeyboard = getCorrespondingKeyboard(this.mSymbolsKeyboard, this.mSeparateSymbolsKeyboard);
        } else if (keyboard == correspondingKeyboard && i == -6) {
            correspondingKeyboard = getCorrespondingKeyboard(this.mQwertyKeyboard, this.mSeparateQwertyKeyboard);
        } else {
            SecurityKeyboard securityKeyboard = this.mQwertyKeyboard;
            if ((keyboard == securityKeyboard || keyboard == this.mSeparateQwertyKeyboard) && i == -2) {
                correspondingKeyboard = getCorrespondingKeyboard(this.mSymbolsKeyboard, this.mSeparateSymbolsKeyboard);
            } else if ((keyboard != securityKeyboard && keyboard != this.mSeparateQwertyKeyboard) || i != -6) {
                SecurityKeyboard securityKeyboard2 = this.mSymbolsKeyboard;
                if ((keyboard == securityKeyboard2 || keyboard == this.mSeparateSymbolsKeyboard) && i == -2) {
                    correspondingKeyboard = getCorrespondingKeyboard(securityKeyboard, this.mSeparateQwertyKeyboard);
                } else if ((keyboard != securityKeyboard2 && keyboard != this.mSeparateSymbolsKeyboard) || i != -6) {
                    if ((keyboard == securityKeyboard2 || keyboard == this.mSeparateSymbolsKeyboard) && i == -7) {
                        correspondingKeyboard = getCorrespondingKeyboard(this.mSpecialSymbolsKeyboard, this.mSeparatesSpecialSymbolsKeyboard);
                    } else {
                        SecurityKeyboard securityKeyboard3 = this.mSpecialSymbolsKeyboard;
                        if ((keyboard == securityKeyboard3 || keyboard == this.mSeparatesSpecialSymbolsKeyboard) && i == -7) {
                            correspondingKeyboard = getCorrespondingKeyboard(securityKeyboard2, this.mSeparateSymbolsKeyboard);
                        } else if ((keyboard != securityKeyboard3 && keyboard != this.mSeparatesSpecialSymbolsKeyboard) || i != -6) {
                            correspondingKeyboard = getCorrespondingKeyboard(securityKeyboard, this.mSeparateQwertyKeyboard);
                        }
                    }
                }
            }
        }
        this.mKeyboardView.setPreviewEnabled(correspondingKeyboard != this.mNumberKeyboard);
        this.mKeyboardView.setKeyboard(correspondingKeyboard);
        if (correspondingKeyboard == this.mQwertyKeyboard || correspondingKeyboard == this.mSeparateQwertyKeyboard) {
            this.mKeyboardState = 0;
            updateShiftKeyIcon(correspondingKeyboard);
            this.mKeyboardView.setNewShifted(this.mKeyboardState);
        }
    }

    private void handleShift(boolean z) {
        SecurityKeyboard keyboard = this.mKeyboardView.getKeyboard();
        if (keyboard == this.mQwertyKeyboard || keyboard == this.mSeparateQwertyKeyboard) {
            int i = this.mKeyboardState;
            if (i == 0) {
                this.mKeyboardState = 1;
            } else if (i == 1) {
                if (z) {
                    this.mKeyboardState = 0;
                } else {
                    this.mKeyboardState = 2;
                }
            } else if (i == 2) {
                this.mKeyboardState = 0;
            }
            this.mKeyboardView.setKeyboard(keyboard);
            updateShiftKeyIcon(keyboard);
            this.mKeyboardView.setNewShifted(this.mKeyboardState);
        }
    }

    private void initLayoutDataList() {
        if (Settings.System.getInt(this.mContext.getContentResolver(), "use_separate_keyboard", 0) != 0) {
            this.mIsUseSeparateKeyboard = true;
        }
        this.mIsFoldScreen = ScreenConfigUtil.isFoldScreen(this.mContext);
        boolean zIsPad = ScreenConfigUtil.isPad(this.mContext);
        this.mIsPadScreen = zIsPad;
        if (!zIsPad && Settings.System.getInt(this.mContext.getContentResolver(), "input_method_key_vibration", 0) == 0) {
            this.mEnableHaptics = false;
        }
        Log.d(TAG, "mIsFoldScreen: " + this.mIsFoldScreen + " mIsPadScreen: " + this.mIsPadScreen + " mEnableHaptics: " + this.mEnableHaptics);
        if (this.mIsPadScreen) {
            this.mLayoutList.add(Integer.valueOf(R$xml.pad_kbd_numeric));
            this.mLayoutList.add(Integer.valueOf(R$xml.pad_kbd_qwerty));
            this.mLayoutList.add(Integer.valueOf(R$xml.pad_kbd_symbols));
            this.mLayoutList.add(Integer.valueOf(R$xml.pad_kbd_special_symbols));
            this.mLayoutList.add(Integer.valueOf(R$xml.pad_separate_kbd_qwerty));
            this.mLayoutList.add(Integer.valueOf(R$xml.pad_separate_kbd_symbols));
            this.mLayoutList.add(Integer.valueOf(R$xml.pad_separate_kbd_special_symbols));
            return;
        }
        if (this.mIsFoldScreen) {
            this.mLayoutList.add(Integer.valueOf(R$xml.fold_screen_kbd_numeric));
            this.mLayoutList.add(Integer.valueOf(R$xml.fold_screen_kbd_qwerty));
            this.mLayoutList.add(Integer.valueOf(R$xml.fold_screen_kbd_symbols));
            this.mLayoutList.add(Integer.valueOf(R$xml.fold_screen_kbd_special_symbols));
            this.mLayoutList.add(Integer.valueOf(R$xml.fold_screen_separate_kbd_qwerty));
            this.mLayoutList.add(Integer.valueOf(R$xml.fold_screen_separate_kbd_symbols));
            this.mLayoutList.add(Integer.valueOf(R$xml.fold_screen_separate_kbd_special_symbols));
            return;
        }
        this.mLayoutList.add(Integer.valueOf(R$xml.kbd_numeric));
        this.mLayoutList.add(Integer.valueOf(R$xml.kbd_qwerty));
        this.mLayoutList.add(Integer.valueOf(R$xml.kbd_symbols));
        this.mLayoutList.add(Integer.valueOf(R$xml.kbd_special_symbols));
        this.mLayoutList.add(Integer.valueOf(R$xml.separate_kbd_qwerty));
        this.mLayoutList.add(Integer.valueOf(R$xml.separate_kbd_symbols));
        this.mLayoutList.add(Integer.valueOf(R$xml.separate_kbd_special_symbols));
    }

    private void performHapticFeedback() {
        if (!this.mEnableHaptics) {
            Log.d(TAG, "performHapticFeedback mEnableHaptics is false so return");
        } else if (xvk.c(this.mContext)) {
            doVibrate();
        } else {
            Log.d(TAG, "Linear motors are not supported!");
            this.mKeyboardView.performHapticFeedback(1, 3);
        }
    }

    private void performKeyVoiceFeedback() {
        if (this.mPlayVoice) {
            getAudioManager().playSoundEffect(5);
        }
    }

    private void sendDownUpKeyEvents(int i) {
    }

    private void sendKeyEventsToTarget(int i) {
    }

    private void setVoiceEanble(boolean z) {
        this.mPlayVoice = z;
    }

    private void updateShiftKeyIcon(SecurityKeyboard securityKeyboard) {
        if (securityKeyboard == this.mQwertyKeyboard || securityKeyboard == this.mSeparateQwertyKeyboard) {
            this.mShiftIcon = this.mContext.getResources().getDrawable(R$drawable.nx_sym_keyboard_shift);
            this.mShiftedIcon = this.mContext.getResources().getDrawable(R$drawable.nx_sym_keyboard_shift_shifted);
            this.mShiftLockIcon = this.mContext.getResources().getDrawable(R$drawable.nx_sym_keyboard_shift_locked);
            int shiftKeyIndex = securityKeyboard.getShiftKeyIndex();
            int i = this.mKeyboardState;
            if (i == 0) {
                securityKeyboard.getKeys().get(shiftKeyIndex).icon = this.mShiftIcon;
            } else if (i == 1) {
                securityKeyboard.getKeys().get(shiftKeyIndex).icon = this.mShiftedIcon;
            } else if (i == 2) {
                securityKeyboard.getKeys().get(shiftKeyIndex).icon = this.mShiftLockIcon;
            }
        }
    }

    public void finish() {
        try {
            if (this.mSeparateContentObserver != null) {
                this.mContext.getContentResolver().unregisterContentObserver(this.mSeparateContentObserver);
                this.mSeparateContentObserver = null;
            }
            if (this.mVibrationObserver != null) {
                this.mContext.getContentResolver().unregisterContentObserver(this.mVibrationObserver);
                this.mVibrationObserver = null;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public Drawable getIconForImeAction(int i) {
        switch (i & 255) {
            case 1:
            case 2:
            case 6:
                return this.mContext.getResources().getDrawable(R$drawable.nx_security_password_end_key_default);
            case 3:
                return this.mContext.getResources().getDrawable(R$drawable.nx_security_password_end_key_search);
            case 4:
            case 5:
                return this.mContext.getResources().getDrawable(R$drawable.nx_security_password_end_key_next);
            case 7:
                return this.mContext.getResources().getDrawable(R$drawable.nx_security_password_end_key_previous);
            default:
                return this.mContext.getResources().getDrawable(R$drawable.nx_security_password_end_key_default);
        }
    }

    public void handleBackspace() {
        sendDownUpKeyEvents(67);
    }

    public void handleClear() {
        sendDownUpKeyEvents(28);
    }

    @Override // com.heytap.nearx.uikit.widget.keyboard.SecurityKeyboardView.OnKeyboardActionListener
    public void onKey(int i, int[] iArr) {
        if (i == -5) {
            handleBackspace();
            return;
        }
        if (i == -1) {
            handleShift(false);
            return;
        }
        if (i == -2 || i == -7) {
            handleModeChange(i);
            return;
        }
        if (i == -6) {
            handleModeChange(i);
            return;
        }
        handleCharacter(i, iArr);
        SecurityKeyboard keyboard = this.mKeyboardView.getKeyboard();
        if (this.mKeyboardState == 1) {
            if (keyboard == this.mQwertyKeyboard || keyboard == this.mSeparateQwertyKeyboard) {
                this.mKeyboardState = 0;
                updateShiftKeyIcon(keyboard);
                this.mKeyboardView.setKeyboard(keyboard);
                this.mKeyboardView.setNewShifted(this.mKeyboardState);
            }
        }
    }

    @Override // com.heytap.nearx.uikit.widget.keyboard.SecurityKeyboardView.OnKeyboardActionListener
    public void onPress(int i) {
        if (i != 0) {
            performHapticFeedback();
            performKeyVoiceFeedback();
        }
    }

    @Override // com.heytap.nearx.uikit.widget.keyboard.SecurityKeyboardView.OnKeyboardActionListener
    public void onRelease(int i) {
    }

    @Override // com.heytap.nearx.uikit.widget.keyboard.SecurityKeyboardView.OnKeyboardActionListener
    public void onText(CharSequence charSequence) {
    }

    public void registerObserver() {
        try {
            if (this.mSeparateContentObserver == null) {
                this.mSeparateContentObserver = new ContentObserver(new Handler()) { // from class: com.heytap.nearx.uikit.widget.keyboard.NearKeyboardHelper.1
                    @Override // android.database.ContentObserver
                    public void onChange(boolean z) {
                        super.onChange(z);
                        boolean z2 = Settings.System.getInt(NearKeyboardHelper.this.mContext.getContentResolver(), "use_separate_keyboard", 0) != 0;
                        if (z2 != NearKeyboardHelper.this.mIsUseSeparateKeyboard) {
                            Log.d(NearKeyboardHelper.TAG, "SeparateContentObserver onChange: " + z2);
                            NearKeyboardHelper.this.mIsUseSeparateKeyboard = z2;
                            SecurityKeyboard keyboard = NearKeyboardHelper.this.mKeyboardView.getKeyboard();
                            if (NearKeyboardHelper.this.mQwertyKeyboard.equals(keyboard) || NearKeyboardHelper.this.mSeparateQwertyKeyboard.equals(keyboard)) {
                                NearKeyboardHelper nearKeyboardHelper = NearKeyboardHelper.this;
                                NearKeyboardHelper.this.mKeyboardView.setKeyboard(nearKeyboardHelper.getCorrespondingKeyboard(nearKeyboardHelper.mQwertyKeyboard, NearKeyboardHelper.this.mSeparateQwertyKeyboard));
                            } else if (NearKeyboardHelper.this.mSymbolsKeyboard.equals(keyboard) || NearKeyboardHelper.this.mSeparateSymbolsKeyboard.equals(keyboard)) {
                                NearKeyboardHelper nearKeyboardHelper2 = NearKeyboardHelper.this;
                                NearKeyboardHelper.this.mKeyboardView.setKeyboard(nearKeyboardHelper2.getCorrespondingKeyboard(nearKeyboardHelper2.mSymbolsKeyboard, NearKeyboardHelper.this.mSeparateSymbolsKeyboard));
                            } else if (NearKeyboardHelper.this.mSpecialSymbolsKeyboard.equals(keyboard) || NearKeyboardHelper.this.mSeparatesSpecialSymbolsKeyboard.equals(keyboard)) {
                                NearKeyboardHelper nearKeyboardHelper3 = NearKeyboardHelper.this;
                                NearKeyboardHelper.this.mKeyboardView.setKeyboard(nearKeyboardHelper3.getCorrespondingKeyboard(nearKeyboardHelper3.mSpecialSymbolsKeyboard, NearKeyboardHelper.this.mSeparatesSpecialSymbolsKeyboard));
                            }
                        }
                    }
                };
                this.mContext.getContentResolver().registerContentObserver(Settings.System.getUriFor("use_separate_keyboard"), true, this.mSeparateContentObserver);
            }
            if (this.mVibrationObserver == null) {
                this.mVibrationObserver = new ContentObserver(new Handler()) { // from class: com.heytap.nearx.uikit.widget.keyboard.NearKeyboardHelper.2
                    @Override // android.database.ContentObserver
                    public void onChange(boolean z) {
                        super.onChange(z);
                        NearKeyboardHelper nearKeyboardHelper = NearKeyboardHelper.this;
                        nearKeyboardHelper.mEnableHaptics = !nearKeyboardHelper.mEnableHaptics;
                        Log.d(NearKeyboardHelper.TAG, "VibrationObserver onChange: " + NearKeyboardHelper.this.mEnableHaptics);
                    }
                };
                this.mContext.getContentResolver().registerContentObserver(Settings.System.getUriFor("input_method_key_vibration"), true, this.mVibrationObserver);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setEnableHaptics(boolean z) {
        this.mEnableHaptics = z;
    }

    public void setKeyboardMode(int i) {
        Settings.System.getInt(this.mContext.getContentResolver(), "show_password", 1);
        if (i == 1) {
            this.mKeyboardView.setKeyboard(getCorrespondingKeyboard(this.mQwertyKeyboard, this.mSeparateQwertyKeyboard));
            this.mKeyboardState = 1;
        } else if (i == 2) {
            this.mKeyboardView.setKeyboard(getCorrespondingKeyboard(this.mSymbolsKeyboard, this.mSeparateSymbolsKeyboard));
            this.mKeyboardState = 1;
        } else if (i == 3) {
            this.mKeyboardView.setKeyboard(this.mNumberKeyboard);
        } else if (i == 4) {
            this.mKeyboardView.setKeyboard(getCorrespondingKeyboard(this.mSpecialSymbolsKeyboard, this.mSeparatesSpecialSymbolsKeyboard));
        }
        this.mKeyboardView.setPreviewEnabled(i != 3);
        this.mKeyboardType = i;
        handleShift(true);
    }

    public void setUseSeparateKeyboard(boolean z) {
        this.mIsUseSeparateKeyboard = z;
    }

    public void setVibratePattern(int i) {
        try {
            this.mContext.getResources().getIntArray(i);
        } catch (Resources.NotFoundException e2) {
            if (i != 0) {
                Log.e(TAG, "Vibrate pattern missing", e2);
            }
        }
    }

    @Override // com.heytap.nearx.uikit.widget.keyboard.SecurityKeyboardView.OnKeyboardActionListener
    public void swipeDown() {
    }

    @Override // com.heytap.nearx.uikit.widget.keyboard.SecurityKeyboardView.OnKeyboardActionListener
    public void swipeLeft() {
    }

    @Override // com.heytap.nearx.uikit.widget.keyboard.SecurityKeyboardView.OnKeyboardActionListener
    public void swipeRight() {
    }

    @Override // com.heytap.nearx.uikit.widget.keyboard.SecurityKeyboardView.OnKeyboardActionListener
    public void swipeUp() {
    }

    public void updateEndKey(CharSequence charSequence) {
        CharSequence text = this.mContext.getResources().getText(R$string.nx_ime_action_done);
        Iterator<SecurityKeyboard> it = this.mKeyboards.iterator();
        while (it.hasNext()) {
            for (SecurityKeyboard.Key key : it.next().getKeys()) {
                if (key.codes[0] == 10) {
                    key.label = charSequence != null ? charSequence : text;
                    key.icon = null;
                    break;
                }
            }
        }
        this.mKeyboardView.invalidateAllKeys();
    }

    public void updateEndKey(Drawable drawable) {
        Iterator<SecurityKeyboard> it = this.mKeyboards.iterator();
        while (it.hasNext()) {
            for (SecurityKeyboard.Key key : it.next().getKeys()) {
                if (key.codes[0] == 10) {
                    key.label = null;
                    key.icon = drawable;
                    break;
                }
            }
        }
        this.mKeyboardView.invalidateAllKeys();
    }
}
