//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) { //psvm
        ApiClient api = new ApiClient();
        System.out.println(api.fetchQuestions(5,"easy","multiple")); //sout
    }
}