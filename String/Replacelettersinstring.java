class Replacelettersinstring{
    public static void main(String[] args) {
        String str = "eabceifg";
        String result = " ";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'e'){
                result += 'i';
            }else{
                result += str.charAt(i);
            }
        }
        System.out.println(result);

        String email = "harshalc562@gmail.com";
        String username = "";
        for(int i = 0; i < email.length(); i++){
            if(email.charAt(i) == '@'){
                break;
            }
            else{
                username += email.charAt(i);
            }
        }
        System.out.println(username);
    }
}