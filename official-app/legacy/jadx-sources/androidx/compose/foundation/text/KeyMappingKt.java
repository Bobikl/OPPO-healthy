package androidx.compose.foundation.text;

import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.PropertyReference1Impl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001f\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0000ø\u0001\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"defaultKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "getDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "commonKeyMapping", "shortcutModifier", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class KeyMappingKt {

    @NotNull
    private static final KeyMapping defaultKeyMapping;

    static {
        final KeyMapping keyMappingCommonKeyMapping = commonKeyMapping(new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
            @Override // p010kotlin.jvm.internal.PropertyReference1Impl, p010kotlin.reflect.KProperty1
            @Nullable
            public Object get(@Nullable Object obj) {
                return Boolean.valueOf(KeyEvent_androidKt.m2885isCtrlPressedZmokQxo(((KeyEvent) obj).m2870unboximpl()));
            }
        });
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            @Nullable
            /* JADX INFO: renamed from: map-ZmokQxo */
            public KeyCommand mo728mapZmokQxo(@NotNull android.view.KeyEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m2887isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m2885isCtrlPressedZmokQxo(event)) {
                    long jM2881getKeyZmokQxo = KeyEvent_androidKt.m2881getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo, mappedKeys.m748getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo, mappedKeys.m749getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo, mappedKeys.m750getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo, mappedKeys.m747getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m2885isCtrlPressedZmokQxo(event)) {
                    long jM2881getKeyZmokQxo2 = KeyEvent_androidKt.m2881getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo2, mappedKeys2.m748getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo2, mappedKeys2.m749getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo2, mappedKeys2.m750getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo2, mappedKeys2.m747getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo2, mappedKeys2.m752getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo2, mappedKeys2.m746getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo2, mappedKeys2.m742getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo2, mappedKeys2.m741getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m2887isShiftPressedZmokQxo(event)) {
                    long jM2881getKeyZmokQxo3 = KeyEvent_androidKt.m2881getKeyZmokQxo(event);
                    MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                    if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo3, mappedKeys3.m755getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_HOME;
                    } else if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo3, mappedKeys3.m754getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_END;
                    }
                } else if (KeyEvent_androidKt.m2884isAltPressedZmokQxo(event)) {
                    long jM2881getKeyZmokQxo4 = KeyEvent_androidKt.m2881getKeyZmokQxo(event);
                    MappedKeys mappedKeys4 = MappedKeys.INSTANCE;
                    if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo4, mappedKeys4.m742getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                    } else if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo4, mappedKeys4.m746getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_TO_LINE_END;
                    }
                }
                return keyCommand == null ? keyMappingCommonKeyMapping.mo728mapZmokQxo(event) : keyCommand;
            }
        };
    }

    @NotNull
    public static final KeyMapping commonKeyMapping(@NotNull final Function1<? super KeyEvent, Boolean> shortcutModifier) {
        Intrinsics.checkNotNullParameter(shortcutModifier, "shortcutModifier");
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt.commonKeyMapping.1
            @Override // androidx.compose.foundation.text.KeyMapping
            @Nullable
            /* JADX INFO: renamed from: map-ZmokQxo */
            public KeyCommand mo728mapZmokQxo(@NotNull android.view.KeyEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                if (shortcutModifier.invoke(KeyEvent.m2864boximpl(event)).booleanValue() && KeyEvent_androidKt.m2887isShiftPressedZmokQxo(event)) {
                    if (Key.m2286equalsimpl0(KeyEvent_androidKt.m2881getKeyZmokQxo(event), MappedKeys.INSTANCE.m763getZEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    return null;
                }
                if (shortcutModifier.invoke(KeyEvent.m2864boximpl(event)).booleanValue()) {
                    long jM2881getKeyZmokQxo = KeyEvent_androidKt.m2881getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo, mappedKeys.m743getCEK5gGoQ()) ? true : Key.m2286equalsimpl0(jM2881getKeyZmokQxo, mappedKeys.m753getInsertEK5gGoQ())) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo, mappedKeys.m760getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo, mappedKeys.m761getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo, mappedKeys.m740getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo, mappedKeys.m762getYEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo, mappedKeys.m763getZEK5gGoQ())) {
                        return KeyCommand.UNDO;
                    }
                    return null;
                }
                if (KeyEvent_androidKt.m2885isCtrlPressedZmokQxo(event)) {
                    return null;
                }
                if (KeyEvent_androidKt.m2887isShiftPressedZmokQxo(event)) {
                    long jM2881getKeyZmokQxo2 = KeyEvent_androidKt.m2881getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo2, mappedKeys2.m748getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo2, mappedKeys2.m749getDirectionRightEK5gGoQ())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo2, mappedKeys2.m750getDirectionUpEK5gGoQ())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo2, mappedKeys2.m747getDirectionDownEK5gGoQ())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo2, mappedKeys2.m757getPageUpEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo2, mappedKeys2.m756getPageDownEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo2, mappedKeys2.m755getMoveHomeEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo2, mappedKeys2.m754getMoveEndEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo2, mappedKeys2.m753getInsertEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    return null;
                }
                long jM2881getKeyZmokQxo3 = KeyEvent_androidKt.m2881getKeyZmokQxo(event);
                MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo3, mappedKeys3.m748getDirectionLeftEK5gGoQ())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo3, mappedKeys3.m749getDirectionRightEK5gGoQ())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo3, mappedKeys3.m750getDirectionUpEK5gGoQ())) {
                    return KeyCommand.UP;
                }
                if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo3, mappedKeys3.m747getDirectionDownEK5gGoQ())) {
                    return KeyCommand.DOWN;
                }
                if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo3, mappedKeys3.m757getPageUpEK5gGoQ())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo3, mappedKeys3.m756getPageDownEK5gGoQ())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo3, mappedKeys3.m755getMoveHomeEK5gGoQ())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo3, mappedKeys3.m754getMoveEndEK5gGoQ())) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo3, mappedKeys3.m751getEnterEK5gGoQ())) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo3, mappedKeys3.m742getBackspaceEK5gGoQ())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo3, mappedKeys3.m746getDeleteEK5gGoQ())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo3, mappedKeys3.m758getPasteEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo3, mappedKeys3.m745getCutEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo3, mappedKeys3.m744getCopyEK5gGoQ())) {
                    return KeyCommand.COPY;
                }
                if (Key.m2286equalsimpl0(jM2881getKeyZmokQxo3, mappedKeys3.m759getTabEK5gGoQ())) {
                    return KeyCommand.TAB;
                }
                return null;
            }
        };
    }

    @NotNull
    public static final KeyMapping getDefaultKeyMapping() {
        return defaultKeyMapping;
    }
}
