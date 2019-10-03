import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.rmi.server.ExportException;
import java.util.ArrayList;
import java.util.List;

public class ToDoTask {

  public void createNewTask(String[] args) {

    try {
      Path filePath = Paths.get("ToDoList.txt");
      List<String> content = Files.readAllLines(filePath);
      for (int i = 1; i < args.length; i++) {
        content.add(args[i]);
      }
      Files.write(filePath, content);

    } catch (Exception e) {
      System.out.println("ERROR");
    }
  }
}


