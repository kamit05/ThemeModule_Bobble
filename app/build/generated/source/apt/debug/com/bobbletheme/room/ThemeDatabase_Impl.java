package com.bobbletheme.room;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.RoomOpenHelper.Delegate;
import android.arch.persistence.room.util.TableInfo;
import android.arch.persistence.room.util.TableInfo.Column;
import android.arch.persistence.room.util.TableInfo.ForeignKey;
import android.arch.persistence.room.util.TableInfo.Index;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.util.HashMap;
import java.util.HashSet;

public class ThemeDatabase_Impl extends ThemeDatabase {
  private volatile DaoAccess _daoAccess;

  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `theme` (`themeId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `isLightTheme` TEXT, `hintLetterColor` TEXT, `themeBackgroundImageHDPIURL` TEXT, `keyBorderRadius` TEXT, `keyBackgroundColor` TEXT, `suggestionsColorValidTypedWord` TEXT, `themeBackgroundImageXXHDPIURL` TEXT, `swipeGestureTrailColor` TEXT, `moreSuggestionsButtonBackgroundColor` TEXT, `suggestionsColorSuggested` TEXT, `themePreviewImageHDPIURL` TEXT, `gestureFloatingPreviewTextColor` TEXT, `functionalTextColor` TEXT, `suggestionsBarPageIndicatorColor` TEXT, `suggestionsColorAutoCorrect` TEXT, `themePreviewImageORIGINALURL` TEXT, `keyPopUpPreviewBackgroundColor` TEXT, `feedbackBarPopupBackgroundColor` TEXT, `keyboardBackgroundColor` TEXT, `themeBackgroundImageXHDPIURL` TEXT, `themePreviewImageXHDPIURL` TEXT, `themePreviewImageXXHDPIURL` TEXT, `keyTextColor` TEXT, `themeType` TEXT, `themeBackgroundImageORIGINALURL` TEXT, `moreSuggestionsPanelBackgroundColor` TEXT, `themeName` TEXT, `emojiRowBackgroundColor` TEXT, `suggestionsColorTypedWord` TEXT, `keyVerticalGap` TEXT, `enterKeyBorderRadius` TEXT, `hintLabelColor` TEXT, `suggestionsBarIconSelectedColor` TEXT, `showNonAlphaKeyBorder` TEXT, `bobbleBar` TEXT, `enterKeyCircleBackgroundColor` TEXT, `gestureFloatingPreviewColor` TEXT, `keyboardBackgroundOpacity` TEXT, `suggestionsBarBackgroundColor` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"ff33834e12970297519291cab20027a6\")");
      }

      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `theme`");
      }

      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsTheme = new HashMap<String, TableInfo.Column>(40);
        _columnsTheme.put("themeId", new TableInfo.Column("themeId", "INTEGER", true, 1));
        _columnsTheme.put("isLightTheme", new TableInfo.Column("isLightTheme", "TEXT", false, 0));
        _columnsTheme.put("hintLetterColor", new TableInfo.Column("hintLetterColor", "TEXT", false, 0));
        _columnsTheme.put("themeBackgroundImageHDPIURL", new TableInfo.Column("themeBackgroundImageHDPIURL", "TEXT", false, 0));
        _columnsTheme.put("keyBorderRadius", new TableInfo.Column("keyBorderRadius", "TEXT", false, 0));
        _columnsTheme.put("keyBackgroundColor", new TableInfo.Column("keyBackgroundColor", "TEXT", false, 0));
        _columnsTheme.put("suggestionsColorValidTypedWord", new TableInfo.Column("suggestionsColorValidTypedWord", "TEXT", false, 0));
        _columnsTheme.put("themeBackgroundImageXXHDPIURL", new TableInfo.Column("themeBackgroundImageXXHDPIURL", "TEXT", false, 0));
        _columnsTheme.put("swipeGestureTrailColor", new TableInfo.Column("swipeGestureTrailColor", "TEXT", false, 0));
        _columnsTheme.put("moreSuggestionsButtonBackgroundColor", new TableInfo.Column("moreSuggestionsButtonBackgroundColor", "TEXT", false, 0));
        _columnsTheme.put("suggestionsColorSuggested", new TableInfo.Column("suggestionsColorSuggested", "TEXT", false, 0));
        _columnsTheme.put("themePreviewImageHDPIURL", new TableInfo.Column("themePreviewImageHDPIURL", "TEXT", false, 0));
        _columnsTheme.put("gestureFloatingPreviewTextColor", new TableInfo.Column("gestureFloatingPreviewTextColor", "TEXT", false, 0));
        _columnsTheme.put("functionalTextColor", new TableInfo.Column("functionalTextColor", "TEXT", false, 0));
        _columnsTheme.put("suggestionsBarPageIndicatorColor", new TableInfo.Column("suggestionsBarPageIndicatorColor", "TEXT", false, 0));
        _columnsTheme.put("suggestionsColorAutoCorrect", new TableInfo.Column("suggestionsColorAutoCorrect", "TEXT", false, 0));
        _columnsTheme.put("themePreviewImageORIGINALURL", new TableInfo.Column("themePreviewImageORIGINALURL", "TEXT", false, 0));
        _columnsTheme.put("keyPopUpPreviewBackgroundColor", new TableInfo.Column("keyPopUpPreviewBackgroundColor", "TEXT", false, 0));
        _columnsTheme.put("feedbackBarPopupBackgroundColor", new TableInfo.Column("feedbackBarPopupBackgroundColor", "TEXT", false, 0));
        _columnsTheme.put("keyboardBackgroundColor", new TableInfo.Column("keyboardBackgroundColor", "TEXT", false, 0));
        _columnsTheme.put("themeBackgroundImageXHDPIURL", new TableInfo.Column("themeBackgroundImageXHDPIURL", "TEXT", false, 0));
        _columnsTheme.put("themePreviewImageXHDPIURL", new TableInfo.Column("themePreviewImageXHDPIURL", "TEXT", false, 0));
        _columnsTheme.put("themePreviewImageXXHDPIURL", new TableInfo.Column("themePreviewImageXXHDPIURL", "TEXT", false, 0));
        _columnsTheme.put("keyTextColor", new TableInfo.Column("keyTextColor", "TEXT", false, 0));
        _columnsTheme.put("themeType", new TableInfo.Column("themeType", "TEXT", false, 0));
        _columnsTheme.put("themeBackgroundImageORIGINALURL", new TableInfo.Column("themeBackgroundImageORIGINALURL", "TEXT", false, 0));
        _columnsTheme.put("moreSuggestionsPanelBackgroundColor", new TableInfo.Column("moreSuggestionsPanelBackgroundColor", "TEXT", false, 0));
        _columnsTheme.put("themeName", new TableInfo.Column("themeName", "TEXT", false, 0));
        _columnsTheme.put("emojiRowBackgroundColor", new TableInfo.Column("emojiRowBackgroundColor", "TEXT", false, 0));
        _columnsTheme.put("suggestionsColorTypedWord", new TableInfo.Column("suggestionsColorTypedWord", "TEXT", false, 0));
        _columnsTheme.put("keyVerticalGap", new TableInfo.Column("keyVerticalGap", "TEXT", false, 0));
        _columnsTheme.put("enterKeyBorderRadius", new TableInfo.Column("enterKeyBorderRadius", "TEXT", false, 0));
        _columnsTheme.put("hintLabelColor", new TableInfo.Column("hintLabelColor", "TEXT", false, 0));
        _columnsTheme.put("suggestionsBarIconSelectedColor", new TableInfo.Column("suggestionsBarIconSelectedColor", "TEXT", false, 0));
        _columnsTheme.put("showNonAlphaKeyBorder", new TableInfo.Column("showNonAlphaKeyBorder", "TEXT", false, 0));
        _columnsTheme.put("bobbleBar", new TableInfo.Column("bobbleBar", "TEXT", false, 0));
        _columnsTheme.put("enterKeyCircleBackgroundColor", new TableInfo.Column("enterKeyCircleBackgroundColor", "TEXT", false, 0));
        _columnsTheme.put("gestureFloatingPreviewColor", new TableInfo.Column("gestureFloatingPreviewColor", "TEXT", false, 0));
        _columnsTheme.put("keyboardBackgroundOpacity", new TableInfo.Column("keyboardBackgroundOpacity", "TEXT", false, 0));
        _columnsTheme.put("suggestionsBarBackgroundColor", new TableInfo.Column("suggestionsBarBackgroundColor", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTheme = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTheme = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTheme = new TableInfo("theme", _columnsTheme, _foreignKeysTheme, _indicesTheme);
        final TableInfo _existingTheme = TableInfo.read(_db, "theme");
        if (! _infoTheme.equals(_existingTheme)) {
          throw new IllegalStateException("Migration didn't properly handle theme(com.bobbletheme.room.ThemeModel).\n"
                  + " Expected:\n" + _infoTheme + "\n"
                  + " Found:\n" + _existingTheme);
        }
      }
    }, "ff33834e12970297519291cab20027a6");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "theme");
  }

  @Override
  public DaoAccess daoAccess() {
    if (_daoAccess != null) {
      return _daoAccess;
    } else {
      synchronized(this) {
        if(_daoAccess == null) {
          _daoAccess = new DaoAccess_Impl(this);
        }
        return _daoAccess;
      }
    }
  }
}
