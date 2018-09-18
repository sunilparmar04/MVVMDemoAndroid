package com.mvvmdemo.data.local.db.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import com.mvvmdemo.data.model.db.Question;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class QuestionDao_Impl implements QuestionDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfQuestion;

  public QuestionDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfQuestion = new EntityInsertionAdapter<Question>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `questions`(`created_at`,`id`,`question_img_url`,`question_text`,`updated_at`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Question value) {
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
        if (value.imgUrl == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.imgUrl);
        }
        if (value.questionText == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.questionText);
        }
        if (value.updatedAt == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.updatedAt);
        }
      }
    };
  }

  @Override
  public void insert(Question question) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfQuestion.insert(question);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(List<Question> questions) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfQuestion.insert(questions);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Question> loadAll() {
    final String _sql = "SELECT * FROM questions";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfCreatedAt = _cursor.getColumnIndexOrThrow("created_at");
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfImgUrl = _cursor.getColumnIndexOrThrow("question_img_url");
      final int _cursorIndexOfQuestionText = _cursor.getColumnIndexOrThrow("question_text");
      final int _cursorIndexOfUpdatedAt = _cursor.getColumnIndexOrThrow("updated_at");
      final List<Question> _result = new ArrayList<Question>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Question _item;
        _item = new Question();
        _item.createdAt = _cursor.getString(_cursorIndexOfCreatedAt);
        if (_cursor.isNull(_cursorIndexOfId)) {
          _item.id = null;
        } else {
          _item.id = _cursor.getLong(_cursorIndexOfId);
        }
        _item.imgUrl = _cursor.getString(_cursorIndexOfImgUrl);
        _item.questionText = _cursor.getString(_cursorIndexOfQuestionText);
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
