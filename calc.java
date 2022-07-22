import java.util.Scanner;

public class calc {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("簡易式計算機");
        System.out.println("1. 足し算");
        System.out.println("2. 引き算");
        System.out.println("3. 掛け算");
        System.out.println("4. 割り算");
        System.out.println("計算をするには1, 2, 3, 4いずれの中からお選びください");
        System.out.println("また、終了するにはCtrl + cキーを押してください。");
        double hyoji = scanner.nextDouble();
        if (hyoji == 1) {
        System.out.println("足される数を入力してください");
        double a = scanner.nextDouble();
        System.out.println("足す数を入力してください");
        double b = scanner.nextDouble();
        System.out.println("答えは" + (a+b) + "です");
        }
        if (hyoji == 2) {
            System.out.println("引かれる数を入力してください");
            double c = scanner.nextDouble();
            System.out.println("引く数を入力してください");
            double d = scanner.nextDouble();
            System.out.println("答えは" + (c-d) + "です");
        }
        if (hyoji == 3) {
            System.out.println("掛けられる数を入力してください");
            double e = scanner.nextDouble();
            System.out.println("掛ける数を入力してください");
            double f = scanner.nextDouble();
            System.out.println("答えは" + (e*f) + "です");
        }
        if (hyoji == 4) {
            System.out.println("割られる数を入力してください");
            double g = scanner.nextDouble();
            System.out.println("割る数を入力してください");
            double h = scanner.nextDouble();
            System.out.println("答えは" + (g/h) + "です");
        }
        if (hyoji >= 5) {
            System.out.println("参照エラーが発生しました。プログラムを終了します。");
        }
        if (hyoji <= 0) {
            System.out.println("参照エラーが発生しました。プログラムを終了します。");
            
        }
        scanner.close();
    }
    public static void ret() {
        calc.main();
    }
    private static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("簡易式計算機");
        System.out.println("1. 足し算");
        System.out.println("2. 引き算");
        System.out.println("3. 掛け算");
        System.out.println("4. 割り算");
        System.out.println("計算をするには1, 2, 3, 4いずれの中からお選びください");
        System.out.println("また、終了するにはCtrl + cキーを押してください。");
        double hyoji = scanner.nextDouble();
        if (hyoji == 1) {
        System.out.println("足される数を入力してください");
        double a = scanner.nextDouble();
        System.out.println("足す数を入力してください");
        double b = scanner.nextDouble();
        System.out.println("答えは" + (a+b) + "です");
        }
        if (hyoji == 2) {
            System.out.println("引かれる数を入力してください");
            double c = scanner.nextDouble();
            System.out.println("引く数を入力してください");
            double d = scanner.nextDouble();
            System.out.println("答えは" + (c-d) + "です");
        }
        if (hyoji == 3) {
            System.out.println("掛けられる数を入力してください");
            double e = scanner.nextDouble();
            System.out.println("掛ける数を入力してください");
            double f = scanner.nextDouble();
            System.out.println("答えは" + (e*f) + "です");
        }
        if (hyoji == 4) {
            System.out.println("割られる数を入力してください");
            double g = scanner.nextDouble();
            System.out.println("割る数を入力してください");
            double h = scanner.nextDouble();
            System.out.println("答えは" + (g/h) + "です");
        }
        if (hyoji >= 5) {
            System.out.println("参照エラーが発生しました。プログラムを終了します。");
        }
        if (hyoji <= 0) {
            System.out.println("参照エラーが発生しました。プログラムを終了します。");
        }
        scanner.close();
    }
}