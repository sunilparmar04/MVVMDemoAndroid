package com.mvvmdemo.data.local.db.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import com.mvvmdemo.data.model.db.Option;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class OptionDao_Impl implements OptionDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfOption;

  public OptionDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfOption = new EntityInsertionAdapter<Option>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `options`(`created_at`,`id`,`is_correct`,`option_text`,`question_id`,`updated_at`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Option value) {
        if (value.createdAt == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.createdAt);
        }
        if (value.id == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.id);
        }
        final int _tmp;
        _tmp = value.isCorrect ? 1 : 0;
        stmt.bindLong(3, _tmp);
        if (value.optionText == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.optionText);
        }
        if (value.questionId == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.questionId);
        }
        if (value.updatedAt == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.updatedAt);
        }
      }
    };
  }

  @Override
  public void insert(Option option) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfOption.insert(option);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(List<Option> options) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfOption.insert(options);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Option> loadAll() {
    final String _sql = "SELECT * FROM options";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfCreatedAt = _cursor.getColumnIndexOrThrow("created_at");
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfIsCorrect = _cursor.getColumnIndexOrThrow("is_correct");
      final int _cursorIndexOfOptionText = _cursor.getColumnIndexOrThrow("option_text");
      final int _cursorIndexOfQuestionId = _cursor.getColumnIndexOrThrow("question_id");
      final int _cursorIndexOfUpdatedAt = _cursor.getColumnIndexOrThrow("updated_at");
      final List<Option> _result = new ArrayList<Option>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Option _item;
        _item = new Option();
        _item.createdAt = _cursor.getString(_cursorIndexOfCreatedAt);
        if (_cursor.isNull(_cursorIndexOfId)) {
          _item.id = null;
        } else {
          _item.id = _cursor.getLong(_cursorIndexOfId);
        }
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsCorrect);
        _item.isCorrect = _tmp != 0;
        _item.optionText = _cursor.getString(_cursorIndexOfOptionText);
        if (_cursor.isNull(_cursorIndexOfQuestionId)) {
          _item.questionId = null;
        } else {
          _item.questionId = _cursor.getLong(_cursorIndexOfQuestionId);
        }
        _item.updatedAt = _cursor.getString(_cursorIndexOfUpdatedAt);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Option> loadAllByQuestionId(Long questionId) {
    final String _sql = "SELECT * FROM options WHERE question_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (questionId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, questionId);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfCreatedAt = _cursor.getColumnIndexOrThrow("created_at");
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfIsCorrect = _cursor.getColumnIndexOrThrow("is_correct");
      final int _cursorIndexOfOptionText = _cursor.getColumnIndexOrThrow("option_text");
      final int _cursorIndexOfQuestionId = _cursor.getColumnIndexOrThrow("question_id");
      final int _cursorIndexOfUpdatedAt = _cursor.getColumnIndexOrThrow("updated_at");
      final List<Option> _result = new ArrayList<Option>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Option _item;
        _item = new Option();
        _item.createdAt = _cursor.getString(_cursorIndexOfCreatedAt);
        if (_cursor.isNull(_cursorIndexOfId)) {
          _item.id = null;
        } else {
          _item.id = _cursor.getLong(_cursorIndexOfId);
        }
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsCorrect);
        _item.isCorrect = _tmp != 0;
        _item.optionText = _cursor.getString(_cursorIndexOfOptionText);
        if (_cursor.isNull(_cursorIndexOfQuestionId)) {
          _item.questionId = null;
        } else {
          _item.questionId = _cursor.getLong(_cursorIndexOfQuestionId);
        }
        _item.updatedAt = _cursor.getString(_cursorIndexOfUpdatedAt);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
