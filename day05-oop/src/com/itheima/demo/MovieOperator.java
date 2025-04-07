package com.itheima.demo;

public class MovieOperator {
    private Movie[] movies;

    public MovieOperator() {}
    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }
    //输入编号查找电影
    public void findMovieById(int id) {
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getId() == id) {
                System.out.println("找到电影：");
                System.out.println(movies[i].getName());
                return;
            }
        }
        System.out.println("没有找到电影");

    }


    //打印全部电影信息
    public void printMovieInfo() {
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i].getId()+" "+movies[i].getName()+" "+movies[i].getPrice()+" "+movies[i].getActor());
        }
    }
}
