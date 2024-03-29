import java.io.File;

public class SimpleReadFile {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.err.println("Usage:<directory>");
            System.exit(1);
        }

        // パスを取得する
        String directoryPath = args[0];

        // ディレクトリを表す File オブジェクトを作成します。
        File directory = new File(directoryPath);

        // ディレクトリが存在するかを確認
        if (!directory.exists() || !directory.isDirectory()) {
            System.err.println("Directory not found: " + directoryPath);
            System.exit(1);
        }

        // ディレクトリ内のファイルのリストを取得する
        File[] files = directory.listFiles();

        // 出力ファイルリスト
        System.out.println("Files in directory " + directoryPath + ":");

        // ファイルリストを繰り返し処理し、ファイル名を出力します
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}