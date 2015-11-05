package com.star.sqlitewithlitepal;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.litepal.tablemanager.Connector;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SQLiteDatabase sqLiteDatabase = Connector.getDatabase();

//        存储一条数据到news表当中
//        News news = new News();
//        news.setTitle("这是一条新闻标题");
//        news.setContent("这是一条新闻内容");
//        news.setPublishedDate(new Date());
//        Log.d("TAG", "news id is " + news.getId());
//        news.save();
//        Log.d("TAG", "news id is " + news.getId());
        //////////////////////////////

//        先是存储了一条comment1数据，然后存储一条comment2数据
//        接着在存储News之前先把刚才的两个Comment对象添加到了News的commentList列表当中
//        这样就表示这两条Comment是属于这个News对象的
//        最后再把News存储到数据库中，这样它们之间的关联关系就会自动建立了
//        Comment comment1 = new Comment();
//        comment1.setContent("好评！");
//        comment1.setPublishedDate(new Date());
//        comment1.save();
//
//        Comment comment2 = new Comment();
//        comment2.setContent("赞一个");
//        comment2.setPublishedDate(new Date());
//        comment2.save();
//
//        News news = new News();
//        news.getCommentList().add(comment1);
//        news.getCommentList().add(comment2);
//        news.setTitle("第二条新闻标题");
//        news.setContent("第二条新闻内容");
//        news.setPublishedDate(new Date());
//        news.setCommentCount(news.getCommentList().size());
//        news.save();
        //////////////////////////////

//        把news表中id为2的记录的标题改成“今日iPhone6发布”
//        ContentValues contentValues = new ContentValues();
//        contentValues.put("title", "今日iPhone6发布");
//        DataSupport.update(News.class, contentValues, 2);
        //////////////////////////////

//        把news表中标题为“今日iPhone6发布”的所有新闻的标题改成“今日iPhone6 Plus发布”
//        ContentValues contentValues = new ContentValues();
//        contentValues.put("title", "今日iPhone6 Plus发布");
//        DataSupport.updateAll(News.class, contentValues, "title = ?", "今日iPhone6发布");
        //////////////////////////////

//        倒回
//        ContentValues contentValues = new ContentValues();
//        contentValues.put("title", "今日iPhone6发布");
//        DataSupport.updateAll(News.class, contentValues, "title = ?", "今日iPhone6 Plus发布");
        //////////////////////////////

//        把news表中标题为“今日iPhone6发布”且评论数量大于0的所有新闻的标题改成“今日iPhone6 Plus发布”
//        ContentValues contentValues = new ContentValues();
//        contentValues.put("title", "今日iPhone6 Plus发布");
//        DataSupport.updateAll(News.class, contentValues, "title = ? and commentCount > ?",
//                "今日iPhone6发布", "0");
        //////////////////////////////

//        倒回
//        ContentValues contentValues = new ContentValues();
//        contentValues.put("title", "第二条新闻标题");
//        DataSupport.updateAll(News.class, contentValues, "title = ?", "今日iPhone6 Plus发布");
        //////////////////////////////

//        把news表中所有新闻的标题都改成“今日iPhone6发布”
//        ContentValues contentValues = new ContentValues();
//        contentValues.put("title", "今日iPhone6发布");
//        DataSupport.updateAll(News.class, contentValues);
        //////////////////////////////

//        倒回
//        ContentValues contentValues = new ContentValues();
//        contentValues.put("title", "这是一条新闻标题");
//        DataSupport.update(News.class, contentValues, 1);
//        contentValues.put("title", "第二条新闻标题");
//        DataSupport.update(News.class, contentValues, 2);
        //////////////////////////////

//        把news表中id为2的记录的标题改成“今日iPhone6发布”
//        News updatedNews = new News();
//        updatedNews.setTitle("今日iPhone6发布");
//        updatedNews.update(2);
        //////////////////////////////

//        想把news表中标题为“今日iPhone6发布”且评论数量大于0的所有新闻的标题改成“今日iPhone6 Plus发布”
//        News updatedNews = new News();
//        updatedNews.setTitle("今日iPhone6 Plus发布");
//        updatedNews.updateAll("title = ? and commentCount > ?", "今日iPhone6发布", "0");
        //////////////////////////////

//        删除news表中id为2的记录
//        不仅仅会将news表中id为2的记录删除，同时还会将其它表中以news id为2的这条记录作为外键的数据一起删除掉
//        int deletedCount = DataSupport.delete(News.class, 2);
//        Log.d("TAG", "delete count is " + deletedCount);
        //////////////////////////////

//        倒回
//        Comment comment1 = new Comment();
//        comment1.setContent("好评！");
//        comment1.setPublishedDate(new Date());
//        comment1.save();
//
//        Comment comment2 = new Comment();
//        comment2.setContent("赞一个");
//        comment2.setPublishedDate(new Date());
//        comment2.save();
//
//        News news = new News();
//        news.getCommentList().add(comment1);
//        news.getCommentList().add(comment2);
//        news.setTitle("第二条新闻标题");
//        news.setContent("第二条新闻内容");
//        news.setPublishedDate(new Date());
//        news.setCommentCount(news.getCommentList().size());
//        news.save();
        //////////////////////////////

//        把news表中所有新闻的标题都改成“今日iPhone6发布”
//        News updatedNews = new News();
//        updatedNews.setTitle("今日iPhone6发布");
//        updatedNews.updateAll();
        //////////////////////////////

//        把news表中标题为“今日iPhone6发布”且评论数等于0的所有新闻都删除掉
//        DataSupport.deleteAll(News.class, "title = ? and commentCount = ?",
//                "今日iPhone6发布", "0");
        //////////////////////////////

//        把news表中所有的数据全部删除掉
//        不仅仅会将news表中的记录删除，同时还会将其它表中以news id作为外键的数据一起删除掉
//        DataSupport.deleteAll(News.class);
        //////////////////////////////

//        任何一个继承自DataSupport类的实例都可以通过调用delete()这个实例方法来删除数据
//        但前提是这个对象一定是要持久化之后的，一个非持久化的对象如果调用了delete()方法则不会产生任何效果
//        如果我们之前将这个对象持久化过了，那么再调用delete()方法就会把这个对象对应的数据删除掉了
//        一个对象如果save过了之后，那就是持久化的了
//        除了调用save()方法之外，通过DataSupport中提供的查询方法从数据库中查出来的对象也是经过持久化的
//        DataSupport类中提供了一个isSaved()方法，
//        这个方法返回true就表示该对象是经过持久化的，返回false则表示该对象未经过持久化
//        News news = new News();
//        news.setTitle("这是一条新闻标题");
//        news.setContent("这是一条新闻内容");
//        news.save();
//        Log.d("TAG", "saved is " + news.isSaved());
//
//        if (news.isSaved()) {
//            int deletedCount = news.delete();
//            Log.d("TAG", "delete count is " + deletedCount);
//        }
        //////////////////////////////

    }
}
