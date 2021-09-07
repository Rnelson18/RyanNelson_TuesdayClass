public class Example3 {
    public static void main(String[] args){
        var studentNames =  new ArrayList<String>();
        var reader = new Scanner(System.in);
        var userResponse = "";
        while(!userResponse.equals("done")){
            System.out.println("Enter next name or 'done' tp end:");
            userResponse = reader.nextLine();
            if (userResponse.equals("done")){
                studentNames.add(userResponse);
            }
        }
    }
}
