import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Listing {

  public void ListTheList(String[] args) {

    try {
      Path filePath = Paths.get("ToDoList.txt");
      List<String> lines = Files.readAllLines(filePath);
      for (int i = 0; i < lines.size(); i++) {
        System.out.println(lines.get(i));
      }
    } catch (Exception e) {
      System.out.println("File is empty");
    }
  }
}
