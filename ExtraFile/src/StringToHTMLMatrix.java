public class StringToHTMLMatrix {
    public static void main(String[] args) {
        String input = "1,2,3,4,5,6,7,8,9";
        int rows = 3;
        int cols = 3;

        String[] values = input.split(",");

        if (values.length != rows * cols) {
            System.out.println("Invalid input dimensions");
            return;
        }

        System.out.println("<html>");
        System.out.println("<body>");
        System.out.println("<table border=\"1\">");
        int index = 0;
        for (int i = 0; i < rows; i++) {
            System.out.println("<tr>");
            for (int j = 0; j < cols; j++) {
                System.out.println("<td>" + values[index] + "</td>");
                index++;
            }
            System.out.println("</tr>");
        }
        System.out.println("</table>");
        System.out.println("</body>");
        System.out.println("</html>");
    }
}
