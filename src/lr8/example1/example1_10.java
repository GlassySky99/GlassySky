package lr8.example1;

import java.io.*;

public class example1_10
{
    public static void main(String[] args)
    {
        BufferedReader br = null;
        PrintWriter out = null;
        try
        {
            br = new BufferedReader(new InputStreamReader(
                    new FileInputStream("C://Users//GlassySky//Desktop//lr8//ex1//ex10//MyFile1.txt"),
                    "cp1251"));
            out = new PrintWriter("C://Users//GlassySky//Desktop//lr8//ex1//ex10//MyFile2.txt", "cp1251");

            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null)
            {
                lineCount++;
                out.println(lineCount + ": " + s);
            }
        }
        catch (IOException e)
        {
            System.out.println("Ошибка !!!!!!!!");
        }
        finally
        {
            out.flush();
            out.close();
        }
    }
}
