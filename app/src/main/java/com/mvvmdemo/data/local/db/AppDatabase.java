package com.mvvmdemo.data.local.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.mvvmdemo.data.local.db.dao.OptionDao;
import com.mvvmdemo.data.local.db.dao.QuestionDao;
import com.mvvmdemo.data.local.db.dao.UserDao;
import com.mvvmdemo.data.model.db.Option;
import com.mvvmdemo.data.model.db.Question;
import com.mvvmdemo.data.model.db.User;


@Database(entities = {User.class, Question.class, Option.class}, version = 2)
public abstract class AppDatabase extends RoomDatabase {

    public abstract OptionDao optionDao();

    public abstract QuestionDao questionDao();

    public abstract UserDao userDao();
}
