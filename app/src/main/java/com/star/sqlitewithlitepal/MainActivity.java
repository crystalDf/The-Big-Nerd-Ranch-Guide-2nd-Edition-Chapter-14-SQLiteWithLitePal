package com.star.sqlitewithlitepal;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.star.sqlitewithlitepal.model.Comment;
import com.star.sqlitewithlitepal.model.News;

import org.litepal.crud.DataSupport;
import org.litepal.tablemanager.Connector;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SQLiteDatabase sqLiteDatabase = Connector.getDatabase();

//        News news = new News();
//        news.setTitle("这是一条新闻标题");
//        news.setContent("这是一条新闻内容");
//        news.setPublishedDate(new Date());
//        Log.d("TAG", "news id is " + news.getId());
//        news.save();
//        Log.d("TAG", "news id is " + news.getId());

        Comment comment1 = new Comment();
        comment1.setContent("好评！");
        comment1.setPublishedDate(new Date());
        comment1.save();

        Comment comment2 = new Comment();
        comment2.setContent("赞一个");
        comment2.setPublishedDate(new Date());
        comment2.save();

        News news = new News();
        news.getCommentList().add(comment1);
        news.getCommentList().add(comment2);
        news.setTitle("第二条新闻标题");
        news.setContent("第二条新闻内容");
        news.setPublishedDate(new Date());
        news.setCommentCount(news.getCommentList().size());
        news.save();
    }
}
