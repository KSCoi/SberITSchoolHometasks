package HomeTasks.Lection13.Zadanie2;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class TreePaths2 {


    public  String name;
    public final File file;
    public static final String vertical = (char)0x2502 +"   ";
    public TreePaths2(String name, File file )
    {
        this.name = name;
        this.file = file;
    }

    public String toString()
    {
        return name + file.getName();
    }


    public static void main(String[] args)
    {

        String path = System.getProperty("user.dir");
        File dir = new File(path);
        if (!dir.exists() || !dir.isDirectory())
        {
            System.out.println("Incorrect directory name");
        }
        Deque<TreePaths2> stack = new ArrayDeque<>();
        stack.add(new TreePaths2("", dir));
        while (!stack.isEmpty())
        {
            TreePaths2 element = stack.pollLast();
            System.out.println(element);
            if (element.file.isDirectory())
            {
                File[] files = element.file.listFiles();
                for (int i = files.length - 1; i >=0; i--)
                {
                    TreePaths2 elem = new TreePaths2(element.name + vertical, files[i]);
                    stack.add(elem);

                }

            }
        }
    }


}
