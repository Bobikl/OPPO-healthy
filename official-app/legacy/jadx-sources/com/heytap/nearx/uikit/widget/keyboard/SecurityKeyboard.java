package com.heytap.nearx.uikit.widget.keyboard;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.keyboard.util.ScreenConfigUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes18.dex */
public class SecurityKeyboard {
    public static final int EDGE_BOTTOM = 8;
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 2;
    public static final int EDGE_TOP = 4;
    private static final int GRID_HEIGHT = 5;
    private static final int GRID_SIZE = 50;
    private static final int GRID_WIDTH = 10;
    private static final int KEYBOARD_STATE_CAPSLOCK = 2;
    private static final int KEYBOARD_STATE_NORMAL = 0;
    private static final int KEYBOARD_STATE_SHIFTED = 1;
    public static final int KEYCODE_ALT = -6;
    public static final int KEYCODE_CANCEL = -3;
    public static final int KEYCODE_CHANGE_SYMBOLS = -7;
    public static final int KEYCODE_DELETE = -5;
    public static final int KEYCODE_DONE = -4;
    public static final int KEYCODE_GO = 10;
    public static final int KEYCODE_MODE_CHANGE = -2;
    public static final int KEYCODE_SHIFT = -1;
    public static final int KEYCODE_SPACE = 32;
    private static float SEARCH_DISTANCE = 1.8f;
    public static final int SECURITYKEYBOARD = 1;
    static final String TAG = "SecurityKeyboard";
    private static final String TAG_KEY = "Key";
    private static final String TAG_KEYBOARD = "Keyboard";
    private static final String TAG_ROW = "Row";
    public static final int TYPE_NUMBER = 3;
    public static final int TYPE_QWERTY = 1;
    public static final int TYPE_SEPARATE_QWERTY = 5;
    public static final int TYPE_SEPARATE_SPECIAL_SYMBOLS = 7;
    public static final int TYPE_SEPARATE_SYMBOLS = 6;
    public static final int TYPE_SPECIAL_SYMBOLS = 4;
    public static final int TYPE_SYSMBOLS = 2;
    public static final int UNLOCKKEYBOARD = 2;
    private int mCellHeight;
    private int mCellWidth;
    private int mDefaultHeight;
    private int mDefaultHorizontalGap;
    private int mDefaultVerticalGap;
    private int mDefaultWidth;
    private int mDisplayHeight;
    private int mDisplayWidth;
    private int[][] mGridNeighbors;
    private int mKeyHeight;
    private int mKeyWidth;
    private int mKeyboardMode;
    private int mKeyboardType;
    private List<Key> mKeys;
    private CharSequence mLabel;
    private List<Key> mModifierKeys;
    private int mNewShifted;
    private int mProximityThreshold;
    private int[] mShiftKeyIndices;
    private Key[] mShiftKeys;
    private boolean mShifted;
    private int mTotalHeight;
    private int mTotalWidth;
    private ArrayList<Row> rows;

    public SecurityKeyboard(Context context, int i) {
        this(context, i, 0);
    }

    private void computeNearestNeighbors() {
        this.mCellWidth = ((getMinWidth() + 10) - 1) / 10;
        this.mCellHeight = ((getHeight() + 5) - 1) / 5;
        this.mGridNeighbors = new int[50][];
        int[] iArr = new int[this.mKeys.size()];
        int i = this.mCellWidth * 10;
        int i2 = this.mCellHeight * 5;
        int i3 = 0;
        while (i3 < i) {
            int i4 = 0;
            while (i4 < i2) {
                int i5 = 0;
                for (int i6 = 0; i6 < this.mKeys.size(); i6++) {
                    Key key = this.mKeys.get(i6);
                    if (key.squaredDistanceFrom(i3, i4) < this.mProximityThreshold || key.squaredDistanceFrom((this.mCellWidth + i3) - 1, i4) < this.mProximityThreshold || key.squaredDistanceFrom((this.mCellWidth + i3) - 1, (this.mCellHeight + i4) - 1) < this.mProximityThreshold || key.squaredDistanceFrom(i3, (this.mCellHeight + i4) - 1) < this.mProximityThreshold) {
                        iArr[i5] = i6;
                        i5++;
                    }
                }
                int[] iArr2 = new int[i5];
                System.arraycopy(iArr, 0, iArr2, 0, i5);
                int[][] iArr3 = this.mGridNeighbors;
                int i7 = this.mCellHeight;
                iArr3[((i4 / i7) * 10) + (i3 / this.mCellWidth)] = iArr2;
                i4 += i7;
            }
            i3 += this.mCellWidth;
        }
    }

    public static float getDensityScale(Context context) {
        float f;
        float f2;
        if (ScreenConfigUtil.isFoldScreen(context) || ScreenConfigUtil.isPad(context)) {
            f = DisplayMetrics.DENSITY_DEVICE_STABLE;
            f2 = context.getResources().getDisplayMetrics().densityDpi;
        } else {
            f = (context.getResources().getConfiguration().orientation == 1 ? context.getResources().getDisplayMetrics().widthPixels : context.getResources().getDisplayMetrics().heightPixels) / 360.0f;
            f2 = context.getResources().getDisplayMetrics().densityDpi / 160.0f;
        }
        return f / f2;
    }

    public static int getDimensionOrFraction(TypedArray typedArray, int i, int i2, int i3) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue == null) {
            return i3;
        }
        int i4 = typedValuePeekValue.type;
        if (i4 == 5) {
            return Math.round(typedArray.getDimension(i, i3));
        }
        return i4 == 6 ? Math.round(typedArray.getFraction(i, i2, i2, i3)) : i3;
    }

    private void loadKeyboard(Context context, XmlResourceParser xmlResourceParser) {
        Row rowCreateRowFromXml;
        Resources resources = context.getResources();
        Key keyCreateKeyFromXml = null;
        Row row = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            int i3 = i2;
            while (true) {
                try {
                    int next = xmlResourceParser.next();
                    if (next == 1) {
                        break loop0;
                    }
                    if (next == 2) {
                        String name = xmlResourceParser.getName();
                        if (TAG_ROW.equals(name)) {
                            rowCreateRowFromXml = createRowFromXml(resources, xmlResourceParser);
                            this.rows.add(rowCreateRowFromXml);
                            int i4 = rowCreateRowFromXml.mode;
                            if ((i4 == 0 || i4 == this.mKeyboardMode) ? false : true) {
                                break;
                            }
                            row = rowCreateRowFromXml;
                            i3 = 0;
                            i2 = 1;
                        } else if (TAG_KEY.equals(name)) {
                            keyCreateKeyFromXml = createKeyFromXml(resources, row, i3, i, xmlResourceParser);
                            this.mKeys.add(keyCreateKeyFromXml);
                            int i5 = keyCreateKeyFromXml.codes[0];
                            if (i5 == -1) {
                                int i6 = 0;
                                while (true) {
                                    Key[] keyArr = this.mShiftKeys;
                                    if (i6 >= keyArr.length) {
                                        break;
                                    }
                                    if (keyArr[i6] == null) {
                                        keyArr[i6] = keyCreateKeyFromXml;
                                        this.mShiftKeyIndices[i6] = this.mKeys.size() - 1;
                                        break;
                                    }
                                    i6++;
                                }
                                this.mModifierKeys.add(keyCreateKeyFromXml);
                            } else if (i5 == -6) {
                                this.mModifierKeys.add(keyCreateKeyFromXml);
                            }
                            row.mKeys.add(keyCreateKeyFromXml);
                            z = true;
                        } else if (TAG_KEYBOARD.equals(name)) {
                            parseKeyboardAttributes(resources, xmlResourceParser);
                        }
                    } else if (next == 3) {
                        if (z) {
                            i3 += keyCreateKeyFromXml.gap + keyCreateKeyFromXml.width;
                            if (i3 > this.mTotalWidth) {
                                this.mTotalWidth = i3;
                            }
                            z = false;
                        } else if (i2 != 0) {
                            i = i + row.verticalGap + row.defaultHeight;
                            i2 = 0;
                        }
                    }
                } catch (Exception e2) {
                    Log.e(TAG, "Parse error:" + e2);
                    e2.printStackTrace();
                }
            }
            skipToEndOfRow(xmlResourceParser);
            row = rowCreateRowFromXml;
            i2 = 0;
        }
        this.mTotalHeight = i - this.mDefaultVerticalGap;
    }

    private void parseKeyboardAttributes(Resources resources, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.NearSecurityKeyboard);
        int i = R$styleable.NearSecurityKeyboard_nxKeyWidth;
        int i2 = this.mDisplayWidth;
        this.mDefaultWidth = getDimensionOrFraction(typedArrayObtainAttributes, i, i2, i2 / 10);
        this.mDefaultHeight = getDimensionOrFraction(typedArrayObtainAttributes, R$styleable.NearSecurityKeyboard_nxKeyHeight, this.mDisplayHeight, 50);
        this.mDefaultHorizontalGap = getDimensionOrFraction(typedArrayObtainAttributes, R$styleable.NearSecurityKeyboard_nxHorizontalGap, this.mDisplayWidth, 0);
        this.mDefaultVerticalGap = getDimensionOrFraction(typedArrayObtainAttributes, R$styleable.NearSecurityKeyboard_nxVerticalGap, this.mDisplayHeight, 0);
        int i3 = (int) (this.mDefaultWidth * SEARCH_DISTANCE);
        this.mProximityThreshold = i3 * i3;
        typedArrayObtainAttributes.recycle();
    }

    private void skipToEndOfRow(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            if (next == 3 && xmlResourceParser.getName().equals(TAG_ROW)) {
                return;
            }
        }
    }

    public Key createKeyFromXml(Resources resources, Row row, int i, int i2, XmlResourceParser xmlResourceParser) {
        return new Key(resources, row, i, i2, xmlResourceParser);
    }

    public Row createRowFromXml(Resources resources, XmlResourceParser xmlResourceParser) {
        return new Row(resources, this, xmlResourceParser);
    }

    public int getHeight() {
        return this.mTotalHeight;
    }

    public int getHorizontalGap() {
        return this.mDefaultHorizontalGap;
    }

    public int getKeyHeight() {
        return this.mDefaultHeight;
    }

    public int getKeyWidth() {
        return this.mDefaultWidth;
    }

    public int getKeyboardType() {
        return this.mKeyboardType;
    }

    public List<Key> getKeys() {
        return this.mKeys;
    }

    public int getMinWidth() {
        return this.mTotalWidth;
    }

    public List<Key> getModifierKeys() {
        return this.mModifierKeys;
    }

    public int[] getNearestKeys(int i, int i2) {
        int i3;
        if (this.mGridNeighbors == null) {
            computeNearestNeighbors();
        }
        return (i < 0 || i >= getMinWidth() || i2 < 0 || i2 >= getHeight() || (i3 = ((i2 / this.mCellHeight) * 10) + (i / this.mCellWidth)) >= 50) ? new int[0] : this.mGridNeighbors[i3];
    }

    public int getNewShifted() {
        return this.mNewShifted;
    }

    public int getShiftKeyIndex() {
        return this.mShiftKeyIndices[0];
    }

    public int[] getShiftKeyIndices() {
        return this.mShiftKeyIndices;
    }

    public int getVerticalGap() {
        return this.mDefaultVerticalGap;
    }

    public boolean isShifted() {
        return this.mShifted;
    }

    public void onSecurityResize(Context context) {
        float densityScale = getDensityScale(context);
        int size = this.rows.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Row row = this.rows.get(i2);
            int size2 = row.mKeys.size();
            row.verticalGap = (int) (row.verticalGap * densityScale);
            row.defaultHorizontalGap = (int) (row.defaultHorizontalGap * densityScale);
            row.defaultHeight = (int) (row.defaultHeight * densityScale);
            row.defaultWidth = (int) (row.defaultWidth * densityScale);
            int i3 = 0;
            for (int i4 = 0; i4 < size2; i4++) {
                Key key = row.mKeys.get(i4);
                int i5 = (int) (key.gap * densityScale);
                key.gap = i5;
                int i6 = i3 + i5;
                key.x = i6;
                key.y = (int) (key.y * densityScale);
                int i7 = (int) (key.width * densityScale);
                key.width = i7;
                key.height = (int) (key.height * densityScale);
                i3 = i6 + i7;
                if (i3 > i) {
                    i = i3;
                }
            }
        }
        this.mTotalWidth = i;
        this.mTotalHeight = (int) (this.mTotalHeight * densityScale);
    }

    public final void resize(int i, int i2) {
        int i3 = this.mKeyboardType;
        if (i3 == 2 || i3 == 1) {
            return;
        }
        int size = this.rows.size();
        for (int i4 = 0; i4 < size; i4++) {
            Row row = this.rows.get(i4);
            int size2 = row.mKeys.size();
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < size2; i7++) {
                Key key = row.mKeys.get(i7);
                if (i7 > 0) {
                    i5 += key.gap;
                }
                i6 += key.width;
            }
            if (i5 + i6 > i && i6 != 0) {
                float f = (i - i5) / i6;
                int i8 = 0;
                for (int i9 = 0; i9 < size2; i9++) {
                    Key key2 = row.mKeys.get(i9);
                    int i10 = (int) (key2.width * f);
                    key2.width = i10;
                    key2.x = i8;
                    i8 += i10 + key2.gap;
                }
            }
        }
        this.mTotalWidth = i;
    }

    public void setHorizontalGap(int i) {
        this.mDefaultHorizontalGap = i;
    }

    public void setKeyHeight(int i) {
        this.mDefaultHeight = i;
    }

    public void setKeyWidth(int i) {
        this.mDefaultWidth = i;
    }

    public void setKeyboardType(int i) {
        this.mKeyboardType = i;
    }

    public void setNewShifted(int i) {
        for (Key key : this.mShiftKeys) {
            if (key != null) {
                if (i == 1 || i == 2) {
                    key.on = true;
                } else if (i == 0) {
                    key.on = false;
                }
            }
        }
        this.mNewShifted = i;
    }

    public boolean setShifted(boolean z) {
        for (Key key : this.mShiftKeys) {
            if (key != null) {
                key.on = z;
            }
        }
        if (this.mShifted == z) {
            return false;
        }
        this.mShifted = z;
        return true;
    }

    public void setVerticalGap(int i) {
        this.mDefaultVerticalGap = i;
    }

    public SecurityKeyboard(Context context, int i, int i2, int i3, int i4) {
        this.mNewShifted = 0;
        this.mShiftKeys = new Key[]{null, null};
        this.mShiftKeyIndices = new int[]{-1, -1};
        this.rows = new ArrayList<>();
        this.mKeyboardType = 0;
        this.mDisplayWidth = i3;
        this.mDisplayHeight = i4;
        this.mDefaultHorizontalGap = 0;
        int i5 = i3 / 10;
        this.mDefaultWidth = i5;
        this.mDefaultVerticalGap = 0;
        this.mDefaultHeight = i5;
        this.mKeys = new ArrayList();
        this.mModifierKeys = new ArrayList();
        this.mKeyboardMode = i2;
        loadKeyboard(context, context.getResources().getXml(i));
    }

    public static class Row {
        public int defaultHeight;
        public int defaultHorizontalGap;
        public int defaultWidth;
        ArrayList<Key> mKeys = new ArrayList<>();
        public int mode;
        private SecurityKeyboard parent;
        public int rowEdgeFlags;
        public int verticalGap;

        public Row(SecurityKeyboard securityKeyboard) {
            this.parent = securityKeyboard;
        }

        public Row(Resources resources, SecurityKeyboard securityKeyboard, XmlResourceParser xmlResourceParser) {
            this.parent = securityKeyboard;
            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.NearSecurityKeyboard);
            this.defaultWidth = SecurityKeyboard.getDimensionOrFraction(typedArrayObtainAttributes, R$styleable.NearSecurityKeyboard_nxKeyWidth, securityKeyboard.mDisplayWidth, securityKeyboard.mDefaultWidth);
            this.defaultHeight = SecurityKeyboard.getDimensionOrFraction(typedArrayObtainAttributes, R$styleable.NearSecurityKeyboard_nxKeyHeight, securityKeyboard.mDisplayHeight, securityKeyboard.mDefaultHeight);
            this.defaultHorizontalGap = SecurityKeyboard.getDimensionOrFraction(typedArrayObtainAttributes, R$styleable.NearSecurityKeyboard_nxHorizontalGap, securityKeyboard.mDisplayWidth, securityKeyboard.mDefaultHorizontalGap);
            this.verticalGap = SecurityKeyboard.getDimensionOrFraction(typedArrayObtainAttributes, R$styleable.NearSecurityKeyboard_nxVerticalGap, securityKeyboard.mDisplayHeight, securityKeyboard.mDefaultVerticalGap);
            TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.NearSecurityKeyboard_Row);
            this.rowEdgeFlags = typedArrayObtainAttributes2.getInt(R$styleable.NearSecurityKeyboard_Row_nxRowEdgeFlags, 0);
            this.mode = typedArrayObtainAttributes2.getResourceId(R$styleable.NearSecurityKeyboard_Row_nxKeyboardMode, 0);
            typedArrayObtainAttributes2.recycle();
        }
    }

    public static class Key {
        public CharSequence announceText;
        public int[] codes;
        public int edgeFlags;
        public int gap;
        public int height;
        public Drawable icon;
        public Drawable iconPreview;
        private SecurityKeyboard keyboard;
        public CharSequence label;
        public boolean modifier;
        public boolean on;
        public CharSequence popupCharacters;
        public int popupResId;
        public boolean pressed;
        public boolean repeatable;
        public boolean sticky;
        public CharSequence text;
        public int width;
        public int x;
        public int y;
        private static final int[] KEY_STATE_NORMAL_ON = {R.attr.state_checkable, R.attr.state_checked};
        private static final int[] KEY_STATE_PRESSED_ON = {16842919, R.attr.state_checkable, R.attr.state_checked};
        private static final int[] KEY_STATE_NORMAL_OFF = {R.attr.state_checkable};
        private static final int[] KEY_STATE_PRESSED_OFF = {16842919, R.attr.state_checkable};
        private static final int[] KEY_STATE_NORMAL = new int[0];
        private static final int[] KEY_STATE_PRESSED = {16842919};

        public Key(Row row) {
            this.announceText = null;
            this.keyboard = row.parent;
            this.height = row.defaultHeight;
            this.width = row.defaultWidth;
            this.gap = row.defaultHorizontalGap;
            this.edgeFlags = row.rowEdgeFlags;
        }

        public int[] getCurrentDrawableState() {
            int[] iArr = KEY_STATE_NORMAL;
            if (this.on) {
                return this.pressed ? KEY_STATE_PRESSED_ON : KEY_STATE_NORMAL_ON;
            }
            if (this.sticky) {
                return this.pressed ? KEY_STATE_PRESSED_OFF : KEY_STATE_NORMAL_OFF;
            }
            return this.pressed ? KEY_STATE_PRESSED : iArr;
        }

        public boolean isInside(int i, int i2, Context context) {
            int i3;
            int i4 = this.edgeFlags;
            boolean z = (i4 & 1) > 0;
            boolean z2 = (i4 & 2) > 0;
            boolean z3 = (i4 & 4) > 0;
            boolean z4 = (i4 & 8) > 0;
            if (ScreenConfigUtil.isPad(context)) {
                int i5 = this.x;
                return i >= i5 && i <= i5 + this.width && i2 >= (i3 = this.y) && i2 <= i3 + this.height;
            }
            int i6 = this.x;
            if (i < i6 && (!z || i > this.width + i6)) {
                return false;
            }
            if (i >= this.width + i6 && (!z2 || i < i6)) {
                return false;
            }
            int i7 = this.y;
            if (i2 >= i7 || (z3 && i2 <= this.height + i7)) {
                return i2 < this.height + i7 || (z4 && i2 >= i7);
            }
            return false;
        }

        public void onPressed() {
            this.pressed = !this.pressed;
            Drawable drawable = this.icon;
            if (drawable != null) {
                drawable.setState(getCurrentDrawableState());
            }
        }

        public void onReleased(boolean z) {
            this.pressed = !this.pressed;
            if (this.sticky && z) {
                this.on = !this.on;
            }
            Drawable drawable = this.icon;
            if (drawable != null) {
                drawable.setState(getCurrentDrawableState());
            }
        }

        public int[] parseCSV(String str) {
            int i;
            int i2 = 0;
            if (str.length() > 0) {
                i = 1;
                int iIndexOf = 0;
                while (true) {
                    iIndexOf = str.indexOf(",", iIndexOf + 1);
                    if (iIndexOf <= 0) {
                        break;
                    }
                    i++;
                }
            } else {
                i = 0;
            }
            int[] iArr = new int[i];
            StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
            while (stringTokenizer.hasMoreTokens()) {
                int i3 = i2 + 1;
                try {
                    iArr[i2] = Integer.parseInt(stringTokenizer.nextToken());
                } catch (NumberFormatException unused) {
                    Log.e(SecurityKeyboard.TAG, "Error parsing keycodes " + str);
                }
                i2 = i3;
            }
            return iArr;
        }

        public int squaredDistanceFrom(int i, int i2) {
            int i3 = (this.x + (this.width / 2)) - i;
            int i4 = (this.y + (this.height / 2)) - i2;
            return (i3 * i3) + (i4 * i4);
        }

        public Key(Resources resources, Row row, int i, int i2, XmlResourceParser xmlResourceParser) {
            this(row);
            this.x = i;
            this.y = i2;
            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.NearSecurityKeyboard);
            this.width = SecurityKeyboard.getDimensionOrFraction(typedArrayObtainAttributes, R$styleable.NearSecurityKeyboard_nxKeyWidth, this.keyboard.mDisplayWidth, row.defaultWidth);
            this.height = SecurityKeyboard.getDimensionOrFraction(typedArrayObtainAttributes, R$styleable.NearSecurityKeyboard_nxKeyHeight, this.keyboard.mDisplayHeight, row.defaultHeight);
            this.gap = SecurityKeyboard.getDimensionOrFraction(typedArrayObtainAttributes, R$styleable.NearSecurityKeyboard_nxHorizontalGap, this.keyboard.mDisplayWidth, row.defaultHorizontalGap);
            typedArrayObtainAttributes.recycle();
            TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.NearSecurityKeyboard_Key);
            this.x += this.gap;
            TypedValue typedValue = new TypedValue();
            typedArrayObtainAttributes2.getValue(R$styleable.NearSecurityKeyboard_Key_nxCodes, typedValue);
            int i3 = typedValue.type;
            if (i3 == 16 || i3 == 17) {
                this.codes = new int[]{typedValue.data};
            } else if (i3 == 3) {
                this.codes = parseCSV(typedValue.string.toString());
            }
            Drawable drawable = typedArrayObtainAttributes2.getDrawable(R$styleable.NearSecurityKeyboard_Key_nxIconPreview);
            this.iconPreview = drawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.iconPreview.getIntrinsicHeight());
            }
            this.popupCharacters = typedArrayObtainAttributes2.getText(R$styleable.NearSecurityKeyboard_Key_nxPopupCharacters);
            this.popupResId = typedArrayObtainAttributes2.getResourceId(R$styleable.NearSecurityKeyboard_Key_nxPopupKeyboard, 0);
            this.repeatable = typedArrayObtainAttributes2.getBoolean(R$styleable.NearSecurityKeyboard_Key_nxIsRepeatable, false);
            this.modifier = typedArrayObtainAttributes2.getBoolean(R$styleable.NearSecurityKeyboard_Key_nxIsModifier, false);
            this.sticky = typedArrayObtainAttributes2.getBoolean(R$styleable.NearSecurityKeyboard_Key_nxIsSticky, false);
            this.edgeFlags = row.rowEdgeFlags | typedArrayObtainAttributes2.getInt(R$styleable.NearSecurityKeyboard_Key_nxKeyEdgeFlags, 0);
            Drawable drawable2 = typedArrayObtainAttributes2.getDrawable(R$styleable.NearSecurityKeyboard_Key_nxKeyIcon);
            this.icon = drawable2;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.icon.getIntrinsicHeight());
            }
            this.label = typedArrayObtainAttributes2.getText(R$styleable.NearSecurityKeyboard_Key_nxKeyLabel);
            this.text = typedArrayObtainAttributes2.getText(R$styleable.NearSecurityKeyboard_Key_nxKeyOutputText);
            this.announceText = typedArrayObtainAttributes2.getText(R$styleable.NearSecurityKeyboard_Key_nxKeyAnnounce);
            if (this.codes == null && !TextUtils.isEmpty(this.label)) {
                this.codes = new int[]{this.label.charAt(0)};
            }
            typedArrayObtainAttributes2.recycle();
        }
    }

    public SecurityKeyboard(Context context, int i, int i2) {
        this.mNewShifted = 0;
        this.mShiftKeys = new Key[]{null, null};
        this.mShiftKeyIndices = new int[]{-1, -1};
        this.rows = new ArrayList<>();
        this.mKeyboardType = 0;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i3 = displayMetrics.widthPixels;
        this.mDisplayWidth = i3;
        this.mDisplayHeight = displayMetrics.heightPixels;
        this.mDefaultHorizontalGap = 0;
        int i4 = i3 / 10;
        this.mDefaultWidth = i4;
        this.mDefaultVerticalGap = 0;
        this.mDefaultHeight = i4;
        this.mKeys = new ArrayList();
        this.mModifierKeys = new ArrayList();
        this.mKeyboardMode = i2;
        loadKeyboard(context, context.getResources().getXml(i));
        onSecurityResize(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SecurityKeyboard(Context context, int i, CharSequence charSequence, int i2, int i3) {
        this(context, i);
        this.mTotalWidth = 0;
        Row row = new Row(this);
        row.defaultHeight = this.mDefaultHeight;
        row.defaultWidth = this.mDefaultWidth;
        row.defaultHorizontalGap = this.mDefaultHorizontalGap;
        row.verticalGap = this.mDefaultVerticalGap;
        row.rowEdgeFlags = 12;
        i2 = i2 == -1 ? Integer.MAX_VALUE : i2;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            int iCharAt = charSequence.charAt(i7);
            if (i5 >= i2 || this.mDefaultWidth + i6 + i3 > this.mDisplayWidth) {
                i4 += this.mDefaultVerticalGap + this.mDefaultHeight;
                i5 = 0;
                i6 = 0;
            }
            Key key = new Key(row);
            key.x = i6;
            key.y = i4;
            key.label = String.valueOf((char) iCharAt);
            key.codes = new int[]{iCharAt};
            i5++;
            i6 += key.width + key.gap;
            this.mKeys.add(key);
            row.mKeys.add(key);
            if (i6 > this.mTotalWidth) {
                this.mTotalWidth = i6;
            }
        }
        this.mTotalHeight = i4 + this.mDefaultHeight;
        this.rows.add(row);
    }
}
