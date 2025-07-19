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
    public static void main(String[] args) {
        System.out.println(check_pal("HmHa"));
    }
}
