package lesson19;

public class Main {
    public static void main(String[] args) {
/*        ProcessHandle ph = ProcessHandle.current();
        System.out.println(ph.pid());*/

        String name = "asdad";
        var a = "Hello";
        var num = 1;
        System.out.println("Hello group c36!!");

        String notBlock = "<html>"
        + "  <div>"
        + "  <div>"
        + "<html>";

        String block = """
                <html>  1
                    <div>
                        Hello
                    </div>
                </html>    
                """;
        System.out.println(block);

        //Record
        NewRecord newRecord = new NewRecord("Sergey", 13);
        System.out.println(newRecord);
    }
}
