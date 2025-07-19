public class arr2d{

    //search in a sorted matrix
    public static void search_in_sorted_matrix(int matrix[][],int target){
        int row = 0;
        int col = matrix[0].length-1;

        while(row != matrix.length && col >=0){
            if(matrix[row][col] == target){
                System.out.println("The indices are i = "+row+" and j = "+col);
                break;
            }
            else if(matrix[row][col] < target){
                row++;
            }

            else{
                col--;
            }
        }
    }

    //substring
    public static StringBuilder substring(String str,int si,int ei){
        StringBuilder result = new StringBuilder("");
        for(int i = si; i<ei;i++){
            result.append(str.charAt(i));
        }
        return result;
    }

    //string compression
    public static StringBuilder string_compression(String str){
        StringBuilder ans = new StringBuilder("");
        int count = 1;
        for(int i = 0;i<str.length();i++){
            ans.append(str.charAt(i));
            while(i != str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            if(count != 1){
                ans.append(count);
                count = 1;
            }
        }
        return ans;
    }

    //check if a string is a palindrome or not
    public static boolean check_pal(String str){
        int first = 0;
        int last = str.length()-1;
        boolean ans = false;
        while(first<last){
            if(str.charAt(first) == str.charAt(last)){
                first++;
                last--;
                ans = true;
            }
            else{
                ans = false;
                break;
            }
        }
        return ans;
    }

    public static double shortest_path(String str){
        int x = 0;
        int y = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == 'W'){
                x -= 1;
            }
            else if(str.charAt(i) == 'E'){
                x += 1;
            }
            else if(str.charAt(i) == 'N'){
                y += 1;
            }
            else{
                y -= 1;
            }
        }
        double displacement = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        return displacement;
    }

    //determine if two strings are anagrams of each other
    public static boolean check_anagram(String str,String str2){
        int ans = 0;
        str = str.toLowerCase();
        str2 = str2.toLowerCase();
        if(str.length() == str2.length()){
            for(int i = 0;i<str.length();i++){
                ans  = ans ^ (str.charAt(i)^str2.charAt(i));
            }
        }
        if(ans == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(check_anagram("naft", "fanf"));
    }
}
