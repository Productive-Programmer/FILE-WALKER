import java.io.File;

class FileWalker {
    public void walk(String path, String ext) {
        File root = new File(path);
        File[] list = root.listFiles();
        if (list == null) {
            return;
        }
        for (File f : list) {
            if (f.isDirectory()) {
                walk(f.getAbsolutePath(), ext);
            } else {
                String s = f.toString();
                if (s.endsWith(ext) || s.endsWith(ext.toUpperCase())) {
                    System.out.println("File" + f.getAbsolutePath());
                }
            }
        }
    }
}

public class main {
    public static void main(String[] args) {
        FileWalker fw = new FileWalker();
        fw.walk("F:\\", "pdf");
    }
}

