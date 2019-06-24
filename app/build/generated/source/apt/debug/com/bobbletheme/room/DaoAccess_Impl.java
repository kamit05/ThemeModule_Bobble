package com.bobbletheme.room;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class DaoAccess_Impl implements DaoAccess {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfThemeModel;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfThemeModel;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfThemeModel;

  public DaoAccess_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfThemeModel = new EntityInsertionAdapter<ThemeModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `theme`(`themeId`,`isLightTheme`,`hintLetterColor`,`themeBackgroundImageHDPIURL`,`keyBorderRadius`,`keyBackgroundColor`,`suggestionsColorValidTypedWord`,`themeBackgroundImageXXHDPIURL`,`swipeGestureTrailColor`,`moreSuggestionsButtonBackgroundColor`,`suggestionsColorSuggested`,`themePreviewImageHDPIURL`,`gestureFloatingPreviewTextColor`,`functionalTextColor`,`suggestionsBarPageIndicatorColor`,`suggestionsColorAutoCorrect`,`themePreviewImageORIGINALURL`,`keyPopUpPreviewBackgroundColor`,`feedbackBarPopupBackgroundColor`,`keyboardBackgroundColor`,`themeBackgroundImageXHDPIURL`,`themePreviewImageXHDPIURL`,`themePreviewImageXXHDPIURL`,`keyTextColor`,`themeType`,`themeBackgroundImageORIGINALURL`,`moreSuggestionsPanelBackgroundColor`,`themeName`,`emojiRowBackgroundColor`,`suggestionsColorTypedWord`,`keyVerticalGap`,`enterKeyBorderRadius`,`hintLabelColor`,`suggestionsBarIconSelectedColor`,`showNonAlphaKeyBorder`,`bobbleBar`,`enterKeyCircleBackgroundColor`,`gestureFloatingPreviewColor`,`keyboardBackgroundOpacity`,`suggestionsBarBackgroundColor`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ThemeModel value) {
        stmt.bindLong(1, value.themeId);
        if (value.isLightTheme == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.isLightTheme);
        }
        if (value.hintLetterColor == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.hintLetterColor);
        }
        if (value.themeBackgroundImageHDPIURL == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.themeBackgroundImageHDPIURL);
        }
        if (value.keyBorderRadius == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.keyBorderRadius);
        }
        if (value.keyBackgroundColor == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.keyBackgroundColor);
        }
        if (value.suggestionsColorValidTypedWord == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.suggestionsColorValidTypedWord);
        }
        if (value.themeBackgroundImageXXHDPIURL == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.themeBackgroundImageXXHDPIURL);
        }
        if (value.swipeGestureTrailColor == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.swipeGestureTrailColor);
        }
        if (value.moreSuggestionsButtonBackgroundColor == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.moreSuggestionsButtonBackgroundColor);
        }
        if (value.suggestionsColorSuggested == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.suggestionsColorSuggested);
        }
        if (value.themePreviewImageHDPIURL == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.themePreviewImageHDPIURL);
        }
        if (value.gestureFloatingPreviewTextColor == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.gestureFloatingPreviewTextColor);
        }
        if (value.functionalTextColor == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.functionalTextColor);
        }
        if (value.suggestionsBarPageIndicatorColor == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.suggestionsBarPageIndicatorColor);
        }
        if (value.suggestionsColorAutoCorrect == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.suggestionsColorAutoCorrect);
        }
        if (value.themePreviewImageORIGINALURL == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.themePreviewImageORIGINALURL);
        }
        if (value.keyPopUpPreviewBackgroundColor == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.keyPopUpPreviewBackgroundColor);
        }
        if (value.feedbackBarPopupBackgroundColor == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.feedbackBarPopupBackgroundColor);
        }
        if (value.keyboardBackgroundColor == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.keyboardBackgroundColor);
        }
        if (value.themeBackgroundImageXHDPIURL == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.themeBackgroundImageXHDPIURL);
        }
        if (value.themePreviewImageXHDPIURL == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.themePreviewImageXHDPIURL);
        }
        if (value.themePreviewImageXXHDPIURL == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.themePreviewImageXXHDPIURL);
        }
        if (value.keyTextColor == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, value.keyTextColor);
        }
        if (value.themeType == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindString(25, value.themeType);
        }
        if (value.themeBackgroundImageORIGINALURL == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, value.themeBackgroundImageORIGINALURL);
        }
        if (value.moreSuggestionsPanelBackgroundColor == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, value.moreSuggestionsPanelBackgroundColor);
        }
        if (value.themeName == null) {
          stmt.bindNull(28);
        } else {
          stmt.bindString(28, value.themeName);
        }
        if (value.emojiRowBackgroundColor == null) {
          stmt.bindNull(29);
        } else {
          stmt.bindString(29, value.emojiRowBackgroundColor);
        }
        if (value.suggestionsColorTypedWord == null) {
          stmt.bindNull(30);
        } else {
          stmt.bindString(30, value.suggestionsColorTypedWord);
        }
        if (value.keyVerticalGap == null) {
          stmt.bindNull(31);
        } else {
          stmt.bindString(31, value.keyVerticalGap);
        }
        if (value.enterKeyBorderRadius == null) {
          stmt.bindNull(32);
        } else {
          stmt.bindString(32, value.enterKeyBorderRadius);
        }
        if (value.hintLabelColor == null) {
          stmt.bindNull(33);
        } else {
          stmt.bindString(33, value.hintLabelColor);
        }
        if (value.suggestionsBarIconSelectedColor == null) {
          stmt.bindNull(34);
        } else {
          stmt.bindString(34, value.suggestionsBarIconSelectedColor);
        }
        if (value.showNonAlphaKeyBorder == null) {
          stmt.bindNull(35);
        } else {
          stmt.bindString(35, value.showNonAlphaKeyBorder);
        }
        if (value.bobbleBar == null) {
          stmt.bindNull(36);
        } else {
          stmt.bindString(36, value.bobbleBar);
        }
        if (value.enterKeyCircleBackgroundColor == null) {
          stmt.bindNull(37);
        } else {
          stmt.bindString(37, value.enterKeyCircleBackgroundColor);
        }
        if (value.gestureFloatingPreviewColor == null) {
          stmt.bindNull(38);
        } else {
          stmt.bindString(38, value.gestureFloatingPreviewColor);
        }
        if (value.keyboardBackgroundOpacity == null) {
          stmt.bindNull(39);
        } else {
          stmt.bindString(39, value.keyboardBackgroundOpacity);
        }
        if (value.suggestionsBarBackgroundColor == null) {
          stmt.bindNull(40);
        } else {
          stmt.bindString(40, value.suggestionsBarBackgroundColor);
        }
      }
    };
    this.__deletionAdapterOfThemeModel = new EntityDeletionOrUpdateAdapter<ThemeModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `theme` WHERE `themeId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ThemeModel value) {
        stmt.bindLong(1, value.themeId);
      }
    };
    this.__updateAdapterOfThemeModel = new EntityDeletionOrUpdateAdapter<ThemeModel>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `theme` SET `themeId` = ?,`isLightTheme` = ?,`hintLetterColor` = ?,`themeBackgroundImageHDPIURL` = ?,`keyBorderRadius` = ?,`keyBackgroundColor` = ?,`suggestionsColorValidTypedWord` = ?,`themeBackgroundImageXXHDPIURL` = ?,`swipeGestureTrailColor` = ?,`moreSuggestionsButtonBackgroundColor` = ?,`suggestionsColorSuggested` = ?,`themePreviewImageHDPIURL` = ?,`gestureFloatingPreviewTextColor` = ?,`functionalTextColor` = ?,`suggestionsBarPageIndicatorColor` = ?,`suggestionsColorAutoCorrect` = ?,`themePreviewImageORIGINALURL` = ?,`keyPopUpPreviewBackgroundColor` = ?,`feedbackBarPopupBackgroundColor` = ?,`keyboardBackgroundColor` = ?,`themeBackgroundImageXHDPIURL` = ?,`themePreviewImageXHDPIURL` = ?,`themePreviewImageXXHDPIURL` = ?,`keyTextColor` = ?,`themeType` = ?,`themeBackgroundImageORIGINALURL` = ?,`moreSuggestionsPanelBackgroundColor` = ?,`themeName` = ?,`emojiRowBackgroundColor` = ?,`suggestionsColorTypedWord` = ?,`keyVerticalGap` = ?,`enterKeyBorderRadius` = ?,`hintLabelColor` = ?,`suggestionsBarIconSelectedColor` = ?,`showNonAlphaKeyBorder` = ?,`bobbleBar` = ?,`enterKeyCircleBackgroundColor` = ?,`gestureFloatingPreviewColor` = ?,`keyboardBackgroundOpacity` = ?,`suggestionsBarBackgroundColor` = ? WHERE `themeId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ThemeModel value) {
        stmt.bindLong(1, value.themeId);
        if (value.isLightTheme == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.isLightTheme);
        }
        if (value.hintLetterColor == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.hintLetterColor);
        }
        if (value.themeBackgroundImageHDPIURL == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.themeBackgroundImageHDPIURL);
        }
        if (value.keyBorderRadius == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.keyBorderRadius);
        }
        if (value.keyBackgroundColor == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.keyBackgroundColor);
        }
        if (value.suggestionsColorValidTypedWord == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.suggestionsColorValidTypedWord);
        }
        if (value.themeBackgroundImageXXHDPIURL == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.themeBackgroundImageXXHDPIURL);
        }
        if (value.swipeGestureTrailColor == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.swipeGestureTrailColor);
        }
        if (value.moreSuggestionsButtonBackgroundColor == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.moreSuggestionsButtonBackgroundColor);
        }
        if (value.suggestionsColorSuggested == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.suggestionsColorSuggested);
        }
        if (value.themePreviewImageHDPIURL == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.themePreviewImageHDPIURL);
        }
        if (value.gestureFloatingPreviewTextColor == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.gestureFloatingPreviewTextColor);
        }
        if (value.functionalTextColor == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.functionalTextColor);
        }
        if (value.suggestionsBarPageIndicatorColor == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.suggestionsBarPageIndicatorColor);
        }
        if (value.suggestionsColorAutoCorrect == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.suggestionsColorAutoCorrect);
        }
        if (value.themePreviewImageORIGINALURL == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.themePreviewImageORIGINALURL);
        }
        if (value.keyPopUpPreviewBackgroundColor == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.keyPopUpPreviewBackgroundColor);
        }
        if (value.feedbackBarPopupBackgroundColor == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.feedbackBarPopupBackgroundColor);
        }
        if (value.keyboardBackgroundColor == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.keyboardBackgroundColor);
        }
        if (value.themeBackgroundImageXHDPIURL == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.themeBackgroundImageXHDPIURL);
        }
        if (value.themePreviewImageXHDPIURL == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.themePreviewImageXHDPIURL);
        }
        if (value.themePreviewImageXXHDPIURL == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.themePreviewImageXXHDPIURL);
        }
        if (value.keyTextColor == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, value.keyTextColor);
        }
        if (value.themeType == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindString(25, value.themeType);
        }
        if (value.themeBackgroundImageORIGINALURL == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, value.themeBackgroundImageORIGINALURL);
        }
        if (value.moreSuggestionsPanelBackgroundColor == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, value.moreSuggestionsPanelBackgroundColor);
        }
        if (value.themeName == null) {
          stmt.bindNull(28);
        } else {
          stmt.bindString(28, value.themeName);
        }
        if (value.emojiRowBackgroundColor == null) {
          stmt.bindNull(29);
        } else {
          stmt.bindString(29, value.emojiRowBackgroundColor);
        }
        if (value.suggestionsColorTypedWord == null) {
          stmt.bindNull(30);
        } else {
          stmt.bindString(30, value.suggestionsColorTypedWord);
        }
        if (value.keyVerticalGap == null) {
          stmt.bindNull(31);
        } else {
          stmt.bindString(31, value.keyVerticalGap);
        }
        if (value.enterKeyBorderRadius == null) {
          stmt.bindNull(32);
        } else {
          stmt.bindString(32, value.enterKeyBorderRadius);
        }
        if (value.hintLabelColor == null) {
          stmt.bindNull(33);
        } else {
          stmt.bindString(33, value.hintLabelColor);
        }
        if (value.suggestionsBarIconSelectedColor == null) {
          stmt.bindNull(34);
        } else {
          stmt.bindString(34, value.suggestionsBarIconSelectedColor);
        }
        if (value.showNonAlphaKeyBorder == null) {
          stmt.bindNull(35);
        } else {
          stmt.bindString(35, value.showNonAlphaKeyBorder);
        }
        if (value.bobbleBar == null) {
          stmt.bindNull(36);
        } else {
          stmt.bindString(36, value.bobbleBar);
        }
        if (value.enterKeyCircleBackgroundColor == null) {
          stmt.bindNull(37);
        } else {
          stmt.bindString(37, value.enterKeyCircleBackgroundColor);
        }
        if (value.gestureFloatingPreviewColor == null) {
          stmt.bindNull(38);
        } else {
          stmt.bindString(38, value.gestureFloatingPreviewColor);
        }
        if (value.keyboardBackgroundOpacity == null) {
          stmt.bindNull(39);
        } else {
          stmt.bindString(39, value.keyboardBackgroundOpacity);
        }
        if (value.suggestionsBarBackgroundColor == null) {
          stmt.bindNull(40);
        } else {
          stmt.bindString(40, value.suggestionsBarBackgroundColor);
        }
        stmt.bindLong(41, value.themeId);
      }
    };
  }

  @Override
  public long insertTheme(ThemeModel themeModel) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfThemeModel.insertAndReturnId(themeModel);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertThemeList(List<ThemeModel> themeList) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfThemeModel.insert(themeList);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int deleteTheme(ThemeModel themeModel) {
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__deletionAdapterOfThemeModel.handle(themeModel);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int updateTheme(ThemeModel themeModel) {
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfThemeModel.handle(themeModel);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<ThemeModel> fetchAllThemes() {
    final String _sql = "SELECT * FROM theme";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfThemeId = _cursor.getColumnIndexOrThrow("themeId");
      final int _cursorIndexOfIsLightTheme = _cursor.getColumnIndexOrThrow("isLightTheme");
      final int _cursorIndexOfHintLetterColor = _cursor.getColumnIndexOrThrow("hintLetterColor");
      final int _cursorIndexOfThemeBackgroundImageHDPIURL = _cursor.getColumnIndexOrThrow("themeBackgroundImageHDPIURL");
      final int _cursorIndexOfKeyBorderRadius = _cursor.getColumnIndexOrThrow("keyBorderRadius");
      final int _cursorIndexOfKeyBackgroundColor = _cursor.getColumnIndexOrThrow("keyBackgroundColor");
      final int _cursorIndexOfSuggestionsColorValidTypedWord = _cursor.getColumnIndexOrThrow("suggestionsColorValidTypedWord");
      final int _cursorIndexOfThemeBackgroundImageXXHDPIURL = _cursor.getColumnIndexOrThrow("themeBackgroundImageXXHDPIURL");
      final int _cursorIndexOfSwipeGestureTrailColor = _cursor.getColumnIndexOrThrow("swipeGestureTrailColor");
      final int _cursorIndexOfMoreSuggestionsButtonBackgroundColor = _cursor.getColumnIndexOrThrow("moreSuggestionsButtonBackgroundColor");
      final int _cursorIndexOfSuggestionsColorSuggested = _cursor.getColumnIndexOrThrow("suggestionsColorSuggested");
      final int _cursorIndexOfThemePreviewImageHDPIURL = _cursor.getColumnIndexOrThrow("themePreviewImageHDPIURL");
      final int _cursorIndexOfGestureFloatingPreviewTextColor = _cursor.getColumnIndexOrThrow("gestureFloatingPreviewTextColor");
      final int _cursorIndexOfFunctionalTextColor = _cursor.getColumnIndexOrThrow("functionalTextColor");
      final int _cursorIndexOfSuggestionsBarPageIndicatorColor = _cursor.getColumnIndexOrThrow("suggestionsBarPageIndicatorColor");
      final int _cursorIndexOfSuggestionsColorAutoCorrect = _cursor.getColumnIndexOrThrow("suggestionsColorAutoCorrect");
      final int _cursorIndexOfThemePreviewImageORIGINALURL = _cursor.getColumnIndexOrThrow("themePreviewImageORIGINALURL");
      final int _cursorIndexOfKeyPopUpPreviewBackgroundColor = _cursor.getColumnIndexOrThrow("keyPopUpPreviewBackgroundColor");
      final int _cursorIndexOfFeedbackBarPopupBackgroundColor = _cursor.getColumnIndexOrThrow("feedbackBarPopupBackgroundColor");
      final int _cursorIndexOfKeyboardBackgroundColor = _cursor.getColumnIndexOrThrow("keyboardBackgroundColor");
      final int _cursorIndexOfThemeBackgroundImageXHDPIURL = _cursor.getColumnIndexOrThrow("themeBackgroundImageXHDPIURL");
      final int _cursorIndexOfThemePreviewImageXHDPIURL = _cursor.getColumnIndexOrThrow("themePreviewImageXHDPIURL");
      final int _cursorIndexOfThemePreviewImageXXHDPIURL = _cursor.getColumnIndexOrThrow("themePreviewImageXXHDPIURL");
      final int _cursorIndexOfKeyTextColor = _cursor.getColumnIndexOrThrow("keyTextColor");
      final int _cursorIndexOfThemeType = _cursor.getColumnIndexOrThrow("themeType");
      final int _cursorIndexOfThemeBackgroundImageORIGINALURL = _cursor.getColumnIndexOrThrow("themeBackgroundImageORIGINALURL");
      final int _cursorIndexOfMoreSuggestionsPanelBackgroundColor = _cursor.getColumnIndexOrThrow("moreSuggestionsPanelBackgroundColor");
      final int _cursorIndexOfThemeName = _cursor.getColumnIndexOrThrow("themeName");
      final int _cursorIndexOfEmojiRowBackgroundColor = _cursor.getColumnIndexOrThrow("emojiRowBackgroundColor");
      final int _cursorIndexOfSuggestionsColorTypedWord = _cursor.getColumnIndexOrThrow("suggestionsColorTypedWord");
      final int _cursorIndexOfKeyVerticalGap = _cursor.getColumnIndexOrThrow("keyVerticalGap");
      final int _cursorIndexOfEnterKeyBorderRadius = _cursor.getColumnIndexOrThrow("enterKeyBorderRadius");
      final int _cursorIndexOfHintLabelColor = _cursor.getColumnIndexOrThrow("hintLabelColor");
      final int _cursorIndexOfSuggestionsBarIconSelectedColor = _cursor.getColumnIndexOrThrow("suggestionsBarIconSelectedColor");
      final int _cursorIndexOfShowNonAlphaKeyBorder = _cursor.getColumnIndexOrThrow("showNonAlphaKeyBorder");
      final int _cursorIndexOfBobbleBar = _cursor.getColumnIndexOrThrow("bobbleBar");
      final int _cursorIndexOfEnterKeyCircleBackgroundColor = _cursor.getColumnIndexOrThrow("enterKeyCircleBackgroundColor");
      final int _cursorIndexOfGestureFloatingPreviewColor = _cursor.getColumnIndexOrThrow("gestureFloatingPreviewColor");
      final int _cursorIndexOfKeyboardBackgroundOpacity = _cursor.getColumnIndexOrThrow("keyboardBackgroundOpacity");
      final int _cursorIndexOfSuggestionsBarBackgroundColor = _cursor.getColumnIndexOrThrow("suggestionsBarBackgroundColor");
      final List<ThemeModel> _result = new ArrayList<ThemeModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ThemeModel _item;
        _item = new ThemeModel();
        _item.themeId = _cursor.getInt(_cursorIndexOfThemeId);
        _item.isLightTheme = _cursor.getString(_cursorIndexOfIsLightTheme);
        _item.hintLetterColor = _cursor.getString(_cursorIndexOfHintLetterColor);
        _item.themeBackgroundImageHDPIURL = _cursor.getString(_cursorIndexOfThemeBackgroundImageHDPIURL);
        _item.keyBorderRadius = _cursor.getString(_cursorIndexOfKeyBorderRadius);
        _item.keyBackgroundColor = _cursor.getString(_cursorIndexOfKeyBackgroundColor);
        _item.suggestionsColorValidTypedWord = _cursor.getString(_cursorIndexOfSuggestionsColorValidTypedWord);
        _item.themeBackgroundImageXXHDPIURL = _cursor.getString(_cursorIndexOfThemeBackgroundImageXXHDPIURL);
        _item.swipeGestureTrailColor = _cursor.getString(_cursorIndexOfSwipeGestureTrailColor);
        _item.moreSuggestionsButtonBackgroundColor = _cursor.getString(_cursorIndexOfMoreSuggestionsButtonBackgroundColor);
        _item.suggestionsColorSuggested = _cursor.getString(_cursorIndexOfSuggestionsColorSuggested);
        _item.themePreviewImageHDPIURL = _cursor.getString(_cursorIndexOfThemePreviewImageHDPIURL);
        _item.gestureFloatingPreviewTextColor = _cursor.getString(_cursorIndexOfGestureFloatingPreviewTextColor);
        _item.functionalTextColor = _cursor.getString(_cursorIndexOfFunctionalTextColor);
        _item.suggestionsBarPageIndicatorColor = _cursor.getString(_cursorIndexOfSuggestionsBarPageIndicatorColor);
        _item.suggestionsColorAutoCorrect = _cursor.getString(_cursorIndexOfSuggestionsColorAutoCorrect);
        _item.themePreviewImageORIGINALURL = _cursor.getString(_cursorIndexOfThemePreviewImageORIGINALURL);
        _item.keyPopUpPreviewBackgroundColor = _cursor.getString(_cursorIndexOfKeyPopUpPreviewBackgroundColor);
        _item.feedbackBarPopupBackgroundColor = _cursor.getString(_cursorIndexOfFeedbackBarPopupBackgroundColor);
        _item.keyboardBackgroundColor = _cursor.getString(_cursorIndexOfKeyboardBackgroundColor);
        _item.themeBackgroundImageXHDPIURL = _cursor.getString(_cursorIndexOfThemeBackgroundImageXHDPIURL);
        _item.themePreviewImageXHDPIURL = _cursor.getString(_cursorIndexOfThemePreviewImageXHDPIURL);
        _item.themePreviewImageXXHDPIURL = _cursor.getString(_cursorIndexOfThemePreviewImageXXHDPIURL);
        _item.keyTextColor = _cursor.getString(_cursorIndexOfKeyTextColor);
        _item.themeType = _cursor.getString(_cursorIndexOfThemeType);
        _item.themeBackgroundImageORIGINALURL = _cursor.getString(_cursorIndexOfThemeBackgroundImageORIGINALURL);
        _item.moreSuggestionsPanelBackgroundColor = _cursor.getString(_cursorIndexOfMoreSuggestionsPanelBackgroundColor);
        _item.themeName = _cursor.getString(_cursorIndexOfThemeName);
        _item.emojiRowBackgroundColor = _cursor.getString(_cursorIndexOfEmojiRowBackgroundColor);
        _item.suggestionsColorTypedWord = _cursor.getString(_cursorIndexOfSuggestionsColorTypedWord);
        _item.keyVerticalGap = _cursor.getString(_cursorIndexOfKeyVerticalGap);
        _item.enterKeyBorderRadius = _cursor.getString(_cursorIndexOfEnterKeyBorderRadius);
        _item.hintLabelColor = _cursor.getString(_cursorIndexOfHintLabelColor);
        _item.suggestionsBarIconSelectedColor = _cursor.getString(_cursorIndexOfSuggestionsBarIconSelectedColor);
        _item.showNonAlphaKeyBorder = _cursor.getString(_cursorIndexOfShowNonAlphaKeyBorder);
        _item.bobbleBar = _cursor.getString(_cursorIndexOfBobbleBar);
        _item.enterKeyCircleBackgroundColor = _cursor.getString(_cursorIndexOfEnterKeyCircleBackgroundColor);
        _item.gestureFloatingPreviewColor = _cursor.getString(_cursorIndexOfGestureFloatingPreviewColor);
        _item.keyboardBackgroundOpacity = _cursor.getString(_cursorIndexOfKeyboardBackgroundOpacity);
        _item.suggestionsBarBackgroundColor = _cursor.getString(_cursorIndexOfSuggestionsBarBackgroundColor);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<ThemeModel> fetchThemeListByCategory(String themeType) {
    final String _sql = "SELECT * FROM theme WHERE themeType = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (themeType == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, themeType);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfThemeId = _cursor.getColumnIndexOrThrow("themeId");
      final int _cursorIndexOfIsLightTheme = _cursor.getColumnIndexOrThrow("isLightTheme");
      final int _cursorIndexOfHintLetterColor = _cursor.getColumnIndexOrThrow("hintLetterColor");
      final int _cursorIndexOfThemeBackgroundImageHDPIURL = _cursor.getColumnIndexOrThrow("themeBackgroundImageHDPIURL");
      final int _cursorIndexOfKeyBorderRadius = _cursor.getColumnIndexOrThrow("keyBorderRadius");
      final int _cursorIndexOfKeyBackgroundColor = _cursor.getColumnIndexOrThrow("keyBackgroundColor");
      final int _cursorIndexOfSuggestionsColorValidTypedWord = _cursor.getColumnIndexOrThrow("suggestionsColorValidTypedWord");
      final int _cursorIndexOfThemeBackgroundImageXXHDPIURL = _cursor.getColumnIndexOrThrow("themeBackgroundImageXXHDPIURL");
      final int _cursorIndexOfSwipeGestureTrailColor = _cursor.getColumnIndexOrThrow("swipeGestureTrailColor");
      final int _cursorIndexOfMoreSuggestionsButtonBackgroundColor = _cursor.getColumnIndexOrThrow("moreSuggestionsButtonBackgroundColor");
      final int _cursorIndexOfSuggestionsColorSuggested = _cursor.getColumnIndexOrThrow("suggestionsColorSuggested");
      final int _cursorIndexOfThemePreviewImageHDPIURL = _cursor.getColumnIndexOrThrow("themePreviewImageHDPIURL");
      final int _cursorIndexOfGestureFloatingPreviewTextColor = _cursor.getColumnIndexOrThrow("gestureFloatingPreviewTextColor");
      final int _cursorIndexOfFunctionalTextColor = _cursor.getColumnIndexOrThrow("functionalTextColor");
      final int _cursorIndexOfSuggestionsBarPageIndicatorColor = _cursor.getColumnIndexOrThrow("suggestionsBarPageIndicatorColor");
      final int _cursorIndexOfSuggestionsColorAutoCorrect = _cursor.getColumnIndexOrThrow("suggestionsColorAutoCorrect");
      final int _cursorIndexOfThemePreviewImageORIGINALURL = _cursor.getColumnIndexOrThrow("themePreviewImageORIGINALURL");
      final int _cursorIndexOfKeyPopUpPreviewBackgroundColor = _cursor.getColumnIndexOrThrow("keyPopUpPreviewBackgroundColor");
      final int _cursorIndexOfFeedbackBarPopupBackgroundColor = _cursor.getColumnIndexOrThrow("feedbackBarPopupBackgroundColor");
      final int _cursorIndexOfKeyboardBackgroundColor = _cursor.getColumnIndexOrThrow("keyboardBackgroundColor");
      final int _cursorIndexOfThemeBackgroundImageXHDPIURL = _cursor.getColumnIndexOrThrow("themeBackgroundImageXHDPIURL");
      final int _cursorIndexOfThemePreviewImageXHDPIURL = _cursor.getColumnIndexOrThrow("themePreviewImageXHDPIURL");
      final int _cursorIndexOfThemePreviewImageXXHDPIURL = _cursor.getColumnIndexOrThrow("themePreviewImageXXHDPIURL");
      final int _cursorIndexOfKeyTextColor = _cursor.getColumnIndexOrThrow("keyTextColor");
      final int _cursorIndexOfThemeType = _cursor.getColumnIndexOrThrow("themeType");
      final int _cursorIndexOfThemeBackgroundImageORIGINALURL = _cursor.getColumnIndexOrThrow("themeBackgroundImageORIGINALURL");
      final int _cursorIndexOfMoreSuggestionsPanelBackgroundColor = _cursor.getColumnIndexOrThrow("moreSuggestionsPanelBackgroundColor");
      final int _cursorIndexOfThemeName = _cursor.getColumnIndexOrThrow("themeName");
      final int _cursorIndexOfEmojiRowBackgroundColor = _cursor.getColumnIndexOrThrow("emojiRowBackgroundColor");
      final int _cursorIndexOfSuggestionsColorTypedWord = _cursor.getColumnIndexOrThrow("suggestionsColorTypedWord");
      final int _cursorIndexOfKeyVerticalGap = _cursor.getColumnIndexOrThrow("keyVerticalGap");
      final int _cursorIndexOfEnterKeyBorderRadius = _cursor.getColumnIndexOrThrow("enterKeyBorderRadius");
      final int _cursorIndexOfHintLabelColor = _cursor.getColumnIndexOrThrow("hintLabelColor");
      final int _cursorIndexOfSuggestionsBarIconSelectedColor = _cursor.getColumnIndexOrThrow("suggestionsBarIconSelectedColor");
      final int _cursorIndexOfShowNonAlphaKeyBorder = _cursor.getColumnIndexOrThrow("showNonAlphaKeyBorder");
      final int _cursorIndexOfBobbleBar = _cursor.getColumnIndexOrThrow("bobbleBar");
      final int _cursorIndexOfEnterKeyCircleBackgroundColor = _cursor.getColumnIndexOrThrow("enterKeyCircleBackgroundColor");
      final int _cursorIndexOfGestureFloatingPreviewColor = _cursor.getColumnIndexOrThrow("gestureFloatingPreviewColor");
      final int _cursorIndexOfKeyboardBackgroundOpacity = _cursor.getColumnIndexOrThrow("keyboardBackgroundOpacity");
      final int _cursorIndexOfSuggestionsBarBackgroundColor = _cursor.getColumnIndexOrThrow("suggestionsBarBackgroundColor");
      final List<ThemeModel> _result = new ArrayList<ThemeModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ThemeModel _item;
        _item = new ThemeModel();
        _item.themeId = _cursor.getInt(_cursorIndexOfThemeId);
        _item.isLightTheme = _cursor.getString(_cursorIndexOfIsLightTheme);
        _item.hintLetterColor = _cursor.getString(_cursorIndexOfHintLetterColor);
        _item.themeBackgroundImageHDPIURL = _cursor.getString(_cursorIndexOfThemeBackgroundImageHDPIURL);
        _item.keyBorderRadius = _cursor.getString(_cursorIndexOfKeyBorderRadius);
        _item.keyBackgroundColor = _cursor.getString(_cursorIndexOfKeyBackgroundColor);
        _item.suggestionsColorValidTypedWord = _cursor.getString(_cursorIndexOfSuggestionsColorValidTypedWord);
        _item.themeBackgroundImageXXHDPIURL = _cursor.getString(_cursorIndexOfThemeBackgroundImageXXHDPIURL);
        _item.swipeGestureTrailColor = _cursor.getString(_cursorIndexOfSwipeGestureTrailColor);
        _item.moreSuggestionsButtonBackgroundColor = _cursor.getString(_cursorIndexOfMoreSuggestionsButtonBackgroundColor);
        _item.suggestionsColorSuggested = _cursor.getString(_cursorIndexOfSuggestionsColorSuggested);
        _item.themePreviewImageHDPIURL = _cursor.getString(_cursorIndexOfThemePreviewImageHDPIURL);
        _item.gestureFloatingPreviewTextColor = _cursor.getString(_cursorIndexOfGestureFloatingPreviewTextColor);
        _item.functionalTextColor = _cursor.getString(_cursorIndexOfFunctionalTextColor);
        _item.suggestionsBarPageIndicatorColor = _cursor.getString(_cursorIndexOfSuggestionsBarPageIndicatorColor);
        _item.suggestionsColorAutoCorrect = _cursor.getString(_cursorIndexOfSuggestionsColorAutoCorrect);
        _item.themePreviewImageORIGINALURL = _cursor.getString(_cursorIndexOfThemePreviewImageORIGINALURL);
        _item.keyPopUpPreviewBackgroundColor = _cursor.getString(_cursorIndexOfKeyPopUpPreviewBackgroundColor);
        _item.feedbackBarPopupBackgroundColor = _cursor.getString(_cursorIndexOfFeedbackBarPopupBackgroundColor);
        _item.keyboardBackgroundColor = _cursor.getString(_cursorIndexOfKeyboardBackgroundColor);
        _item.themeBackgroundImageXHDPIURL = _cursor.getString(_cursorIndexOfThemeBackgroundImageXHDPIURL);
        _item.themePreviewImageXHDPIURL = _cursor.getString(_cursorIndexOfThemePreviewImageXHDPIURL);
        _item.themePreviewImageXXHDPIURL = _cursor.getString(_cursorIndexOfThemePreviewImageXXHDPIURL);
        _item.keyTextColor = _cursor.getString(_cursorIndexOfKeyTextColor);
        _item.themeType = _cursor.getString(_cursorIndexOfThemeType);
        _item.themeBackgroundImageORIGINALURL = _cursor.getString(_cursorIndexOfThemeBackgroundImageORIGINALURL);
        _item.moreSuggestionsPanelBackgroundColor = _cursor.getString(_cursorIndexOfMoreSuggestionsPanelBackgroundColor);
        _item.themeName = _cursor.getString(_cursorIndexOfThemeName);
        _item.emojiRowBackgroundColor = _cursor.getString(_cursorIndexOfEmojiRowBackgroundColor);
        _item.suggestionsColorTypedWord = _cursor.getString(_cursorIndexOfSuggestionsColorTypedWord);
        _item.keyVerticalGap = _cursor.getString(_cursorIndexOfKeyVerticalGap);
        _item.enterKeyBorderRadius = _cursor.getString(_cursorIndexOfEnterKeyBorderRadius);
        _item.hintLabelColor = _cursor.getString(_cursorIndexOfHintLabelColor);
        _item.suggestionsBarIconSelectedColor = _cursor.getString(_cursorIndexOfSuggestionsBarIconSelectedColor);
        _item.showNonAlphaKeyBorder = _cursor.getString(_cursorIndexOfShowNonAlphaKeyBorder);
        _item.bobbleBar = _cursor.getString(_cursorIndexOfBobbleBar);
        _item.enterKeyCircleBackgroundColor = _cursor.getString(_cursorIndexOfEnterKeyCircleBackgroundColor);
        _item.gestureFloatingPreviewColor = _cursor.getString(_cursorIndexOfGestureFloatingPreviewColor);
        _item.keyboardBackgroundOpacity = _cursor.getString(_cursorIndexOfKeyboardBackgroundOpacity);
        _item.suggestionsBarBackgroundColor = _cursor.getString(_cursorIndexOfSuggestionsBarBackgroundColor);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public ThemeModel fetchThemeListById(int themeId) {
    final String _sql = "SELECT * FROM theme WHERE themeId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, themeId);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfThemeId = _cursor.getColumnIndexOrThrow("themeId");
      final int _cursorIndexOfIsLightTheme = _cursor.getColumnIndexOrThrow("isLightTheme");
      final int _cursorIndexOfHintLetterColor = _cursor.getColumnIndexOrThrow("hintLetterColor");
      final int _cursorIndexOfThemeBackgroundImageHDPIURL = _cursor.getColumnIndexOrThrow("themeBackgroundImageHDPIURL");
      final int _cursorIndexOfKeyBorderRadius = _cursor.getColumnIndexOrThrow("keyBorderRadius");
      final int _cursorIndexOfKeyBackgroundColor = _cursor.getColumnIndexOrThrow("keyBackgroundColor");
      final int _cursorIndexOfSuggestionsColorValidTypedWord = _cursor.getColumnIndexOrThrow("suggestionsColorValidTypedWord");
      final int _cursorIndexOfThemeBackgroundImageXXHDPIURL = _cursor.getColumnIndexOrThrow("themeBackgroundImageXXHDPIURL");
      final int _cursorIndexOfSwipeGestureTrailColor = _cursor.getColumnIndexOrThrow("swipeGestureTrailColor");
      final int _cursorIndexOfMoreSuggestionsButtonBackgroundColor = _cursor.getColumnIndexOrThrow("moreSuggestionsButtonBackgroundColor");
      final int _cursorIndexOfSuggestionsColorSuggested = _cursor.getColumnIndexOrThrow("suggestionsColorSuggested");
      final int _cursorIndexOfThemePreviewImageHDPIURL = _cursor.getColumnIndexOrThrow("themePreviewImageHDPIURL");
      final int _cursorIndexOfGestureFloatingPreviewTextColor = _cursor.getColumnIndexOrThrow("gestureFloatingPreviewTextColor");
      final int _cursorIndexOfFunctionalTextColor = _cursor.getColumnIndexOrThrow("functionalTextColor");
      final int _cursorIndexOfSuggestionsBarPageIndicatorColor = _cursor.getColumnIndexOrThrow("suggestionsBarPageIndicatorColor");
      final int _cursorIndexOfSuggestionsColorAutoCorrect = _cursor.getColumnIndexOrThrow("suggestionsColorAutoCorrect");
      final int _cursorIndexOfThemePreviewImageORIGINALURL = _cursor.getColumnIndexOrThrow("themePreviewImageORIGINALURL");
      final int _cursorIndexOfKeyPopUpPreviewBackgroundColor = _cursor.getColumnIndexOrThrow("keyPopUpPreviewBackgroundColor");
      final int _cursorIndexOfFeedbackBarPopupBackgroundColor = _cursor.getColumnIndexOrThrow("feedbackBarPopupBackgroundColor");
      final int _cursorIndexOfKeyboardBackgroundColor = _cursor.getColumnIndexOrThrow("keyboardBackgroundColor");
      final int _cursorIndexOfThemeBackgroundImageXHDPIURL = _cursor.getColumnIndexOrThrow("themeBackgroundImageXHDPIURL");
      final int _cursorIndexOfThemePreviewImageXHDPIURL = _cursor.getColumnIndexOrThrow("themePreviewImageXHDPIURL");
      final int _cursorIndexOfThemePreviewImageXXHDPIURL = _cursor.getColumnIndexOrThrow("themePreviewImageXXHDPIURL");
      final int _cursorIndexOfKeyTextColor = _cursor.getColumnIndexOrThrow("keyTextColor");
      final int _cursorIndexOfThemeType = _cursor.getColumnIndexOrThrow("themeType");
      final int _cursorIndexOfThemeBackgroundImageORIGINALURL = _cursor.getColumnIndexOrThrow("themeBackgroundImageORIGINALURL");
      final int _cursorIndexOfMoreSuggestionsPanelBackgroundColor = _cursor.getColumnIndexOrThrow("moreSuggestionsPanelBackgroundColor");
      final int _cursorIndexOfThemeName = _cursor.getColumnIndexOrThrow("themeName");
      final int _cursorIndexOfEmojiRowBackgroundColor = _cursor.getColumnIndexOrThrow("emojiRowBackgroundColor");
      final int _cursorIndexOfSuggestionsColorTypedWord = _cursor.getColumnIndexOrThrow("suggestionsColorTypedWord");
      final int _cursorIndexOfKeyVerticalGap = _cursor.getColumnIndexOrThrow("keyVerticalGap");
      final int _cursorIndexOfEnterKeyBorderRadius = _cursor.getColumnIndexOrThrow("enterKeyBorderRadius");
      final int _cursorIndexOfHintLabelColor = _cursor.getColumnIndexOrThrow("hintLabelColor");
      final int _cursorIndexOfSuggestionsBarIconSelectedColor = _cursor.getColumnIndexOrThrow("suggestionsBarIconSelectedColor");
      final int _cursorIndexOfShowNonAlphaKeyBorder = _cursor.getColumnIndexOrThrow("showNonAlphaKeyBorder");
      final int _cursorIndexOfBobbleBar = _cursor.getColumnIndexOrThrow("bobbleBar");
      final int _cursorIndexOfEnterKeyCircleBackgroundColor = _cursor.getColumnIndexOrThrow("enterKeyCircleBackgroundColor");
      final int _cursorIndexOfGestureFloatingPreviewColor = _cursor.getColumnIndexOrThrow("gestureFloatingPreviewColor");
      final int _cursorIndexOfKeyboardBackgroundOpacity = _cursor.getColumnIndexOrThrow("keyboardBackgroundOpacity");
      final int _cursorIndexOfSuggestionsBarBackgroundColor = _cursor.getColumnIndexOrThrow("suggestionsBarBackgroundColor");
      final ThemeModel _result;
      if(_cursor.moveToFirst()) {
        _result = new ThemeModel();
        _result.themeId = _cursor.getInt(_cursorIndexOfThemeId);
        _result.isLightTheme = _cursor.getString(_cursorIndexOfIsLightTheme);
        _result.hintLetterColor = _cursor.getString(_cursorIndexOfHintLetterColor);
        _result.themeBackgroundImageHDPIURL = _cursor.getString(_cursorIndexOfThemeBackgroundImageHDPIURL);
        _result.keyBorderRadius = _cursor.getString(_cursorIndexOfKeyBorderRadius);
        _result.keyBackgroundColor = _cursor.getString(_cursorIndexOfKeyBackgroundColor);
        _result.suggestionsColorValidTypedWord = _cursor.getString(_cursorIndexOfSuggestionsColorValidTypedWord);
        _result.themeBackgroundImageXXHDPIURL = _cursor.getString(_cursorIndexOfThemeBackgroundImageXXHDPIURL);
        _result.swipeGestureTrailColor = _cursor.getString(_cursorIndexOfSwipeGestureTrailColor);
        _result.moreSuggestionsButtonBackgroundColor = _cursor.getString(_cursorIndexOfMoreSuggestionsButtonBackgroundColor);
        _result.suggestionsColorSuggested = _cursor.getString(_cursorIndexOfSuggestionsColorSuggested);
        _result.themePreviewImageHDPIURL = _cursor.getString(_cursorIndexOfThemePreviewImageHDPIURL);
        _result.gestureFloatingPreviewTextColor = _cursor.getString(_cursorIndexOfGestureFloatingPreviewTextColor);
        _result.functionalTextColor = _cursor.getString(_cursorIndexOfFunctionalTextColor);
        _result.suggestionsBarPageIndicatorColor = _cursor.getString(_cursorIndexOfSuggestionsBarPageIndicatorColor);
        _result.suggestionsColorAutoCorrect = _cursor.getString(_cursorIndexOfSuggestionsColorAutoCorrect);
        _result.themePreviewImageORIGINALURL = _cursor.getString(_cursorIndexOfThemePreviewImageORIGINALURL);
        _result.keyPopUpPreviewBackgroundColor = _cursor.getString(_cursorIndexOfKeyPopUpPreviewBackgroundColor);
        _result.feedbackBarPopupBackgroundColor = _cursor.getString(_cursorIndexOfFeedbackBarPopupBackgroundColor);
        _result.keyboardBackgroundColor = _cursor.getString(_cursorIndexOfKeyboardBackgroundColor);
        _result.themeBackgroundImageXHDPIURL = _cursor.getString(_cursorIndexOfThemeBackgroundImageXHDPIURL);
        _result.themePreviewImageXHDPIURL = _cursor.getString(_cursorIndexOfThemePreviewImageXHDPIURL);
        _result.themePreviewImageXXHDPIURL = _cursor.getString(_cursorIndexOfThemePreviewImageXXHDPIURL);
        _result.keyTextColor = _cursor.getString(_cursorIndexOfKeyTextColor);
        _result.themeType = _cursor.getString(_cursorIndexOfThemeType);
        _result.themeBackgroundImageORIGINALURL = _cursor.getString(_cursorIndexOfThemeBackgroundImageORIGINALURL);
        _result.moreSuggestionsPanelBackgroundColor = _cursor.getString(_cursorIndexOfMoreSuggestionsPanelBackgroundColor);
        _result.themeName = _cursor.getString(_cursorIndexOfThemeName);
        _result.emojiRowBackgroundColor = _cursor.getString(_cursorIndexOfEmojiRowBackgroundColor);
        _result.suggestionsColorTypedWord = _cursor.getString(_cursorIndexOfSuggestionsColorTypedWord);
        _result.keyVerticalGap = _cursor.getString(_cursorIndexOfKeyVerticalGap);
        _result.enterKeyBorderRadius = _cursor.getString(_cursorIndexOfEnterKeyBorderRadius);
        _result.hintLabelColor = _cursor.getString(_cursorIndexOfHintLabelColor);
        _result.suggestionsBarIconSelectedColor = _cursor.getString(_cursorIndexOfSuggestionsBarIconSelectedColor);
        _result.showNonAlphaKeyBorder = _cursor.getString(_cursorIndexOfShowNonAlphaKeyBorder);
        _result.bobbleBar = _cursor.getString(_cursorIndexOfBobbleBar);
        _result.enterKeyCircleBackgroundColor = _cursor.getString(_cursorIndexOfEnterKeyCircleBackgroundColor);
        _result.gestureFloatingPreviewColor = _cursor.getString(_cursorIndexOfGestureFloatingPreviewColor);
        _result.keyboardBackgroundOpacity = _cursor.getString(_cursorIndexOfKeyboardBackgroundOpacity);
        _result.suggestionsBarBackgroundColor = _cursor.getString(_cursorIndexOfSuggestionsBarBackgroundColor);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
