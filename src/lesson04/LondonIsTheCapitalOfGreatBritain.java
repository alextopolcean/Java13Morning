package lesson04;

public class LondonIsTheCapitalOfGreatBritain {
    public static void main(String[] args) {
        String articleTitle = "london is the capital of grate britain";
        articleTitle = articleTitle.toUpperCase();
        System.out.println(articleTitle);

        articleTitle = articleTitle.toLowerCase();
        System.out.println(articleTitle);

        articleTitle = articleTitle.substring(0, 1).toUpperCase() +articleTitle.substring(1) + articleTitle.toLowerCase();
        System.out.println(articleTitle);

    }
}
