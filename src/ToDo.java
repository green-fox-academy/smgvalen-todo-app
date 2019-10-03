import java.util.List;

public class ToDo {

  public static void main(String[] args) {

    if (args.length == 0) {

      System.out.println("Command Line Todo application");
      System.out.println("=============================");
      System.out.println("                                ");
      System.out.println("Command line arguments:");
      System.out.println("    -l   Lists all the tasks");
      System.out.println("    -a   Adds a new task");
      System.out.println("    -r   Removes an task");
      System.out.println("    -c   Completes an task");

    }

    if ("-a".equals(args[0])){

      ToDoTask newToDoTask = new ToDoTask();
      newToDoTask.createNewTask(args);
    }

    if ("-l".equals(args[0])){

      Listing listing = new Listing();
      listing.ListTheList(args);
    }
  }
}

/*  public static void manipulateFile () {
    ArrayList<Task> tasksList = new ArrayList<>();
    Task firstTask = new Task("Walk the dog");
    Task secondTask = new Task("Buy milk");
    Task thirdTask = new Task("Do homework");
    Task fourthTask = new Task("Watch Horace and Pete");

    tasksList.add(firstTask);
    tasksList.add(secondTask);
    tasksList.add(thirdTask);
    tasksList.add(fourthTask);



    try {
      Path storagePath = Paths.get("src/Tasks.txt");

      Files.write(storagePath, tasksList);
      System.out.println();


    } catch (Exception e) {
      e.printStackTrace();
    }
   // for (Task task : tasksList) {
     // System.out.println(task.taskDescription);
    // }
  }

  //Given the terminal opened in the project directory
  //And the file where you store your data
  //And a task with the description Walk the dog stored in the file
  //And a task with the description Buy milk stored in the file
  //And a task with the description Do homework stored in the file
  //When the application is ran with -l argument
  //Then it should print the tasks that are stored in the file
  //And it should add numbers before each


} */

