import java.util.Scanner;

public class ToDoListApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();
        boolean running = true;

        while (running) {
            System.out.println("\nTo-Do List Application");
            System.out.println("1. Add a task");
            System.out.println("2. Mark a task as completed");
            System.out.println("3. Remove a task");
            System.out.println("4. Display all tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter the task description: ");
                    String description = scanner.nextLine();
                    toDoList.addTask(description);
                    break;
                case 2:
                    System.out.print("Enter the task number to mark as completed: ");
                    int completeIndex = scanner.nextInt() - 1;
                    toDoList.markTaskAsCompleted(completeIndex);
                    break;
                case 3:
                    System.out.print("Enter the task number to remove: ");
                    int removeIndex = scanner.nextInt() - 1;
                    toDoList.removeTask(removeIndex);
                    break;
                case 4:
                    toDoList.displayTasks();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
