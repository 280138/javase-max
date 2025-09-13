package com.itheima.demo8test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieService {
    //4、准备一个集合容器
      private static List<Movie> movies = new ArrayList<>();
    //private static     int       a     =  21;
    private static Scanner sc = new Scanner(System.in);
    public void start() {
        while (true) {
            //3、准备操作界面:GUI界面/cmd命令做
            System.out.println("===电影信息操作系统===");
            System.out.println("1.上架");
            System.out.println("2.下架电影");
            System.out.println("3.查询电影");
            System.out.println("4.封杀明星");
            System.out.println("5.退出");
            System.out.println("6.展示全部电影");
            System.out.println("请您输入操作命令：");
            String command = sc.next();
            switch (command) {
                case "1":
                    addMovie();
                    break;
                case "2":
//                    deleteMovie();
                    break;
                case "3":
                    queryMovie();
                    break;
                case "4":
                    deleteStar();
                    break;
                case "5":
                    System.out.println("退出系统！");
                    return;
                case "6":
                    queryAllMovie();
                    break;
                default:
                    System.out.println("输入有误，请重新输入！");
            }
        }

    }

    /**
     * 展示全部电影
     */
    private void queryAllMovie() {
        System.out.println("===展示全部电影===");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    /**
     * 封杀明星
     */
    private void deleteStar() {
        System.out.println("===封杀明星===");
        System.out.println("请输入要封杀的明星名称：");
        String star = sc.next();

        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            if (movie.getActor().contains(star)) {
                movies.remove(i);
                System.out.println("封杀成功！");
                i--;//并发修改异常，退一步
            }
        }
        //展示全部电影
        queryAllMovie();
    }

    /**
     * 根据电影名称查询某部电影对象展示出来
     */
    private void queryMovie() {
        System.out.println("===查询电影===");
        System.out.println("请输入电影名称：");
        String name = sc.next();
        //根据电影名称查询电影对象返回，展示这个对象数据
        Movie movie = queryMovieByName(name);
        if (movie != null) {
            System.out.println(movie);
        }else{
            System.out.println("没有找到该电影！");
        }
    }

    //根据电影名称查询电影对象返回
    public Movie queryMovieByName(String name) {
        for (Movie m : movies) {
            if (m.getName().equals(name)) {
                return m;
            }
        }
        return null;//没有找到这个电影对象
    }

    /**
     * 上架
     */
    private void addMovie() {
        System.out.println("===上架电影====");
        //分析：每点击一次上架电影，其实就是新增一部电影。每部电影是一个电影对象封装数据的
        //1、创建电影对象，封装这部电影信息
        Movie movie = new Movie();
        //2、给电影对象注入数据
        System.out.println("请输入电影名称：");
        movie.setName(sc.next());
        System.out.println("请输入电影主演：");
        movie.setActor(sc.next());
        System.out.println("请输入电影价格：");
        movie.setPrice(sc.nextDouble());
        System.out.println("请输入电影评分：");
        movie.setScore(sc.nextDouble());

        //3、把电影对象添加到集合中
        movies.add(movie);
        System.out.println("上架成功！");
        queryAllMovie();
    }
}
