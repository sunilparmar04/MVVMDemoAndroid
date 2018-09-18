package com.mvvmdemo.data.local.db;

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
import com.mvvmdemo.data.local.db.dao.OptionDao;
import com.mvvmdemo.data.local.db.dao.OptionDao_Impl;
import com.mvvmdemo.data.local.db.dao.QuestionDao;
import com.mvvmdemo.data.local.db.dao.QuestionDao_Impl;
import com.mvvmdemo.data.local.db.dao.UserDao;
import com.mvvmdemo.data.local.db.dao.UserDao_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class AppDatabase_Impl extends AppDatabase {
  private volatile OptionDao _optionDao;

  private volatile QuestionDao _questionDao;

  private volatile UserDao _userDao;

  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `users` (`created_at` TEXT, `id` INTEGER, `name` TEXT, `updated_at` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `questions` (`created_at` TEXT, `id` INTEGER, `question_img_url` TEXT, `question_text` TEXT, `updated_at` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `options` (`created_at` TEXT, `id` INTEGER, `is_correct` INTEGER NOT NULL, `option_text` TEXT, `question_id` INTEGER, `updated_at` TEXT, PRIMARY KEY(`id`), FOREIGN KEY(`question_id`) REFERENCES `questions`(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"3042562390525ff4178f8ebf1f9722db\")");
      }

      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `users`");
        _db.execSQL("DROP TABLE IF EXISTS `questions`");
        _db.execSQL("DROP TABLE IF EXISTS `options`");
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
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsUsers = new HashMap<String, TableInfo.Column>(4);
        _columnsUsers.put("created_at", new TableInfo.Column("created_at", "TEXT", false, 0));
        _columnsUsers.put("id", new TableInfo.Column("id", "INTEGER", false, 1));
        _columnsUsers.put("name", new TableInfo.Column("name", "TEXT", false, 0));
        _columnsUsers.put("updated_at", new TableInfo.Column("updated_at", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUsers = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUsers = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUsers = new TableInfo("users", _columnsUsers, _foreignKeysUsers, _indicesUsers);
        final TableInfo _existingUsers = TableInfo.read(_db, "users");
        if (! _infoUsers.equals(_existingUsers)) {
          throw new IllegalStateException("Migration didn't properly handle users(com.mvvmdemo.data.model.db.User).\n"
                  + " Expected:\n" + _infoUsers + "\n"
                  + " Found:\n" + _existingUsers);
        }
        final HashMap<String, TableInfo.Column> _columnsQuestions = new HashMap<String, TableInfo.Column>(5);
        _columnsQuestions.put("created_at", new TableInfo.Column("created_at", "TEXT", false, 0));
        _columnsQuestions.put("id", new TableInfo.Column("id", "INTEGER", false, 1));
        _columnsQuestions.put("question_img_url", new TableInfo.Column("question_img_url", "TEXT", false, 0));
        _columnsQuestions.put("question_text", new TableInfo.Column("question_text", "TEXT", false, 0));
        _columnsQuestions.put("updated_at", new TableInfo.Column("updated_at", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysQuestions = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesQuestions = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoQuestions = new TableInfo("questions", _columnsQuestions, _foreignKeysQuestions, _indicesQuestions);
        final TableInfo _existingQuestions = TableInfo.read(_db, "questions");
        if (! _infoQuestions.equals(_existingQuestions)) {
          throw new IllegalStateException("Migration didn't properly handle questions(com.mvvmdemo.data.model.db.Question).\n"
                  + " Expected:\n" + _infoQuestions + "\n"
                  + " Found:\n" + _existingQuestions);
        }
        final HashMap<String, TableInfo.Column> _columnsOptions = new HashMap<String, TableInfo.Column>(6);
        _columnsOptions.put("created_at", new TableInfo.Column("created_at", "TEXT", false, 0));
        _columnsOptions.put("id", new TableInfo.Column("id", "INTEGER", false, 1));
        _columnsOptions.put("is_correct", new TableInfo.Column("is_correct", "INTEGER", true, 0));
        _columnsOptions.put("option_text", new TableInfo.Column("option_text", "TEXT", false, 0));
        _columnsOptions.put("question_id", new TableInfo.Column("question_id", "INTEGER", false, 0));
        _columnsOptions.put("updated_at", new TableInfo.Column("updated_at", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysOptions = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysOptions.add(new TableInfo.ForeignKey("questions", "NO ACTION", "NO ACTION",Arrays.asList("question_id"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesOptions = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoOptions = new TableInfo("options", _columnsOptions, _foreignKeysOptions, _indicesOptions);
        final TableInfo _existingOptions = TableInfo.read(_db, "options");
        if (! _infoOptions.equals(_existingOptions)) {
          throw new IllegalStateException("Migration didn't properly handle options(com.mvvmdemo.data.model.db.Option).\n"
                  + " Expected:\n" + _infoOptions + "\n"
                  + " Found:\n" + _existingOptions);
        }
      }
    }, "3042562390525ff4178f8ebf1f9722db");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "users","questions","options");
  }

  @Override
  public OptionDao optionDao() {
    if (_optionDao != null) {
      return _optionDao;
    } else {
      synchronized(this) {
        if(_optionDao == null) {
          _optionDao = new OptionDao_Impl(this);
        }
        return _optionDao;
      }
    }
  }

  @Override
  public QuestionDao questionDao() {
    if (_questionDao != null) {
      return _questionDao;
    } else {
      synchronized(this) {
        if(_questionDao == null) {
          _questionDao = new QuestionDao_Impl(this);
        }
        return _questionDao;
      }
    }
  }

  @Override
  public UserDao userDao() {
    if (_userDao != null) {
      return _userDao;
    } else {
      synchronized(this) {
        if(_userDao == null) {
          _userDao = new UserDao_Impl(this);
        }
        return _userDao;
      }
    }
  }
}
